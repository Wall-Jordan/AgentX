/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentx.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of calcNeededFuelAmount method, of class PuzzleControl.
     */
    @Test
    public void testCalcNeededFuelAmount() {
        System.out.println("calcNeededFuelAmount");
        /*
        *
        */
        double years = 200.0;
        double fuelType = 1.0;
        double mass = 300.0;
        double expResult = 34.0;
        
        PuzzleControl instance = new PuzzleControl();
        
        double result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
