/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.AgentX;
import agentx.exceptions.InventoryControlExceptions;
import agentx.model.Location;
import agentx.model.Weapon;
import agentx.model.Weapons_Belt;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class InventoryControl {

    protected final static PrintWriter console = AgentX.getOutFile();

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
    
    public static ArrayList<Weapon> createWeaponsList(){
    ArrayList<Weapon> weapons = new ArrayList<>();
    weapons.add(new Weapon(1, "Ray Gun"));
    weapons.add(new Weapon(1, "Knife"));
    weapons.add(new Weapon(5, "Darts"));
    weapons.add(new Weapon(3, "Grenades"));
    return weapons;
    }
    
}