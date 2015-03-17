/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.model.Boss;

/**
 *
 * @author Chris
 */
public class PuzzleControl {
    
    

    public static boolean calcEntrance(double x) {
        if (x <= 0) {
            return false;
        } else if (x == (2 * (x - 2) + (96 / 6)) / 4) {
            return true;
        } else {
            return false;
        }
    }

    public static int calcNeededFuelAmount(double years, double fuelType, double mass) {
        double gallonsOfFuel;

        //Boundary Check
        if (years < 0 || years > 1000) {
            return -1;
        }
        if (mass < 0 || mass > 1000) {
            return -1;
        }

        //fuel calculation
        if (fuelType == 1) {
            gallonsOfFuel = Math.sqrt((years * mass) / 50);
        } else if (fuelType == 2) {
            gallonsOfFuel = Math.sqrt((years * mass) / 100);
        } else if (fuelType == 3) {
            gallonsOfFuel = Math.sqrt((years * mass) / 200);
        } else {
            return -1;
        }

        //remove trailing numbers
        gallonsOfFuel = (int) gallonsOfFuel;

        //final fuel error check
        if (gallonsOfFuel < 0) {
            return -1;
        }
        //Special case. You need at least 1 gallon of fuel to time travel!
        if (gallonsOfFuel == 0) {
            return 1;
        }

        return (int) gallonsOfFuel;
    }

    public static double calcDrillDepth(String drillBit) {
        //Define variables.
        double drillDepth;
        double bitWidth;

        //Set bitWidth in mm based on drillBit selected.
        switch (drillBit) {
            case "1":
            case "01":
                bitWidth = 13.0;
                break;
            case "2":
            case "02":
                bitWidth = 16.0;
                break;
            default:
                return -1;
        }

        //Calculate drillDepth of drillBit Type.
        drillDepth = Math.sqrt((bitWidth % 7) / .125);

        return drillDepth;
    }
    // Calculate Damage Function //

    public static double calcDamage(double stamina, int weaponType, int blockAttack, double health) {

        // Boundary Check // 
        if (stamina < 0 || stamina > 100) {
            return -1;
        }
        if (weaponType < 0 || weaponType > 3) {
            return -1;
        }
        if (blockAttack < 0 || blockAttack > 4) {
            return -1;
        }
        if (health < 0 || health > 100) {
            return -1;
        }

        // Calculate Amount of Damage //
        double damage = ((stamina / ((double) weaponType * (double) blockAttack)) + health);
        return damage;
    }

    
}
