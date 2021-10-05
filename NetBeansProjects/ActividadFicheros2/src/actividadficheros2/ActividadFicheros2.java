/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadficheros2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class ActividadFicheros2 {
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File fichero = new File("C:\\Users\\dam2\\Desktop\\carta.txt");
       leeTxt(fichero);
       
    }
    
    
    public static void leeTxt(File file) {
        String cadena;
        BufferedReader br = null;
        
        try{
            br = new BufferedReader(new FileReader(file));
        
        while((cadena = br.readLine())!=null) {
            char[] charArray = cadena.toCharArray();
            if(br.readLine() != " "){
            System.out.println(cadena);
        }
            for (int l = 0; l <charArray.length; l++) {
                System.out.println(l+" ~ "+charArray[l]);
            }
            System.out.println(charArray.length);
        }
        }catch (IOException ex) {
        ex.printStackTrace();
        }
    }
     public static void contarPalabras(File file){
         String cadena;
         
         try{
             Scanner scan = new 
         }
       
    }
    
      /*public void leerFich() {
          FileReader fr = null;
          BufferedReader br = null;
          
          try{
          
                while
          }*/
        
      }


        
        
    
    

