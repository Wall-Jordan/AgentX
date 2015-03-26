/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import agentx.AgentX;
import agentx.control.GameControl;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class GameBoard implements Serializable {
protected final static PrintWriter console = AgentX.getOutFile();
    private int section;
    private int block;
    private boolean visited;
    private Location[][] locations;

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    private Scene scene;
    private ArrayList<Actor> actors;

    private static GameBoard createGameBoard() {
        GameBoard gameBoard = new GameBoard(3, 10);      
        return gameBoard;
        
    }
    
    
    public GameBoard() {
    }
    
    public GameBoard(int noOfSection, int noOfBlock) {
        
        if (section < 1 || block < 1) {
            console.println("Section and Block have to be > 0");
            return;
        }
        
        this.locations = new Location[noOfSection][noOfBlock];
        
        for (int section = 0; section < noOfSection; section++) {
            for (int block = 0; block < noOfBlock; block++) {
                Location location = new Location();
                location.setSection(section);
                location.setBlock(block);
                location.setVisited(false);
                
                locations[section][block] = location;
            }
        }
        
        
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "GameBoard{" + "section=" + section + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.section;
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
        final GameBoard other = (GameBoard) obj;
        if (this.section != other.section) {
            return false;
        }
        return true;
    }

}
