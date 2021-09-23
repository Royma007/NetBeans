/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam2
 */
public class palindromo {
    

    public palindromo() {
    }
   
    public static boolean Palindromo(String s)
    {
     int N = s.length();
     for (int i = 0; i < N/2; i++)
     if (s.charAt(i) != s.charAt(N-1-i))
     return false;
     return true;
    }
    public static void main(String[] args) {
        boolean valor = Palindromo("alala la");
        if(valor==true){
            System.out.println ("si es un palindromo");
        }else{
            System.out.println ("no es un palindromo");
            }
       
    }
}
