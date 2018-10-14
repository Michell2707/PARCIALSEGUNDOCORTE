/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.pkg3;

import java.util.Scanner;

/**
 *
 * @author Michell
 */
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tem = new Scanner (System.in);
                String nombre;
                String color;
                String objeto;
                int edad;
                
                System.out.println("ingrese nombre");
                nombre = tem.nextLine();
                System.out.println("ingrese color");
                color = tem.nextLine();
                System.out.println("ingrese objeto");
                objeto = tem.nextLine();
                System.out.println("ingrese edad");
                edad = tem.nextInt();
    }
    
}

