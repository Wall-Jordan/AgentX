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
    
    /*public static void main (String[] args){
        double gallonsOfFuel = calcNeededFuelAmount(200, 2, 300);
        System.out.println(gallonsOfFuel);
    }*/
    
public static double calcNeededFuelAmount(double years, double fuelType, double mass)
{
    double gallonsOfFuel;
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
    
    if(gallonsOfFuel < 0){
        return -1;
    }
    if(gallonsOfFuel == 0){
        return 0;
    }
    
    return (int) gallonsOfFuel;
}
    
}
