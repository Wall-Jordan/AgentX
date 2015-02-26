/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.PuzzleControl;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class PuzzleView {
        
        private boolean result;
        private final String SIGN = "\n"
            + "\n\tYou are at a door. Next to the door is a security keypad. Above the keypad is a small sign that says..."
            + "\n\tX=(2*(X-2)+(96/6))/4"
            + "\n\n\tSolve for X to Enter!";
   
    public void entranceQuiz() {
            
        do {
            System.out.println(SIGN);
            
            String input = this.getInput();
            
            double userIn = Double.parseDouble(input);

            this.doAction(userIn);
        }while (result == false);
    }

    private String getInput() {
        String number = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("\n\tPlease enter a number:");
            
        number = keyboard.nextLine();
        number = number.trim();
        number = number.toUpperCase();
   
        return number;
    }

    public boolean doAction(double number)
    {
        boolean test = PuzzleControl.calcEntrance(number);
        if (test == true)
        {
            System.out.println("\n\tCORRECT! You may now proceed.");
            result = true;
        }
        else
        {
            System.out.println("\n\tWRONG!!! Please try again.");
            result = false;
            return result;        
        }
        return result;
    }
}
