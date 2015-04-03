/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.exceptions.InventoryControlExceptions;
import agentx.model.FuelContainer;
import agentx.model.Location;
import agentx.model.TimeShip;
import agentx.model.Weapon;
import agentx.model.Weapons_Belt;
import agentx.view.L0View;
import agentx.view.L10View;
import agentx.view.L20View;
import agentx.view.L21View;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class InventoryControl {

    protected final static PrintWriter console = AgentX.getOutFile();
    protected final static BufferedReader keyboard = AgentX.getInFile();

    public static boolean hammer() {
        return true;
    }

    public static boolean welder() {
        return true;
    }

    public static boolean wrench() {
        return true;
    }

    public static boolean drill() {
        return true;
    }

    public static int grenade() {
        return 7;
    }

    public static int darts() {
        return 23;
    }

    public static boolean gun() {
        return true;
    }

    public static boolean knife() {
        return true;
    }

    public static double fuel() {
        return 97.3;
    }

    public static String getDrillBit() {

        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {

                console.println("Choose drillbit:");
                selection = keyboard.readLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

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

    public static void findWeapon(Object obj) throws InventoryControlExceptions {
        if (obj == null) {
            throw new InventoryControlExceptions("You have entered an invalid input");
        }
        String weapon = (String) obj;
        Weapons[] names = Weapons.values();

        Weapons_Belt name = new Weapons_Belt();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
//            console.println(names[i]);
            if (names[i].getName().toUpperCase().equals(weapon.toUpperCase())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            console.println(weapon + " is at index location " + index + ".");
        }
    }

    public enum Weapons {

        Grenades("Grenades"),
        Darts("Darts"),
        Knife("Knife"),
        Gun("Gun");
        private final String name;

        Weapons(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static ArrayList<Weapon> createWeaponsList() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon(1, "Ray Gun"));
        weapons.add(new Weapon(1, "Knife"));
        weapons.add(new Weapon(5, "Darts"));
        weapons.add(new Weapon(3, "Grenades"));
        return weapons;
    }

    public static void AddFuel1(double gallons) {
        double currentFuel = L0View.ship1.fuel.getGallons();
        double newFuel = currentFuel + gallons;
        L0View.ship1.fuel.setGallons(newFuel);
    }
    public static void AddFuel2(double gallons) {
        double currentFuel = L10View.ship2.fuel.getGallons();
        double newFuel = currentFuel + gallons;
        L10View.ship2.fuel.setGallons(newFuel);
    }
    public static void AddFuel3(double gallons) {
        double currentFuel = L20View.ship3.fuel.getGallons();
        double newFuel = currentFuel + gallons;
        L20View.ship3.fuel.setGallons(newFuel);
    }
}
