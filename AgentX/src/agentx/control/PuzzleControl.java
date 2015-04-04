/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.exceptions.PuzzleControlExceptions;
import agentx.model.Boss;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Chris
 */
public class PuzzleControl {

    protected final static PrintWriter console = AgentX.getOutFile();

    public static boolean calcEntrance(double x) {
        if (x == (2 * (x - 2) + (96 / 6)) / 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void calcPlayerDamage(int bossAttack, int playerBlockCount, double playerHealth) {
        double playerDamage = 0;
        switch (playerBlockCount) {
            case (1):
                playerDamage = (bossAttack * .5);
                break;
            case (2):
                playerDamage = (bossAttack * .25);
                break;
            case (3):
                playerDamage = (bossAttack * .125);
                break;
            default:
                playerDamage = (int) bossAttack;
                break;
        }
        AgentX.getPlayer().setHealth(playerHealth - playerDamage);
    }

    public static double calcBossDamage(int playerAttack, int bossBlockCount, double bossHealth) {
        double bossDamage = 0;
        switch (bossBlockCount) {
            case (1):
                bossDamage = (playerAttack * .5);
                break;
            case (2):
                bossDamage = (playerAttack * .25);
                break;
            case (3):
                bossDamage = (playerAttack * .125);
                break;
            default:
                bossDamage = (int) playerAttack;
                break;
        }
        bossHealth -= bossDamage;
        return bossHealth;
    }

    public static int bossAttack(int bossDamage) {
        boolean validRandom = false;
        int number = 0;
        Random rn = new Random();
        number = rn.nextInt(4) + 1;
        int attack = 0;
        switch (number) {
            case (1):
                attack = 0;
                console.println("His three attacks are B:B:B which is worth " + attack + " damage.");
                break;
            case (2):
                attack = bossDamage;
                console.println("His three attacks are B:B:A which is worth " + attack + " damage.");
                break;
            case (3):
                attack = bossDamage * 2;
                console.println("His three attacks are B:A:A which is worth " + attack + " damage.");
                break;
            case (4):
                attack = bossDamage * 3;
                console.println("His three attacks are A:A:A which is worth " + attack + " damage.");
                break;
        }
        return attack;
    }

    public static int calcPlayerAttack(String a, String b, String c) {
        int attack = 0;
        switch (a) {
            case "B":
                attack = 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        switch (b) {
            case "B":
                attack += 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        switch (c) {
            case "B":
                attack += 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        return attack;
    }

    public static int calcPlayerAttack(String a, String b) {
        int attack = 0;
        switch (a) {
            case "B":
                attack = 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        switch (b) {
            case "B":
                attack += 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        return attack;
    }

    public static int calcPlayerAttack(String a) {
        int attack = 0;
        switch (a) {
            case "B":
                attack = 0;
                break;
            case "G":
                attack += 5;
                break;
            case "D":
                attack += 2;
                break;
            case "P":
                attack += 1;
                break;
            case "R":
                attack += 4;
                break;
            case "K":
                attack += 3;
                break;
        }
        return attack;
    }

    public static int calcNeededFuelAmount(double years, double fuelType, double mass) throws PuzzleControlExceptions {
        double gallonsOfFuel;

        //Boundary Check
        if (years < 0) {
            throw new PuzzleControlExceptions("Cannot travel a negative amount of years.");
        }
        if (mass < 0 || mass > 1000) {
            throw new PuzzleControlExceptions("Mass of ship out of range.");
        }

        //fuel calculation
        if (fuelType == 1) {
            gallonsOfFuel = Math.sqrt((years * mass) / 50);
        } else if (fuelType == 2) {
            gallonsOfFuel = Math.sqrt((years * mass) / 100);
        } else if (fuelType == 3) {
            gallonsOfFuel = Math.sqrt((years * mass) / 200);
        } else {
            throw new PuzzleControlExceptions("Invalid fuel type.");
        }

        //remove trailing numbers
        gallonsOfFuel = (int) gallonsOfFuel;

        //final fuel error check
        if (gallonsOfFuel < 0) {
            throw new PuzzleControlExceptions("Cannot have a negative amount of fuel.");
        }
        //Special case. You need at least 1 gallon of fuel to time travel!
        if (gallonsOfFuel == 0) {
            throw new PuzzleControlExceptions("Cannot travel on 0 gallons of fuel.");
        }

        return (int) gallonsOfFuel;
    }

    public static double calcDrillDepth(String drillBit) throws PuzzleControlExceptions {
        //Define variables.
        double drillDepth = 0.0;
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
            case "S":
                return drillDepth;
            default:
                throw new PuzzleControlExceptions("Invalid drill bit selected.");
        }

        //Calculate drillDepth of drillBit Type.
        drillDepth = Math.sqrt((bitWidth % 7) / .125);

        return drillDepth;
    }
    // Calculate Damage Function //

    public static double calcDamage(double stamina, int weaponType, int blockAttack, double health) throws PuzzleControlExceptions {

        // Boundary Check // 
        if (stamina < 0 || stamina > 100) {
            throw new PuzzleControlExceptions("Stamina must be between 0 and 100.");
        }
        if (weaponType < 0 || weaponType > 3) {
            throw new PuzzleControlExceptions("Weapon type must be between 0 and 3");
        }
        if (blockAttack < 0 || blockAttack > 4) {
            throw new PuzzleControlExceptions("Block Attack must be between o and 4.");
        }
        if (health < 0 || health > 100) {
            throw new PuzzleControlExceptions("Health must be between 0 and 100.");
        }

        // Calculate Amount of Damage //
        double damage = ((stamina / ((double) weaponType * (double) blockAttack)) + health);
        return damage;
    }

    /**
     * hardestBoss Function
     *
     * Calculates and returns the boss that has the highest attack points.
     */
    public static void hardestBoss() {
        // Get array with names of bosses.
        BossNames[] names = BossNames.values();

        // Get array of damage/attack points of the bosses.
        Boss boss = new Boss();
        int bossDamage[] = boss.getBossDamage();

        // Calculate max damage/attack points using for-each loop.
        int maxDamage = bossDamage[0];
        for (int damage : bossDamage) {
            if (damage > maxDamage) {
                maxDamage = damage;
            }
        }

        // Search array for maxDamage to calculate index.
        int index = -1;
        for (int i = 0; i < bossDamage.length; i++) {
            if (bossDamage[i] == maxDamage) {
                index = i;
            }
        }

        if (index != -1) {
            console.println("The boss with the greatest attack points is " + names[index] + ".");
        }
    }

    public enum BossNames {

        Jarik,
        Nazeem,
        Chaotica;
    }

}
