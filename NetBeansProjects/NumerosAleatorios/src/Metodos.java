
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam2
 */
public class Metodos {

 public static int generaNumAleatorio(int minimo, int maximo){
            int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
    }
 
    public static boolean esPrimo(int num) {
  // El 0, 1 y 4 no son primos
  if (num == 0 || num == 1 || num == 4) {
    return false;
  }
  for (int x = 2; x < num / 2; x++) {
    // Si es divisible por cualquiera de estos números, no
    // es primo
    if (num % x == 0)
      return false;
  }
  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
  return true;
}

     
    }
 
 
 
