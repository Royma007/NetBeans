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
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class ActividadFichero {
    
    
    public static void main(String[] args) throws IOException {
        //    File directorio = new File("C:\\Users\\dam2\\Desktop\\Ficheros");
         //   File fichero = new File("C:\\Users\\dam2\\Desktop\\Ficheros\\prueba.txt");
        
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
                    
                /*case 3:
                    System.out.println(" INFORMACIÓN DEL FICHERO...");
                    infoFichero();
                    break;
                    
                case 4: 
                    System.out.println("actividadfichero.ActividadFichero.main()");
                    listaDir();
                    break;
               */     
                    
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
        return ("C:\\Users\\dam2\\Desktop\\" + t);
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
      File dir = new File("C:\\Users\\dam2\\Desktop\\" + setNomDir());
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
      File dir = new File("C:\\Users\\dam2\\Desktop\\" + setNomDir());
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
        
        File dir = new File("C:\\Users\\dam2\\Desktop\\" + setNomDir());
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
    public static void infFichero() throws FileNotFoundException{
        File dir = crearDir();
        File fich = crearFich();
        System.out.println("Informacion del Fichero en curso...");
        System.out.println("Nombre: " + fich.getName());
        System.out.println("Ruta del directorio:" + dir.getPath());
        System.out.println("Recreo: " + fich.getPath());
       System.out.println("\n");    
    }
    
    
    
    
}
     /*   do {
 
            System.out.println("1-.Crear Fichero");
            System.out.println("2-.Mostrar Fichero");
            System.out.println("3-.Salir");
 
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: {
                    crearFichero();
                    break;
                }
                case 2: {
                    mostrarFichero();
                    break;
                }
                case 3: {
                    System.out.println("Gracias por usar el programa");
                }
                default: {
                    System.out.println("Opcion incorrecta");
                }
 
            }
        } while (opcion != 3);
    } 
    
    
    public static void crearFichero() throws IOException{
        String ruta = "C:\\Users\\dam2\\Desktop\\Ficheros";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("El fichero de texto ya estaba creado.");
    } else {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("Acabo de crear el fichero de texto.");
    }
    bw.close();
    }
 
    public static void infoFichero() {
        
    }
    
    

} 

 
    
/*    public static void main(String args[]) {
 File fichero = new File("FicheroEjemplo.txt");

 if (fichero.exists()) {
 System.out.println("Nombre del archivo "+ fichero.getName());
 System.out.println("Ruta "+ fichero.getPath());
 System.out.println("Ruta absoluta "+ fichero.getAbsolutePath());
 System.out.println("Se puede escribir "+fichero.canRead());
 System.out.println("Se puede leer "+fichero.canWrite());
 System.out.println("Tamaño "+fichero.length());
 }

 fichero.close();
}
    /**
     * @param args the command line arguments
     */
    
    
