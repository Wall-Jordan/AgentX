/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.ProgramControl;
import agentx.exceptions.ProgramControlExceptions;
import agentx.model.Player;
import agentx.view.ViewInterface.View;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jordan
 */
public class StartProgramView extends View{

    
    
    public StartProgramView() {
        super("\n\n\t*****************************************************"
                + "\n\t*                                                   *"
                + "\n\t*                     AGENT X:                      *"
                + "\n\t* Agent X is a game of adventure, creativity, and   *"
                + "\n\t* problem solving in which the player takes on      *"
                + "\n\t* the persona of a time agent chasing the terrorist *"
                + "\n\t* Chaotica.                                         *"
                + "\n\t*                                                   *"
                + "\n\t*    YOUR MISSION TO CAPTURE CHAOTICA STARTS NOW!   *"
                + "\n\t*                                                   *"
                + "\n\t*****************************************************");
    }
    
    @Override
    public void display() {

        String playersName = this.getPlayersName();

        Player player;
        try {
            player = ProgramControl.createPlayer(playersName);
            this.displayWelcomeMessage(player);
        } catch (ProgramControlExceptions ex) {
            System.out.println(ex.getMessage());
        }


        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    
    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
try{
        while (!valid) {
            System.out.println("Please enter your name below:");

            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                System.out.println("\nInvalid Name\n");
                continue;
            } else if ("Chaotica".equals(playersName) || "chaotica".equals(playersName)) {
                System.out.println("\nCongratulations you have found yourself. Now "
                        + " please choose another name for your player.\n");
                continue;
            }
            break;
        }
}catch(Exception e){
    
    }
        return playersName;
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n\t*****************************************************"
                + "\n\t\tWelcome to the game " + player.getName() + "!");
        System.out.println("\t*****************************************************");
    }
@Override
public boolean doAction(Object obj)
{
    return false;
}
}
