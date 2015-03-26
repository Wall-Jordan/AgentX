/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.AgentX;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public interface ViewInterface {

    public void display();

    public String getInput();

    public boolean doAction(Object obj);

    public abstract class View implements ViewInterface {

        private String promptMessage;
        protected final BufferedReader keyboard = AgentX.getInFile();
        protected final PrintWriter console = AgentX.getOutFile();

        public View(String promptMessage) {
            this.promptMessage = promptMessage;
        }

        @Override
        public void display() {
            String value;
            boolean done = false;

            do {

                console.println(this.promptMessage);
                value = this.getInput();
                done = this.doAction(value);

            } while (!done);
        }

        @Override
        public String getInput() {

            boolean valid = false;
            String selection = null;
            try {
                while (!valid) {

                    console.println("Enter your selection");
                    selection = this.keyboard.readLine();
                    selection = selection.trim();
                    selection = selection.toUpperCase();

                    if (selection.length() < 1) {

                        console.println("Invalid Selection. Please try again.");
                        continue;

                    }
                    break;
                }
            } catch (Exception e) {
                console.println("Error reading input: " + e.getMessage());
            }

            return selection;

        }

        public String getPromptMessage() {
            return promptMessage;
        }

        public void setPromptMessage(String message) {
            this.promptMessage = message;
        }

    }

}
