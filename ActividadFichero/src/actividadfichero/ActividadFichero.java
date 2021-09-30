/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfichero;

import java.io.BufferedWriter;
import java.io.File;
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
            +"   "
            +"   "
            +"   "        
                    
                    
            );
            
            
            
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                    File dir = crearDir();
                    System.out.println("Informacion del directorio");
                    System.err.println("Nombre:" + dir.getName());
                    System.out.println("Ruta:" + dir.getAbsolutePath());
                    break;
                case 2:
                    
                case 3:
                    
                case 4: 
            }
                
        }catch (IOException ex){
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
    
    
