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
 * @author Jordan
 */
public class TimeShip implements Serializable {

    public FuelContainer fuel = new FuelContainer();
    
    private boolean status;
    private String description;

    public TimeShip() {
        this.description = "\nThis is the description of the TimeShip";
        this.status = false;
        fuel.setGallons(0);
    }
    

    public FuelContainer getFuel() {
        return fuel;
    }

    public void setFuel(FuelContainer fuel) {
        this.fuel = fuel;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TimeShip{" + "fuel=" + fuel + ", status=" + status + ", description=" + description + '}';
    }

}
