/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Weapons_Belt extends Inventory implements Serializable {

    private String beltItems;

    public Weapons_Belt() {
    }

    public String getBeltItems() {
        return beltItems;
    }

    public void setBeltItems(String beltItems) {
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
        final Weapons_Belt other = (Weapons_Belt) obj;
        if (!Objects.equals(this.beltItems, other.beltItems)) {
            return false;
        }
        return true;
    }

}
