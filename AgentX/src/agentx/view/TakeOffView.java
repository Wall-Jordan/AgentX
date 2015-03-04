/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class TakeOffView extends View {
    
    public TakeOffView()
    {
        super("");
    }
    private final String TAKE_OFF = "************* TAKE OFF *************";
    
    @Override
    public void display() {
        String year = " ";
        
        boolean traveled = false;
        String goBack = " ";
        
        do {           
            System.out.println(TAKE_OFF);
            
            String input = this.getInput();
            year = input;
            
            traveled = this.doAction(year);
            
            if (traveled == false){
                goBack = this.getInput2();
                }
            else {
                goBack = "Y";
            }
        }while (!"Y".equals(goBack));
        
        if (traveled == true){
        System.out.println("You are now in " + year + ".");
        }
        else {
            System.out.println("Go back and look for year clue.");
        }
        return;
        
        
    }
    @Override
    public String getInput() {
        String year = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Destination year:");
            
        year = keyboard.nextLine();
        year = year.trim();
        year = year.toUpperCase();
   
        return year;
    }
    
    private String getInput2() {
        String year = null;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Would you like to go back? [Y, N]");
            
        year = keyboard.nextLine();
        year = year.trim();
        year = year.toUpperCase();
   
        return year;
    }
    @Override
    public boolean doAction(Object obj) {
        String year = (String) obj;
        if ("3097AD".equals(year)){
            return true;
        }
        else if ("2046AD".equals(year)){
            return true;
        }
        else{
            System.out.println("Wrong year to travel to. You may want to go back "
                    + "to the explore sections in this time period and find year clue.");
            return false;
        }
    }
}
