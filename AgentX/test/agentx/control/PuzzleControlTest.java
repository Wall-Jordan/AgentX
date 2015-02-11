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
        /************
        *TEST CASE #1 - calcNeededFuel
        *************/
        System.out.println("\tTest case #1");
        double years = 200.0;
        double fuelType = 1.0;
        double mass = 300.0;
        double expResult = 34.0;
        
        PuzzleControl instance = new PuzzleControl();
        
        double result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
        
         /************
        *TEST CASE #2 - calcNeededFuel
        *************/
         System.out.println("\tTest case #2");
        years = 400.0;
        fuelType = 6.0;
        mass = 50.0;
        expResult = -1.0;
        
        result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
                
         /************
        *TEST CASE #3 - calcNeededFuel
        *************/
         System.out.println("\tTest case #3");
        years = 0.0;
        fuelType = 0.0;
        mass = 100.0;
        expResult = -1.0;
        
        result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
                
         /************
        *TEST CASE #4 - calcNeededFuel
        *************/
         System.out.println("\tTest case #4");
        years = -1.0;
        fuelType = 2.0;
        mass = 600.0;
        expResult = -1.0;
        
        result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
                
         /************
        *TEST CASE #5 - calcNeededFuel
        *************/
         System.out.println("\tTest case #5");
        years = 1.0;
        fuelType = 1.0;
        mass = 1.0;
        expResult = 1.0;
        
        result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
                
         /************
        *TEST CASE #6 - calcNeededFuel
        *************/
        System.out.println("\tTest case #6");
        years = 1000.0;
        fuelType = 3.0;
        mass = 1000.0;
        expResult = 70.0;
        
        result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
        assertEquals(expResult, result, 0.0);
    }
    
}
