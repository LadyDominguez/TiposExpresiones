
package com.mycompany.programalady1;

import java.util.Scanner;

/**
 *
 * @author ladyl
 */
public class caracteres {
    Scanner leer = new Scanner(System.in);
    public caracteres(){
        System.out.println("Ingresar expresion: ");
        String Texto=leer.nextLine();
         String frase[] = Texto.split(" ");
         int n=0;
         int c=0;
         int s=0;
         String elenum="";
         String elestr="";
         String elecha="";
         for (int i = 0; i < frase.length; i++) {
             if (Numero(frase[i]) == true) {
                 elenum+=" "+frase[i];
                 n++;
             }
             
             if (Numero(frase[i]) == false) {
                 
                 if(frase[i].length()==1){
                     elecha+=" "+frase[i];
                     c++;
                 }else{
                 
                 elestr+=" "+frase[i];
                 s++;}
             }
             
        }
         System.out.println("Los elementos Numericos: "+elenum+", total de numeros: "+n);
         System.out.println("Los elementos Cadena: "+elestr+", total de cadenas: "+s);
         System.out.println("Los elementos Caracter: "+elecha+", total de caracteres: "+c);
        
        
}
    
    public static boolean Numero(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
 
}