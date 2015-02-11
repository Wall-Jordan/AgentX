/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

/**
 *
 * @author Chris
 */
public class PuzzleControl {

public static boolean calcEntrance(double x)
{
    if (x <= 0)
    {
        return false;
    }
    else if (x == (2*(x -2)+(96/6))/4)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static int calcNeededFuelAmount(double years, double fuelType, double mass)
{
    double gallonsOfFuel;
    
    //Boundary Check
    
    if (years < 0 || years > 1000)
    {
        return -1;
    }
    if (mass < 0 || mass > 1000)
    {
        return -1;
    }
    
    //fuel calculation
                
    if (fuelType == 1){
        gallonsOfFuel = Math.sqrt((years*mass)/50);
    }
    else if (fuelType == 2){
        gallonsOfFuel = Math.sqrt((years*mass)/100);
    }
    else if (fuelType == 3){
        gallonsOfFuel = Math.sqrt((years*mass)/200);
    }
    else {
        return -1;
    }
    
    //remove trailing numbers
    gallonsOfFuel = (int) gallonsOfFuel;
    
    //final fuel error check
    if(gallonsOfFuel < 0){
        return -1;
    }
    //Special case. You need at least 1 gallon of fuel to time travel!
    if(gallonsOfFuel == 0){
        return 1;
    }
    
    return (int) gallonsOfFuel;
}
    
}
