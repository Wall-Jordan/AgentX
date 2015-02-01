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
public class Explore implements Serializable{
    private double fuel;
    private double tool;
    private double weapon;
    private double instructions;

    public Explore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTool() {
        return tool;
    }

    public void setTool(double tool) {
        this.tool = tool;
    }

    public double getWeapon() {
        return weapon;
    }

    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }

    public double getInstructions() {
        return instructions;
    }

    public void setInstructions(double instructions) {
        this.instructions = instructions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.fuel) ^ (Double.doubleToLongBits(this.fuel) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.tool) ^ (Double.doubleToLongBits(this.tool) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.weapon) ^ (Double.doubleToLongBits(this.weapon) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.instructions) ^ (Double.doubleToLongBits(this.instructions) >>> 32));
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
        if (Double.doubleToLongBits(this.tool) != Double.doubleToLongBits(other.tool)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weapon) != Double.doubleToLongBits(other.weapon)) {
            return false;
        }
        if (Double.doubleToLongBits(this.instructions) != Double.doubleToLongBits(other.instructions)) {
            return false;
        }
        return true;
    }

    public Explore(double fuel, double tool, double weapon, double instructions) {
        this.fuel = fuel;
        this.tool = tool;
        this.weapon = weapon;
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Explore{" + "fuel=" + fuel + ", tool=" + tool + ", weapon=" + weapon + ", instructions=" + instructions + '}';
    }
            
    
}
