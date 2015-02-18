/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class StartProgramView {
    
//    public static void main (String[] args){                                                     //Take out commits!
//        displayBanner();
//    }
    
    public StartProgramView(){
    }
    
    public void startProgram(){        
        this.displayBanner();
        
        String playersName = this.getPlayersName();
        
    }

    public /*static*/ void displayBanner() {                                                        //Take out commits!
        System.out.println("\n\n\t*****************************************************"
                           + "\n\t*                                                   *");
        System.out.println(    "\t*                     AGENT X:                      *"
                          +  "\n\t* Agent X is a game of adventure, creativity, and   *"
                          +  "\n\t* problem solving in which the player takes on      *"
                          +  "\n\t* the persona of a time agent chasing the terrorist *"
                          +  "\n\t* Chaotica.                                         *");
        
        System.out.println(    "\t*                                                   *"
                          +  "\n\t*    YOUR MISSION TO CAPTURE CHAOTICA STARTS NOW!   *"
                          +  "\n\t*                                                   *"
                          +  "\n\t*****************************************************");
    }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid) {
            System.out.println("Please enter your name below:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 2){
                System.out.println("Invalid Name");
                continue;
            }
            break;
        }
        
        return playersName;
    }
}
