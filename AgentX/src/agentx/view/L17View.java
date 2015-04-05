/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import static agentx.control.GameBoardControl.bosses;
import static agentx.control.GameBoardControl.createLocations;
import agentx.control.InventoryControl;
import agentx.control.PuzzleControl;
import static agentx.control.PuzzleControl.bossAttack;
import static agentx.control.PuzzleControl.calcBossDamage;
import static agentx.control.PuzzleControl.calcPlayerAttack;
import static agentx.control.PuzzleControl.calcPlayerDamage;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Location;
import static agentx.view.L0View.ship1;
import static agentx.view.L10View.ship2;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class L17View extends View {

    public L17View() {
        super("You crashed outside an old school"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nI - Instructions"
                + "\nV - Return to Map"
                + "\n****************************************\n");
    }
    
    @Override
    public boolean doAction(Object obj){
        ArrayList<Location> locations = createLocations();
        String input = (String) obj;
        
        switch (input) {
            case "TL":
                for (String item : locations.get(17).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                return true;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            case "T4":
                try {
                    String drillBit = InventoryControl.getDrillBit();

                    double drillDepth = PuzzleControl.calcDrillDepth(drillBit);
                    double fuel = 0;
                    if (6 <= drillDepth) {
                        fuel = locations.get(17).getFuel();
                        locations.get(17).setFuel(0);

                    }

                    InventoryControl.AddFuel2(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship2.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L17View.java", pce.getMessage());
                }

                break;
            case "WI":
                for (int i = 0; i < AgentX.getPlayer().weaponsBelt.getBeltItems().size(); i++) {
                    String item;
                    item = AgentX.getPlayer().weaponsBelt.getBeltItems().get(i).getName();
                    console.println("*" + item);
                }
                break;
            case "FIGHT":
                double bossHealth = bosses.get(1).getHealth();
                int playerHealth;
                int playerStamina;
                int bossDamage;
                bossDamage = (int) bosses.get(1).getDamage();
                playerHealth = (int) AgentX.getPlayer().getHealth();
                playerStamina = AgentX.getPlayer().getStamina();
                while (playerHealth > 0 && bossHealth > 0) {
                    console.println("Your health is " + playerHealth);
                    console.println("Your Stamina is " + playerStamina);
                    console.println("The bosses health is " + bossHealth);
                    int playerBlockCount = 0;
                    int playerAttack = 0;
                    if (playerStamina >= 3) {
                        String attack1 = getAttack1();
                        String attack2 = getAttack2();
                        String attack3 = getAttack3();
                        playerAttack = calcPlayerAttack(attack1, attack2, attack3);
                        if (attack1.equals("B")) {
                            playerBlockCount += 1;
                        }
                        if (attack2.equals("B")) {
                            playerBlockCount += 1;
                        }
                        if (attack2.equals("B")) {
                            playerBlockCount += 1;
                        } else {
                        }
                        playerStamina -= 3;
                        AgentX.getPlayer().setStamina(playerStamina);
                    } else if (playerStamina == 2) {
                        String attack1 = getAttack1();
                        String attack2 = getAttack2();
                        playerAttack = calcPlayerAttack(attack1, attack2);
                        if (attack1.equals("B")) {
                            playerBlockCount += 1;
                        }
                        if (attack2.equals("B")) {
                            playerBlockCount += 1;
                        } else {
                        }
                        playerStamina -= 2;
                        AgentX.getPlayer().setStamina(playerStamina);
                    } else if (playerStamina == 1) {
                        String attack1 = getAttack1();
                        playerAttack = calcPlayerAttack(attack1);
                        if (attack1.equals("B")) {
                            playerBlockCount += 1;
                        } else {
                        }
                        playerStamina -= 1;
                        AgentX.getPlayer().setStamina(playerStamina);
                    } else {
                        console.println("You're stamina ran out, you fell on the ground,"
                                + "\nand the boss killed you. Congratulations.");
                        GameOverView gameOverView = new GameOverView();
                        gameOverView.display();
                    }
                    int bossAttack = bossAttack(bossDamage);
                    int bossBlockCount = 0;
                    if (bossAttack == 0) {
                        bossBlockCount += 3;
                    } else if (bossAttack == bossDamage) {
                        bossBlockCount += 2;
                    } else if (bossAttack == (bossDamage * 2)) {
                        bossBlockCount += 1;
                    }
                    calcPlayerDamage(bossAttack, playerBlockCount, playerHealth);

                    double newBossHealth = calcBossDamage(playerAttack, bossBlockCount, bossHealth);
                    bosses.get(1).setHealth(newBossHealth);
                    bossHealth = bosses.get(1).getHealth();
                    playerHealth = (int) AgentX.getPlayer().getHealth();
                    playerStamina = AgentX.getPlayer().getStamina();
                }
                if(playerHealth <=0){
                    console.println("You died! It's time to move on to the after life.");
                    GameOverView gameOverView = new GameOverView();
                    gameOverView.display();
                }else{
                    console.println("You killed the boss!!!");
                    locations.get(17).setComplete(true);
                }
            break;
        }

        return false;
    }

    public String getAttack1() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Enter your first attack:");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();
                if (selection.length() > 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (selection.equals("B") || selection.equals("G") || selection.equals("P") || selection.equals("R") || selection.equals("K")) {
                } else {
                    console.println("Invalid Selection. Please try again.");
                    continue;
                }

                break;
            }
        } catch (Exception e) {
            console.println("Error reading input: " + e.getMessage());
        }

        return selection;

    }

    public String getAttack2() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Enter your second attack:");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();
                if (selection.length() > 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (selection.equals("B") || selection.equals("G") || selection.equals("P") || selection.equals("R") || selection.equals("K")) {
                } else {
                    console.println("Invalid Selection. Please try again.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            console.println("Error reading input: " + e.getMessage());
        }

        return selection;

    }

    public String getAttack3() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Enter your third attack:");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() > 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (selection.equals("B") || selection.equals("G") || selection.equals("P") || selection.equals("R") || selection.equals("K")) {
                } else {
                    console.println("Invalid Selection. Please try again.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            console.println("Error reading input: " + e.getMessage());
        }

        return selection;

    }
}
