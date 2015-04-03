/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import java.io.PrintWriter;

/**
 *
 * @author Chris
 */
public class ErrorView {

    private static final PrintWriter errorFile = AgentX.getOutFile();
    private static final PrintWriter logFile = AgentX.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println("\n Error: " + errorMessage);
        logFile.println(className + " - " + errorMessage);
    }
}
