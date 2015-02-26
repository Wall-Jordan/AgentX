/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import java.util.Scanner;

/**
 *
 * @author matiasmikkola
 */
public class ExploreView {
   private final String EXPLORE = "\n"
           + "\n\t Choose your action";
   private boolean valid;
   
   public String getInput() {
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            
            selection = keyboard.nextLine();
            selection = selection.trim();
   
            if (selection.length() < 1) {
                System.out.println("Input something else");
                continue;
            }
            break;
        }
        return selection
   
           
   }      
}
