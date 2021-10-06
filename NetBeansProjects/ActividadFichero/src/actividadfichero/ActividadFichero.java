/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfichero;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class ActividadFichero {
    
    
    public static void main(String[] args) throws IOException {
       
        
    int opcion = -1;
    Scanner teclado = new Scanner(System.in);
    while (opcion != 0); {
        try {
            System.out.println("Escoja una opcion: \n"
            +"1. Crear directorio.\n"
            +"2. Crear un Fichero.\n"
            +"3. Información del Fichero.\n"
            +"4. Lista de Ficheros del Directorio.\n"
            +"5. Copiar Fichero.\n"
            +"6. Mover Fichero.\n"
            +"7. Borrar Directorio.\n"
            +"8. Leer Fichero.\n"        
            +"9. Leer Ficher(BufferedReader).\n"
            +"10. Escribir Fichero.\n"
            +"11. Escribir Fichero(BufferedWriter).\n"
            +"12. ¡¡Salir!!.\n"        
                    
            );
           
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                    System.out.println(" CREANDO FICHERO...");
                    File dir = crearDir();
                    System.out.println("Informacion del directorio");
                    System.err.println("Nombre:" + dir.getName());
                    System.out.println("Ruta:" + dir.getAbsolutePath());
                    break;
                case 2:
                    System.out.println(" CREANDO FICHERO...");
                    crearFich();
                    break;
                    
                case 3:
                    System.out.println(" INFORMACIÓN DEL FICHERO...");
                    infoFichero();
                    break;
                    
                case 4: 
                    System.out.println("Lista de ficheros en el directorio");
                    listaDir();
                    break;
                
                case 5: 
                    System.out.println("Copiar Fichero");
                    copiarFich();
                    break;
                
                case 6: 
                    System.out.println("Mover Fichero");
                    moverFich();
                    break;
                    
                case 7: 
                    System.out.println("Borrar Directorio");
                    borrarDir(getDirPath(dirPath()));
                    break;    
                case 8: 
                    System.out.println("Leer Fichero");
                    leerFich();
                    break;
                case 9: 
                    System.out.println("Leer Fichero con BufferedReader");
                    leerFichBR();
                    break;
                case 10: 
                    System.out.println("Escribir en Fichero");
                    escrituraFich();
                    break;    
                case 11: 
                    System.out.println("Ecribir en Fichero con BufferedReader");
                    escrituraFichBR();
                    break; 
                case 0: 
                    System.out.println("Salir");
                    break;    
            }
               System.out.println("\n");
               
        } catch(IOException ex){
            System.out.println("Error:" + ex.getMessage());
        }   
      }
    }
    
    public static String setNomDir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre del directorio:");
        String t = teclado.nextLine();
        return t;
    }
    public static String setDir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre del directorio donde está el fichero");
        String t = teclado.nextLine();
        return ("C:\\Users\\royar\\Desktop\\" + t);
    }
    public static String getDirPath(File dir){
    String t = dir.getAbsolutePath();
    return t;
    }
    public static String setNomFich() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el Nombre del Fichero");
        String t = teclado.nextLine();
        return t;
        
    }
    
    public static File dirPath(){
      File dir = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
      if(!dir.exists()){
          if(dir.mkdirs()){
              System.out.println("El Directorio se ha creado!");
          } else{
              System.err.println("Ha ocurrido un error al crear el directorio");
          }
          } else{
              System.out.println("El directorio ya existe");    
          }
          return dir;
      
    }
    
    
    
    public static File crearDir(){
      File dir = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
      if(!dir.exists()){
          if(dir.mkdirs()){
              System.out.println("El Directorio se ha creado!");
          } else{
              System.err.println("Ha ocurrido un error al crear el directorio");}
          } else{
              System.out.println("El directorio ya existe");    
          }
          return dir;
    }
    
    public static File crearFich() throws FileNotFoundException{
        
        File dir = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
        File fich = new File(dir, setNomFich() + ".txt");
        
        try {
            if (fich.createNewFile()){
                System.out.println("El Fichero ha sido creado");
            }else if (fich.exists() == true){
                System.out.println("El Fihcero ya existe");
            }else if (!dir.exists()){
                System.out.println("Se está creando un nuevo directorio");
            crearDir();
            }
        } catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("\n");
        return fich;    
    }
    public static void infoFichero() throws FileNotFoundException{
        File dir = crearDir();
        File fich = crearFich();
        System.out.println("Informacion del Fichero en curso...");
        System.out.println("Nombre: " + fich.getName());
        System.out.println("Ruta del directorio:" + dir.getPath());
        System.out.println("Recreo: " + fich.getPath());
       System.out.println("\n");    
    }
    
    public static void listaDir(){
        System.out.println("Listado de de Ficheros en el Directorio");
        System.out.println(Arrays.toString(crearDir().listFiles()));
        System.out.println("\n");   
    }
    
    public static void copiarFich() throws IOException{
        System.out.println("Directorio de origen");
        File dir = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
        System.out.println("Directorio de destino");
        File dire = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
        File fich = new File(dir, setNomFich() + ".txt");
        System.out.println("Copiando el fichero " + crearFich().getName() + " al nuevo directorio");
        File origen = new File(crearDir(), crearFich().getName());
        File destino = new File(crearDir(), crearFich().getName());
    
        try{
            Files.copy(Paths.get(origen.getAbsolutePath()), Paths.get(destino.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Se ha copiado el fichero!!!");
        }catch(IOException ex){
            System.out.println("Error!" + ex.getMessage());
        }
        System.out.println("\n");
    }
    
    public static void moverFich() throws FileNotFoundException{
        System.out.println("Directorio de origen");
        File dir = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
        System.out.println("Directorio de destino");
        File dire = new File("C:\\Users\\royar\\Desktop\\" + setNomDir());
        File fich = new File(dir, setNomFich() + ".txt");
        System.out.println("Moviendo el fichero " + crearFich().getName() + " al nuevo directorio");
        File origen = new File(crearDir(), crearFich().getName());
        File destino = new File(crearDir(), crearFich().getName());
    
        try{
            Files.move(Paths.get(origen.getAbsolutePath()), Paths.get(destino.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Se ha movido el fichero!!!");
        }catch(IOException ex){
            System.out.println("Error!" + ex.getMessage());
        }
        System.out.println("\n");
    }
    
    
    
    public static void borrarDir(String paths){
    
    if (crearDir().listFiles().length == 0) {
    crearDir().delete();
        System.out.println("El directorio se ha borrado");
    }else {
    File borrarFich[] = crearDir().listFiles();
    int i = crearDir().listFiles().length;
    for (int j = 0; j < 1; j++){
        if(borrarFich[j].isDirectory()){
        borrarDir(borrarFich[j].getAbsolutePath());
        }
        borrarFich[j].delete();
    }
    }
        System.out.println("\n");
    
    }
    
    public static void leerFich(){
        
        System.out.println("Contenido del Fichero!");
        Scanner n = null;
        try{ 
            n = new Scanner(crearFich());
                while(n.hasNextLine()){
                    String linea = n.nextLine();
                    System.out.println("linea");
                }
        }catch (IOException ex) {
            System.out.println("Error!" + ex.getMessage());
        }finally {
        try{ 
            if (n != null) {
            n.close();
        }
        }catch (Exception ex){
                System.out.println("Errors!" + ex.getMessage());
                }
    }
        System.out.println("\n");
    }
    
    public static void leerFichBR() {
    File fich = new File(setDir(), setNomDir() + ".txt");
        System.out.println("Contenido del fichero!");
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader(fich);
            br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException ex) {
            System.out.println("Error!" + ex.getMessage());
        }finally {
            try{
                if (fr != null){
                fr.close();
                }
            }catch (IOException ex) {
                System.out.println("Errors" + ex.getMessage());
            }
        }
        System.out.println("\n");
    }
    
    
    
    public static void escrituraFich() throws FileNotFoundException, IOException {
    FileWriter fw = null;
    try{
        fw = new FileWriter(crearFich());
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre:");
        String letras = teclado.nextLine();
        fw.write("Nombre: " + letras + "\n");
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escriba su edad:");
        String letras2 = teclado2.nextLine();
        fw.write("Edad: " + letras2);
    }catch (IOException ex) {
    System.out.println("Error!" + ex.getMessage());
    }finally {
        if (fw != null) {
            fw.close();
        }
    }
    }
    
    
    
     public static void escrituraFichBR() throws FileNotFoundException, IOException {
    BufferedWriter bf = null;
    try{
        bf = new BufferedWriter(new FileWriter(crearFich()));
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre:");
        String letras = teclado.nextLine();
        bf.write("Nombre: " + letras + "\n");
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escriba su edad:");
        String letras2 = teclado2.nextLine();
        bf.write("Edad: " + letras2);
    }catch (IOException ex) {
    System.out.println("Error!" + ex.getMessage());
    }finally {
        if (bf != null) {
            bf.close();
        }
    }
    }

}
     