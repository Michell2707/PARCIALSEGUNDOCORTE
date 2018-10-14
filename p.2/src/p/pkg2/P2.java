/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Michell
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               int i;
        int j;
        
        i= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de pisos"));
        
        for(i=i;i>=0;i--)
        {
            for(j=1;j<=i;j++)
            {        
           
               System.out.print("*");
            }
               System.out.println(" ");
    
        }
    }
    
}
