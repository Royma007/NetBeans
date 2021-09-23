/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam2
 */
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class Fichero {
  public static void crearFichero(String[] args) {
    try {
      File fichero = new File("C:\\Users\\dam2\\Desktop\\fichero.txt");
      if (fichero.createNewFile()) {
        System.out.println("fichero: " + fichero.getName());
      } else {
        System.out.println("fichero ya ha sido creado.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }


  public static void escribirFichero(String[] args) {
    try {
      FileWriter escribir = new FileWriter("filename.txt");
      escribir.write("Files in Java might be tricky, but it is fun enough!");
      escribir.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void leerFichero(String[] args) {
    try {
      File fichero = new File("filename.txt");
      Scanner leer = new Scanner(fichero);
      while (leer.hasNextLine()) {
        String data = leer.nextLine();
        System.out.println(data);
      }
      leer.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
public static void main(String[] args) {
   
}

}