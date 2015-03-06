/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

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

        public View(String promptMessage) {
            this.promptMessage = promptMessage;
        }

        @Override
        public void display() {
            String value;
            boolean done = false;

            do {

                System.out.println(this.promptMessage);
                value = this.getInput();
                boolean result = this.doAction(value);

                done = this.doAction(value);

            } while (!done);
        }

        @Override
        public String getInput() {

            Scanner keyboard = new Scanner(System.in);
            boolean valid = false;
            String selection = null;

            while (!valid) {

                System.out.println("Enter your selection");
                selection = keyboard.nextLine();
                selection = selection.trim();
                selection = selection.toUpperCase();

                if (selection.length() < 1) {

                    System.out.println("Invalid Selection. Please try again.");
                    continue;

                }
                break;

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
