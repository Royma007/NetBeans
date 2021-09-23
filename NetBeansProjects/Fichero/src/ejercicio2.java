
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam2
 */
mport java.io.*; i
public class ejercicio2 { 
public static void main(String[] args) { 
 // TODO Auto-generated method stub
 try { 
 BufferedReader in=new BufferedReader(new
FileReader("C:\\Users\\dam2\\Desktop", "prueba.txt")); 
 String texto=""; 
 try { 
 String linea=in.readLine(); 
 while(linea!=null){ 
 texto=texto+linea+'\n'; 
 linea=in.readLine(); 
 } 
 in.close(); 
 } catch (IOException e) { 
 // TODO Auto-generated catch block
 e.printStackTrace(); 
 System.out.println(e.getMessage()); 
 } 
 System.out.println(texto); 
 }catch (FileNotFoundException e){ 
 e.printStackTrace(); 
 } 
 } 
}
