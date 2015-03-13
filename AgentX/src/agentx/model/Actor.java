/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jordan
 */
public enum Actor implements Serializable {

    AgentX("The Main Character."),
    Chaotica("Villain"),
    Boss1("Boss1"),
    Boss2("Boss2");

    private final double stamina;
    private final String description;
    private final int type;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
        stamina = 10;
        type = 2;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {

    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }

    public void setType(String type) {

    }

    @Override
    public String toString() {
        return "Actor{" + "stamina=" + stamina + ", description=" + description + ", type=" + type + ", coordinates=" + coordinates + '}';
    }

    public void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
