/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Please enter an integer: " );
        
        // TODO: Get y from the user
        int y;
        
        Scanner input; 
        input = new Scanner(System.in);
        
        y = input.nextInt();
        
        int x = 5;
        
        //Todo: set x to 0 when y is 20
        if (y==20) {
             x = 0;
             
        }
        // Output both x and y.
        
        System.out.println("x is " + x + " and y is " + y);
        
           
               
    }
    
}
