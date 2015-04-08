/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.GameBoardControl;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class GameBoardView extends View {

    ArrayList<Location> locations = GameBoardControl.getLocations();
    public int number = 0;

    public GameBoardView() {
        super("");
    }

    @Override
    public void display() {

        String value;
        boolean done = false;

        do {
            displayGameBoard();
            value = this.getInput();
            done = this.doAction(value);

        } while (!done);
    }

    public void displayGameBoard() {
        console.println("                           Agent X Gameboard          ");
        console.println("                 1   2   3   4   5   6   7   8   9   10");
        console.println("                 -   -   -   -   -   -   -   -   -   - ");

        int timePeriod = 1;
        for (int i = 0; i < 30; i++) {
            char display = 'X';
            if (locations.get(i).isActive()){
                display = 'O';
            } else if (locations.get(i).isVisited()){
                display = 'V';
            }
            
            if (i == 0) {
                console.print("Time Period " + timePeriod + ": | " + display + " | ");
                timePeriod++;
            } else if ((i != 0) && ((i % 10) == 0)) {
                console.print("\n                 -   -   -   -   -   -   -   -   -   - ");
                console.print("\nTime Period " + timePeriod + ": | " + display + " | ");
                timePeriod++;
            } else {
                console.print(display);
                console.print(" | ");
            }
            if (i == 29){
                console.print("\n                 -   -   -   -   -   -   -   -   -   - ");
                console.println("\n");
            }
        }
    }
    
    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        switch (selection) {
            case "F":
                if (!locations.get(number).isComplete()) {
                    console.println("\nYou must complete the necessary actions for each location!");
                } else {
                    locations.get(number).setActive(false);
                    number += 1;
                    locations.get(number).setActive(true);
                    locations.get(number).setVisited(true);
                }
                break;
            case "B":
                if (number > 0) {
                    locations.get(number).setActive(false);
                    number -= 1;
                    locations.get(number).setActive(true);
                } else {
                    console.println("If you go back any farther you may run into space time paradox's.");
                }
                break;
            case "E":
                switch (number) {
                    case (0):
                        L0View l0View = new L0View();
                        l0View.display();
                        break;
                    case (1):
                        L1View l1View = new L1View();
                        l1View.display();
                        break;
                    case (2):
                        L2View l2View = new L2View();
                        l2View.display();
                        break;
                    case (3):
                        L3View l3View = new L3View();
                        l3View.display();
                        break;
                    case (4):
                        L4View l4View = new L4View();
                        l4View.display();
                        break;
                    case (5):
                        L5View l5View = new L5View();
                        l5View.display();
                        break;
                    case (6):
                        L6View l6View = new L6View();
                        l6View.display();
                        break;
                    case (7):
                        L7View l7View = new L7View();
                        l7View.display();
                        break;
                    case (8):
                        L8View l8View = new L8View();
                        l8View.display();
                        break;
                    case (9):
                        L9View l9View = new L9View();
                        l9View.display();
                        if (locations.get(number).isComplete()) {
                            locations.get(number).setActive(false);
                            number += 1;
                            locations.get(number).setActive(true);
                            locations.get(number).setVisited(true);
                        }
                        break;
                    case (10):
                        L10View l10View = new L10View();
                        l10View.display();
                        break;
                    case (11):
                        L11View l11View = new L11View();
                        l11View.display();
                        break;
                    case (12):
                        L12View l12View = new L12View();
                        l12View.display();
                        break;
                    case (13):
                        L13View l13View = new L13View();
                        l13View.display();
                        break;
                    case (14):
                        L14View l14View = new L14View();
                        l14View.display();
                        break;
                    case (15):
                        L15View l15View = new L15View();
                        l15View.display();
                        break;
                    case (16):
                        L16View l16View = new L16View();
                        l16View.display();
                        break;
                    case (17):
                        L17View l17View = new L17View();
                        l17View.display();
                        break;
                    case (18):
                        L18View l18View = new L18View();
                        l18View.display();
                        break;
                    case (19):
                        L19View l19View = new L19View();
                        l19View.display();
                        if (locations.get(number).isComplete()) {
                            locations.get(number).setActive(false);
                            number += 1;
                            locations.get(number).setActive(true);
                            locations.get(number).setVisited(true);
                        }
                        break;
                    case (20):
                        L20View l20View = new L20View();
                        l20View.display();
                        break;
                    case (21):
                        L21View l21View = new L21View();
                        l21View.display();
                        break;
                    case (22):
                        L22View l22View = new L22View();
                        l22View.display();
                        break;
                    case (23):
                        L23View l23View = new L23View();
                        l23View.display();
                        break;
                    case (24):
                        L24View l24View = new L24View();
                        l24View.display();
                        break;
                    case (25):
                        L25View l25View = new L25View();
                        l25View.display();
                        break;
                    case (26):
                        L26View l26View = new L26View();
                        l26View.display();
                        break;
                    case (27):
                        L27View l27View = new L27View();
                        l27View.display();
                        break;
                    case (28):
                        L28View l28View = new L28View();
                        l28View.display();
                        break;
                    case (29):
                        L29View l29View = new L29View();
                        l29View.display();
                        if (locations.get(number).isComplete()) {
                            GameEndView gameEndView = new GameEndView();
                            gameEndView.display();
                        }
                        break;
                }
                break;
            case "M":
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;
            case "I":
                InstructionsView instructionsView = new InstructionsView();
                instructionsView.display();
                break;
            default:
                console.println("Invalid input. Please try again.");
                break;
        }
        return false;
    }
}
