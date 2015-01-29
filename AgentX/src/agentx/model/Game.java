/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.model;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class Game implements Serializable{
    private String gameName;
    private int[] gameData;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int[] getGameData() {
        return gameData;
    }

    public void setGameData(int[] gameData) {
        this.gameData = gameData;
    }
    
    
    
}
