/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programalady1;

import java.util.Scanner;

/**
 *
 * @author ladyl
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        boolean continuar=true;
        int opcion;
        while(continuar){
            System.out.println("1.aritmetica");
            System.out.println("2.logica");
            System.out.println("3.caracteres");
            System.out.println("4.salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    aritmetica x=new aritmetica();
                    break;
                case 2:
                    logica y=new logica();
                    break;
                case 3:
                    caracteres z=new caracteres();
                    break;
                case 4:
                    continuar=false;
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }
    
}
