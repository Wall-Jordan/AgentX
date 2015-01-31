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


public class TakeOff implements Serializable{
    private double instructions;

    public TakeOff(double instructions) {
        this.instructions = instructions;
        
        
    }

    @Override
    public String toString() {
        return "TakeOff{" + "instructions=" + instructions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.instructions) ^ (Double.doubleToLongBits(this.instructions) >>> 32));
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
        final TakeOff other = (TakeOff) obj;
        if (Double.doubleToLongBits(this.instructions) != Double.doubleToLongBits(other.instructions)) {
            return false;
        }
        return true;
    }

    
    
    public double getInstructions() {
        return instructions;
    }

    public void setInstructions(double instructions) {
        this.instructions = instructions;
    }

}
