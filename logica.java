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
public class logica {

    Scanner leer = new Scanner(System.in);

    public logica() {
        for (int j=0; j<2; j++){
        System.out.println(" \n -Expresion:  [(p->q)^p]->q");
        String expresion = leer.nextLine();
        String a[] = {"v", "v", "f", "f"};
        String b[] = {"v", "f", "v", "f"};
        String[] c = new String[4];
        // negacion
        if (expresion.charAt(0) == '¬') { 
            System.out.println("(p->q)");
            for (int i = 0; i < a.length; i++) {//operacion 1
                if (a[i].equals("v") && b[i].equals("f")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }
            System.out.println("[(p->q)^p]");//operacion 2
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }
            System.out.println("[(p->q)^p]->q");//operacion 3
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals("f") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }
            int d = 0, e = 0;
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
                if (c[i].equals("v")) {
                    d++;
                }
                if (c[i].equals("f")) {
                    e++;
                }
            }
            System.out.println("----CONTRADICCION----");

        } else { //tautologia
            System.out.println("(p->q)");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && b[i].equals("f")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }
            System.out.println("[(p->q)^p]");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }
            System.out.println("[(p->q)^p]->q");
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals("f") && c[i].equals("v")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }
            int d = 0, e = 0;
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
                if (c[i].equals("v")) {
                    d++;
                }
                if (c[i].equals("f")) {
                    e++;
                }
            }
            System.out.println("----TAUTOLOGIA----");

             }  
         }
    }
}
