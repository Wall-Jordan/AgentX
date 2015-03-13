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
public class Game implements Serializable {

    private String gameName;
    private String saveTime;
    
    private TimeShip timeShip;

    public TimeShip getTimeShip() {
        return timeShip;
    }

    public void setTimeShip(TimeShip timeShip) {
        this.timeShip = timeShip;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
    private Player player;
    private GameBoard gameBoard;

    private Inventory[] inventory;
    private Actor[] actor;
    
           
    public Game() {
    }

            
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(String saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "Game{" + "gameName=" + gameName + ", saveTime=" + saveTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.gameName);
        hash = 79 * hash + Objects.hashCode(this.saveTime);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameName, other.gameName)) {
            return false;
        }
        if (!Objects.equals(this.saveTime, other.saveTime)) {
            return false;
        }
        return true;
    }

}
