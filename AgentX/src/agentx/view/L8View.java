/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
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
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class L8View extends View {

    public L8View() {
        super("Jarik is in your way. Show him who is boss.\n"
                + "\n****************************************"
                + "\nTL - Display to do list"
                + "\nO - Other commands menu"
                + "\nV - Return to Map"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        ArrayList<Location> locations = GameBoardControl.locations;
        String input = (String) obj;

        switch (input) {
            case "TL":
                for (String item : locations.get(12).getToDoList()) {
                    console.println("*" + item);
                }
                break;
            case "O":
                OtherCommandsMenuView otherCommands = new OtherCommandsMenuView();
                otherCommands.display();
                break;
            case "V":
                locations.get(8).setComplete(true);
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
                        fuel = locations.get(8).getFuel();
                        locations.get(8).setFuel(0);

                    }

                    InventoryControl.AddFuel1(fuel);
                    console.println("You collected " + fuel + " gallons of fuel. You now have " + ship1.fuel.getGallons() + " gallons of fuel.");

                } catch (PuzzleControlExceptions pce) {
                    ErrorView.display("L2View.java", pce.getMessage());
                }

                break;
            case "FIGHT":
                boolean fight = true;
                int bossHealth = bosses.get(0).getHealth();
                int playerHealth;
                int playerStamina;
                int bossDamage;
                bossDamage = (int) bosses.get(0).getDamage();
                playerHealth = (int) AgentX.getPlayer().getHealth();
                playerStamina = AgentX.getPlayer().getStamina();
                while (fight) {
                    while (playerHealth > 0 && bossHealth > 0) {
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
                            }
                        } else if (playerStamina == 2) {
                            String attack1 = getAttack1();
                            String attack2 = getAttack2();
                            playerAttack = calcPlayerAttack(attack1, attack2);
                            if (attack1.equals("B")) {
                                playerBlockCount += 1;
                            }
                            if (attack2.equals("B")) {
                                playerBlockCount += 1;
                            }
                        } else if (playerStamina == 1) {
                            String attack1 = getAttack1();
                            playerAttack = calcPlayerAttack(attack1);
                            if (attack1.equals("B")) {
                                playerBlockCount += 1;
                            }
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
                        }
                        if (bossAttack == bossDamage) {
                            bossBlockCount += 2;
                        }
                        if (bossAttack == (bossDamage * 2)) {
                            bossBlockCount += 1;
                        }
                        calcPlayerDamage(bossAttack, playerBlockCount, playerHealth);

                        double newBossHealth = calcBossDamage(playerAttack, bossBlockCount, bossHealth);

                        bossHealth = bosses.get(0).getHealth();
                        playerHealth = (int) AgentX.getPlayer().getHealth();
                        playerStamina = AgentX.getPlayer().getStamina();
                    }
                    break;
                }
        }

        return false;
    }

    public String getAttack1() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Enter your first attack.");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (!selection.equals("B") || !selection.equals("G") || !selection.equals("D")
                        || !selection.equals("P") || !selection.equals("P") || !selection.equals("R") || !selection.equals("K")) {
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

                console.println("Enter your second attack.");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (!selection.equals("B") || !selection.equals("G") || !selection.equals("D")
                        || !selection.equals("P") || !selection.equals("P") || !selection.equals("R") || !selection.equals("K")) {
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

                console.println("Enter your third attack.");
                selection = this.keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

                    console.println("Invalid Selection. Please try again.");
                    continue;

                }
                if (!selection.equals("B") || !selection.equals("G") || !selection.equals("D")
                        || !selection.equals("P") || !selection.equals("P") || !selection.equals("R") || !selection.equals("K")) {
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
