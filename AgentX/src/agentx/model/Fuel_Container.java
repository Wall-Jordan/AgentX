/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author Chris
 */
public class Fuel_Container implements Serializable {

    private double gallons;

    public Fuel_Container() {
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    @Override
    public String toString() {
        return "Fuel_Container{" + "gallons=" + gallons + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.gallons) ^ (Double.doubleToLongBits(this.gallons) >>> 32));
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
        final Fuel_Container other = (Fuel_Container) obj;
        if (Double.doubleToLongBits(this.gallons) != Double.doubleToLongBits(other.gallons)) {
            return false;
        }
        return true;
    }

}
