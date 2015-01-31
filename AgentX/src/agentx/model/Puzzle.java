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
public class Puzzle implements Serializable{
    private double solved;

    public double getSolved() {
        return solved;
    }

    public void setSolved(double solved) {
        this.solved = solved;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.solved) ^ (Double.doubleToLongBits(this.solved) >>> 32));
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
        final Puzzle other = (Puzzle) obj;
        return Double.doubleToLongBits(this.solved) == Double.doubleToLongBits(other.solved);
    }

    @Override
    public String toString() {
        return "Puzzle{" + "solved=" + solved + '}';
    }
    
    
}
