/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author matiasmikkola
 */
public class Combat implements Serializable {
    private double boss;

    public Combat() {
    }

    public double getBoss() {
        return boss;
    }

    public void setBoss(double boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Combat{" + "boss=" + boss + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.boss) ^ (Double.doubleToLongBits(this.boss) >>> 32));
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
        final Combat other = (Combat) obj;
        if (Double.doubleToLongBits(this.boss) != Double.doubleToLongBits(other.boss)) {
            return false;
        }
        return true;
    }   
}
