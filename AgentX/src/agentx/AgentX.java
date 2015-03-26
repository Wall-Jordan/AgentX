/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx;

import agentx.model.Game;
import agentx.model.Player;
import agentx.view.ErrorView;
import agentx.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author matiasmikkola
 */
public class AgentX {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            AgentX.inFile = new BufferedReader(new InputStreamReader(System.in));
            AgentX.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            AgentX.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
        } finally {
            try {
                if (AgentX.inFile != null) {
                    AgentX.inFile.close();
                }

                if (AgentX.outFile != null) {
                    AgentX.outFile.close();
                }
                if (AgentX.logFile != null) {
                    AgentX.logFile.close();
                }
            } catch (IOException ex) {
                ErrorView.display("AgentX.java","Error closing files");
                return;
            }
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AgentX.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AgentX.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        AgentX.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        AgentX.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        AgentX.logFile = logFile;
    }

}
