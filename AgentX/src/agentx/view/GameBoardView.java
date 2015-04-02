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
        if(locations.get(1).getVisited() == true && locations.get(1).getActive() == false){
            loc1 = 'V';
        }else if(locations.get(1).getVisited() == true && locations.get(1).getActive() == true){
            loc1 = 'O';
        }else{
            loc1 = 'X';
        }
        if(locations.get(2).getVisited() == true && locations.get(2).getActive() == false){
            loc2 = 'V';
        }else if(locations.get(2).getVisited() == true && locations.get(2).getActive() == true){
            loc2 = 'O';
        }else{
            loc2 = 'X';
        }
        if(locations.get(3).getVisited() == true && locations.get(3).getActive() == false){
            loc3 = 'V';
        }else if(locations.get(3).getVisited() == true && locations.get(3).getActive() == true){
            loc3 = 'O';
        }else{
            loc3 = 'X';
        }
        if(locations.get(4).getVisited() == true && locations.get(4).getActive() == false){
            loc4 = 'V';
        }else if(locations.get(4).getVisited() == true && locations.get(4).getActive() == true){
            loc4 = 'O';
        }else{
            loc4 = 'X';
        }
        if(locations.get(5).getVisited() == true && locations.get(5).getActive() == false){
            loc5 = 'V';
        }else if(locations.get(5).getVisited() == true && locations.get(5).getActive() == true){
            loc5 = 'O';
        }else{
            loc5 = 'X';
        }
        if(locations.get(6).getVisited() == true && locations.get(6).getActive() == false){
            loc6 = 'V';
        }else if(locations.get(6).getVisited() == true && locations.get(6).getActive() == true){
            loc6 = 'O';
        }else{
            loc6 = 'X';
        }
        if(locations.get(7).getVisited() == true && locations.get(7).getActive() == false){
            loc7 = 'V';
        }else if(locations.get(7).getVisited() == true && locations.get(7).getActive() == true){
            loc7 = 'O';
        }else{
            loc7 = 'X';
        }
        if(locations.get(8).getVisited() == true && locations.get(8).getActive() == false){
            loc8 = 'V';
        }else if(locations.get(8).getVisited() == true && locations.get(8).getActive() == true){
            loc8 = 'O';
        }else{
            loc8 = 'X';
        }
        if(locations.get(9).getVisited() == true && locations.get(9).getActive() == false){
            loc9 = 'V';
        }else if(locations.get(9).getVisited() == true && locations.get(9).getActive() == true){
            loc9 = 'O';
        }else{
            loc9 = 'X';
        }
        if(locations.get(10).getVisited() == true && locations.get(10).getActive() == false){
            loc10 = 'V';
        }else if(locations.get(10).getVisited() == true && locations.get(10).getActive() == true){
            loc10 = 'O';
        }else{
            loc10 = 'X';
        }
        if(locations.get(11).getVisited() == true && locations.get(11).getActive() == false){
            loc11 = 'V';
        }else if(locations.get(11).getVisited() == true && locations.get(11).getActive() == true){
            loc11 = 'O';
        }else{
            loc11 = 'X';
        }
        if(locations.get(12).getVisited() == true && locations.get(12).getActive() == false){
            loc12 = 'V';
        }else if(locations.get(12).getVisited() == true && locations.get(12).getActive() == true){
            loc12 = 'O';
        }else{
            loc12 = 'X';
        }
        if(locations.get(13).getVisited() == true && locations.get(13).getActive() == false){
            loc13 = 'V';
        }else if(locations.get(13).getVisited() == true && locations.get(13).getActive() == true){
            loc13 = 'O';
        }else{
            loc13 = 'X';
        }
        if(locations.get(14).getVisited() == true && locations.get(14).getActive() == false){
            loc14 = 'V';
        }else if(locations.get(14).getVisited() == true && locations.get(14).getActive() == true){
            loc14 = 'O';
        }else{
            loc14 = 'X';
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
        if(locations.get(0).getVisited() == true && locations.get(0).getActive() == false){
            loc0 = 'V';
        }else if(locations.get(0).getVisited() == true && locations.get(0).getActive() == true){
            loc0 = 'O';
        }else{
            loc0 = 'X';
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
