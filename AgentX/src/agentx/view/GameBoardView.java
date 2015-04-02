/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import agentx.control.GameBoardControl;
import agentx.model.Location;
import agentx.view.ViewInterface.View;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author matiasmikkola
 */
public class GameBoardView extends View {
    ArrayList<Location> locations = GameBoardControl.locations;
    public GameBoardView() {
        super("");
    }

    private void displayGameBoard(){
        char loc0;
        char loc1;
        char loc2;
        char loc3;
        char loc4;
        char loc5;
        char loc6;
        char loc7;
        char loc8;
        char loc9;
        char loc10;
        char loc11;
        char loc12;
        char loc13;
        char loc14;
        char loc15;
        char loc16;
        char loc17;
        char loc18;
        char loc19;
        char loc20;
        char loc21;
        char loc22;
        char loc23;
        char loc24;
        char loc25;
        char loc26;
        char loc27;
        char loc28;
        char loc29;
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
        }
        if(locations.get(15).getVisited() == true && locations.get(15).getActive() == false){
            loc15 = 'V';
        }else if(locations.get(15).getVisited() == true && locations.get(15).getActive() == true){
            loc15 = 'O';
        }else{
            loc15 = 'X';
        }
        if(locations.get(16).getVisited() == true && locations.get(16).getActive() == false){
            loc16 = 'V';
        }else if(locations.get(16).getVisited() == true && locations.get(16).getActive() == true){
            loc16 = 'O';
        }else{
            loc16 = 'X';
        }
        if(locations.get(17).getVisited() == true && locations.get(17).getActive() == false){
            loc17 = 'V';
        }else if(locations.get(17).getVisited() == true && locations.get(17).getActive() == true){
            loc17 = 'O';
        }else{
            loc17 = 'X';
        }
        if(locations.get(18).getVisited() == true && locations.get(18).getActive() == false){
            loc18 = 'V';
        }else if(locations.get(18).getVisited() == true && locations.get(18).getActive() == true){
            loc18 = 'O';
        }else{
            loc18 = 'X';
        }
        if(locations.get(19).getVisited() == true && locations.get(19).getActive() == false){
            loc19 = 'V';
        }else if(locations.get(19).getVisited() == true && locations.get(19).getActive() == true){
            loc19 = 'O';
        }else{
            loc19 = 'X';
        }
        if(locations.get(20).getVisited() == true && locations.get(20).getActive() == false){
            loc20 = 'V';
        }else if(locations.get(20).getVisited() == true && locations.get(20).getActive() == true){
            loc20 = 'O';
        }else{
            loc20 = 'X';
        }
        if(locations.get(21).getVisited() == true && locations.get(21).getActive() == false){
            loc21 = 'V';
        }else if(locations.get(21).getVisited() == true && locations.get(21).getActive() == true){
            loc21 = 'O';
        }else{
            loc21 = 'X';
        }
        if(locations.get(22).getVisited() == true && locations.get(22).getActive() == false){
            loc22 = 'V';
        }else if(locations.get(22).getVisited() == true && locations.get(22).getActive() == true){
            loc22 = 'O';
        }else{
            loc22 = 'X';
        }
        if(locations.get(23).getVisited() == true && locations.get(23).getActive() == false){
            loc23 = 'V';
        }else if(locations.get(23).getVisited() == true && locations.get(23).getActive() == true){
            loc23 = 'O';
        }else{
            loc23 = 'X';
        }
        if(locations.get(24).getVisited() == true && locations.get(24).getActive() == false){
            loc24 = 'V';
        }else if(locations.get(24).getVisited() == true && locations.get(24).getActive() == true){
            loc24 = 'O';
        }else{
            loc24 = 'X';
        }
        if(locations.get(25).getVisited() == true && locations.get(25).getActive() == false){
            loc25 = 'V';
        }else if(locations.get(25).getVisited() == true && locations.get(25).getActive() == true){
            loc25 = 'O';
        }else{
            loc25 = 'X';
        }
        if(locations.get(26).getVisited() == true && locations.get(26).getActive() == false){
            loc26 = 'V';
        }else if(locations.get(26).getVisited() == true && locations.get(26).getActive() == true){
            loc26 = 'O';
        }else{
            loc26 = 'X';
        }
        if(locations.get(27).getVisited() == true && locations.get(27).getActive() == false){
            loc27 = 'V';
        }else if(locations.get(27).getVisited() == true && locations.get(27).getActive() == true){
            loc27 = 'O';
        }else{
            loc27 = 'X';
        }
        if(locations.get(28).getVisited() == true && locations.get(28).getActive() == false){
            loc28 = 'V';
        }else if(locations.get(28).getVisited() == true && locations.get(28).getActive() == true){
            loc28 = 'O';
        }else{
            loc28 = 'X';
        }
        if(locations.get(29).getVisited() == true && locations.get(29).getActive() == false){
            loc29 = 'V';
        }else if(locations.get(29).getVisited() == true && locations.get(29).getActive() == true){
            loc29 = 'O';
        }else{
            loc29 = 'X';
        }

    }
    
//    void display() {
//        console.println();
//        char gameBoard[][] = new char[3][10];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 10; j++) {
//                gameBoard[i][j] = 'X';
//            }
//        }
//
//        console.println("                           Agent X Gameboard          ");
//        console.println("                 1   2   3   4   5   6   7   8   9   10");
//        console.println("                 -   -   -   -   -   -   -   -   -   - ");
//        for (int i = 0; i < 3; i++) {
//            console.print("Time Period " + (i + 1) + ": | ");
//            for (int j = 0; j < 10; j++) {
//                console.print(gameBoard[i][j]);
//                console.print(" | ");
//            }
//            console.print("\n");
//            console.println("                 -   -   -   -   -   -   -   -   -   - ");
//        }
//
//    }

    @Override
    public boolean doAction(Object obj) {
        return false;
    }
}
