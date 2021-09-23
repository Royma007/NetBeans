/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadfichero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author dam2
 */
public class ActividadFichero {
    
    
    public static void main(String[] args) {
            File directorio = new File("C:\\Users\\dam2\\Desktop\\Ficheros");
            File fichero = new File("C:\\Users\\dam2\\Desktop\\Ficheros\\prueba.txt");
        
       crearDirectorio(directorio, fichero);
    }
    
    
    
    public static void creaDirectorio(){
        try {
           
            // Si el archivo no existe es creado
            if (!directorio.exists()) {
                directorio.mkdirs();
                fichero.createNewFile();
               System.out.println("El directorio ha sido creado y el fichero también");
            }
    
            else{
                fichero.createNewFile();
                System.out.println("Se ha creado el fichero");
            }
            
           // FileWriter fw = new FileWriter(file);
           // BufferedWriter bw = new BufferedWriter(fw);
           // bw.write(contenido);
           // bw.close();
        } catch (Exception e) {
        }
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
    
    
}
*/