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
 * @author matiasmikkola
 */
public class Location implements Serializable {
    
    private Boolean visited;
    private Boolean active;
    private Object boss;
    private int puzzle;
    private String sceneDescription;
    private Point coordinates;
    
    
    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getBoss() {
        return boss;
    }

    public void setBoss(Object boss) {
        this.boss = boss;
    }

    public int getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int puzzle) {
        this.puzzle = puzzle;
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
}


