/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class WeaponsBelt extends Inventory implements Serializable {

    private ArrayList<Weapon> beltItems = new ArrayList<>();

    public WeaponsBelt() {
    }
    
    public void addWeapon(String name, int damage){
        beltItems.add(new Weapon(name, damage));
    }
    public ArrayList<Weapon> getBeltItems() {
        return beltItems;
    }

    public void setBeltItems(ArrayList<Weapon> beltItems) {
        this.beltItems = beltItems;
    }

    @Override
    public String toString() {
        return "Weapons_Belt{" + "beltItems=" + beltItems + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.beltItems);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeaponsBelt other = (WeaponsBelt) obj;
        if (!Objects.equals(this.beltItems, other.beltItems)) {
            return false;
        }
        return true;
    }

}
