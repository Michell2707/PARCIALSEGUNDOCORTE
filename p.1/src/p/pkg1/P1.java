/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Michell
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num1 = 0;
        int num2 = 0;
        
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese num1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese num2"));
        
        int sum = num1 + num2;
        
        
        JOptionPane.showMessageDialog(null ,sum);

    }
    
}

 
