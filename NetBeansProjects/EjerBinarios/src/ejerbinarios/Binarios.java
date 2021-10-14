/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerbinarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class Binarios {
    
    String dirPath = "C:\\Users\\dam2\\Desktop";
   
    String nomFichero;
    File dir, Fichero;
    
    
    
    public Binarios(String nomFichero){
    this.nomFichero = nomFichero;
}
    public Binarios(File Fichero){
        this.nomFichero = "datos.ods";
    }
    
public void crearFichero()throws FileNotFoundException{
     Fichero = new File(nomFichero);
      
        
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
    
    public void escribirFichero(File Fichero)throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int num= 0;

        try {
            fos = new FileOutputStream(Fichero.getAbsoluteFile());
            salida = new DataOutputStream(fos);

            System.out.print("Introduce número entero. -1 para acabar: ");
            num = sc.nextInt();
            while (num != -1) {
                salida.writeInt(num); //se escribe el número entero en el fichero                                   
                System.out.print("Introduce número entero. -1 para acabar: ");
                num = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
    
    
}
