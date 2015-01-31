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
public class Location implements Serializable {
    private Boolean visited;

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.visited);
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
        final Location other = (Location) obj;
        return Objects.equals(this.visited, other.visited);
    }

    public Location(Boolean visited) {
        this.visited = visited;
    }
      
}
        
        
       
        
    


