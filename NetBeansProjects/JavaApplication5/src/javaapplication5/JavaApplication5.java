/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class JavaApplication5 {

    
    public static void crearFichero(){
        
        File fichero = new File ("C:\\Users\\dam2\\Desktop", "prueba.txt");
        System.out.println(fichero.getPath());
        System.out.println(fichero.exists());
        
        
        try {
  
        if (fichero.createNewFile())
            System.out.println("El fichero se ha creado correctamente");
        else
            System.out.println("El fichero ya existe");
}       catch (IOException ioe) {
        ioe.printStackTrace();
}
    }
    
    
    
        public static void leerFichero {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    
    
   /* public static void leerFichero() throws FileNotFoundException, IOException {
    File fichero = new File ("C:\\Users\\dam2\\Desktop", "prueba.txt");
    FileReader fr = new FileReader (fichero);
    BufferedReader br = new BufferedReader(fr);
    String linea = br.readLine();
    
    }
    */
        
    
    public static void main(String[] args) {
     
    crearFichero();
    
    }
   
    }

