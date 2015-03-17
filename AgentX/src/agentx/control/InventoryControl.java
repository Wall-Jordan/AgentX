/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import agentx.model.Weapons_Belt;
import agentx.view.MainMenuView;

/**
 *
 * @author Chris
 */
public class InventoryControl {
    public static boolean hammer()
    {
        return true;
    }
    public static boolean welder()
    {
        return true;
    }
    public static boolean wrench()
    {
        return true;
    }
    public static boolean drill()
    {
        return true;
    }
    public static int grenade()
    {
        return 7;
    }
    public static int darts()
    {
        return 23;
    }
    public static boolean gun()
    {
        return true;
    }
    public static boolean knife()
    {
        return true;
    }
    public static double fuel()
    {
        return 97.3;
    }
        public static void findWeapon(Object obj) {
        
        Weapons[] names = Weapons.values();

        Weapons_Belt boss = new Weapons_Belt();

        int index = -1;
        for (int i = 0; i < names.length - 1; i++) {
            if (names[i] == obj) {
                index = i;
            }
        }

        System.out.println(obj + " is at index location" + names[index] + ".");
    }
    
        public enum Weapons {

        Grenades,
        Darts,
        Knife,
        Gun;
    }
}
