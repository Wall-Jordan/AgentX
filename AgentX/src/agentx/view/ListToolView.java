/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.model.Tool;
import agentx.view.ViewInterface.View;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matiasmikkola
 */
public class ListToolView extends View {

    ListToolView() {
        super("Please enter the file path to save your list.");
    }

    @Override
    public boolean doAction(Object obj) {

        String filePath = (String) obj;
        ArrayList<Tool> ListTools = agentx.control.GameControl.createToolList();

        try (FileWriter fw = new FileWriter(filePath, false)) {
            try {
                for (int i = 0; i < ListTools.size(); i++) {
                    Tool tool = ListTools.get(i);
                    fw.write("Tool: " + tool.getName() + "\tQuantity: " + tool.getQuantity());
                    fw.write(System.getProperty("line.separator"));

                }

                console.println("Write Successful!");
            } catch (IOException exc) {
                ErrorView.display("ListToolView.java", exc.getMessage());
            }
        } catch (Exception ex) {
            ErrorView.display("ListToolView.java", ex.getMessage());
        }
        return true;

    }
}
