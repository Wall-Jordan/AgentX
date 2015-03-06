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
 * @author matiasmikkola
 */
public class Explore implements Serializable {

    private double fuel;
    private String tool;
    private String weapon;
    private String instructions;

    public Explore() {
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Explore{" + "fuel=" + fuel + ", tool=" + tool + ", weapon=" + weapon + ", instructions=" + instructions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.fuel) ^ (Double.doubleToLongBits(this.fuel) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.tool);
        hash = 29 * hash + Objects.hashCode(this.weapon);
        hash = 29 * hash + Objects.hashCode(this.instructions);
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
        final Explore other = (Explore) obj;
        if (Double.doubleToLongBits(this.fuel) != Double.doubleToLongBits(other.fuel)) {
            return false;
        }
        if (!Objects.equals(this.tool, other.tool)) {
            return false;
        }
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        if (!Objects.equals(this.instructions, other.instructions)) {
            return false;
        }
        return true;
    }
}
