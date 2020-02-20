/*
 Amer Stas
20/02/2020
This program takes the absolute value of number that is coming from the user
 */

package abs;


import javax.swing.*;

public class Abs {

    public static void main(String[] args) {
    String input ;
    double number;
    double num2;
    double num3;
    double error;
    input = JOptionPane.showInputDialog("Name of Place 1");
    number = Double.parseDouble(input);
    num2 = Math.sqrt(number);
    num3 = Math.pow(num2,2);
     System.out.println("The square of the square  " + num3);
    error = (number-num3);
    System.out.println("The error is " + error );
        
            
    
    
        
    }
    
}
