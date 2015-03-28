/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.view;

import agentx.control.InventoryControl;
import static agentx.control.InventoryControl.createWeaponsList;
import agentx.exceptions.InventoryControlExceptions;
import agentx.model.Weapon;
import agentx.view.ViewInterface.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class WeaponsReportView extends View {

    WeaponsReportView() {
        super("Please enter the file path to save your report.");
    }

    @Override
    public boolean doAction(Object obj) {

        String filePath = (String) obj;
        ArrayList<Weapon> weaponsArray = createWeaponsList();

        try (FileWriter fw = new FileWriter(filePath, false)) {
            fw.write("WEAPON NAME         QUANITITY");
            try {
                for (int i = 0; i < weaponsArray.size(); i++) {
                    Weapon weapon = weaponsArray.get(i);
                    fw.write(weapon.getName() + "         " + weapon.getQuantity());
                    fw.write("\n<-->");
                }
                console.println("Write Successful!");
            } catch (IOException exc) {
                ErrorView.display("WeaponsReportView.java", exc.getMessage());
            }
        } catch (Exception ex) {
            ErrorView.display("WeaponsReportView.java", ex.getMessage());
        }

        return true;
    }
}
