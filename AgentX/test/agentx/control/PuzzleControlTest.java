///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package agentx.control;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Chris
// */
//public class PuzzleControlTest {
//    
//	public PuzzleControlTest() {
//	}
//
//	/**
// 	* Test of calcNeededFuelAmount method, of class PuzzleControl.
// 	*/
//	@Test
//	public void testCalcNeededFuelAmount() {
//    	System.out.println("calcNeededFuelAmount");
//    	/************
//    	*TEST CASE #1 - calcNeededFuel
//    	*************/
//    	System.out.println("\tTest case #1");
//    	double years = 200.0;
//    	double fuelType = 1.0;
//    	double mass = 300.0;
//    	double expResult = 34.0;
//   	 
//    	PuzzleControl instance = new PuzzleControl();
//   	 
//    	double result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//   	 
//     	/************
//    	*TEST CASE #2 - calcNeededFuel
//    	*************/
//     	System.out.println("\tTest case #2");
//    	years = 400.0;
//    	fuelType = 6.0;
//    	mass = 50.0;
//    	expResult = -1.0;
//   	 
//    	result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//           	 
//     	/************
//    	*TEST CASE #3 - calcNeededFuel
//    	*************/
//     	System.out.println("\tTest case #3");
//    	years = 0.0;
//    	fuelType = 0.0;
//    	mass = 100.0;
//    	expResult = -1.0;
//   	 
//    	result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//           	 
//     	/************
//    	*TEST CASE #4 - calcNeededFuel
//    	*************/
//     	System.out.println("\tTest case #4");
//    	years = -1.0;
//    	fuelType = 2.0;
//    	mass = 600.0;
//    	expResult = -1.0;
//   	 
//    	result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//           	 
//     	/************
//    	*TEST CASE #5 - calcNeededFuel
//    	*************/
//     	System.out.println("\tTest case #5");
//    	years = 1.0;
//    	fuelType = 1.0;
//    	mass = 1.0;
//    	expResult = 1.0;
//   	 
//    	result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//           	 
//     	/************
//    	*TEST CASE #6 - calcNeededFuel
//    	*************/
//    	System.out.println("\tTest case #6");
//    	years = 1000.0;
//    	fuelType = 3.0;
//    	mass = 1000.0;
//    	expResult = 70.0;
//   	 
//    	result = PuzzleControl.calcNeededFuelAmount(years, fuelType, mass);
//    	assertEquals(expResult, result, 0.0);
//	}
//
//	/**
// 	* Test of calcEntrance method, of class PuzzleControl.
// 	*/
//	@Test
//	public void testCalcEntrance() {
//    	System.out.println("calcEntrance");
//   	 
//    	/***************************
//    	*Test Case #1 - calcEntrance
//    	****************************/
//    	System.out.println("\tTest case #1");
//    	double x = 0.0;
//    	boolean expResult = false;
//    	boolean result = PuzzleControl.calcEntrance(x);
//    	assertEquals(expResult, result);
//   	 
//    	/***************************
//    	*Test Case #2 - calcEntrance
//    	****************************/
//    	System.out.println("\tTest case #2");
//    	x = -7.0;
//    	expResult = false;
//    	result = PuzzleControl.calcEntrance(x);
//    	assertEquals(expResult, result);
//   	 
//    	/***************************
//    	*Test Case #3 - calcEntrance
//    	****************************/
//    	System.out.println("\tTest case #3");
//    	x = 6.0;
//    	expResult = true;
//    	result = PuzzleControl.calcEntrance(x);
//    	assertEquals(expResult, result);
//	}
//
//	/**
// 	* Test of calcDrillDepth method, of class PuzzleControl.
// 	*/
//	@Test
//	public void testCalcDrillDepth() {
//    	System.out.println("calcDrillDepth");
//   	 
//    	/***************************
//    	*Test Case #1 - calcDrillDepth
//    	****************************/
//    	System.out.println("\tTest case #1");
//   	 
//    	String drillBit = "1";
//    	double expResult = 6.93;
//    	double result = PuzzleControl.calcDrillDepth(drillBit);
//    	assertEquals(expResult, result, 0.01);
//   	 
//    	/***************************
//    	*Test Case #2 - calcDrillDepth
//    	****************************/
//    	System.out.println("\tTest case #2");
//   	 
//    	drillBit = "2";
//    	expResult = 4;
//    	result = PuzzleControl.calcDrillDepth(drillBit);
//    	assertEquals(expResult, result, 0.01);
//   	 
//    	/***************************
//    	*Test Case #3 - calcDrillDepth
//    	****************************/
//    	System.out.println("\tTest case #3");
//   	 
//    	drillBit = "3";
//    	expResult = -1;
//    	result = PuzzleControl.calcDrillDepth(drillBit);
//    	assertEquals(expResult, result, 0.01);
//	}
//
//	/**
// 	* Test of calcDamage method, of class PuzzleControl.
// 	*/
//	@Test
//	public void testCalcDamage() {
//    	System.out.println("calcDamage");
//   	 
//    	// TEST 1
//    	System.out.println("\tTest 1");
//    	double stamina = 50.0;
//    	int weaponType = 2;
//    	int blockAttack = 1;
//    	double health = 20.0;
//    	double expResult = 45.0;
//    	double result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//   	 
//    	// TEST 2
//    	System.out.println("\tTest 2");
//    	stamina = 999.0;
//    	weaponType = 2;
//    	blockAttack = 2;
//    	health = 40.0;
//    	expResult = -1;
//    	result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//   	 
//            	// TEST 3
//    	System.out.println("\tTest 3");
//    	stamina = 20;
//    	weaponType = 10;
//    	blockAttack = 3;
//    	health = 30.0;
//    	expResult = -1;
//    	result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//   	 
//                    	// TEST 4
//    	System.out.println("\tTest 4");
//    	stamina = 30;
//    	weaponType = 1;
//    	blockAttack = 0;
//    	health = -1;
//    	expResult = -1;
//    	result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//   	 
//                    	// TEST 5
//    	System.out.println("\tTest 5");
//    	stamina = 100.0;
//    	weaponType = 1;
//    	blockAttack = 4;
//    	health = 100.0;
//    	expResult = 125.0;
//    	result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//   	 
//                    	// TEST 6
//    	System.out.println("\tTest 6");
//    	stamina = 0.0;
//    	weaponType = 1;
//    	blockAttack = 1;
//    	health = 0.0;
//    	expResult = 0.0;
//    	result = PuzzleControl.calcDamage(stamina, weaponType, blockAttack, health);
//    	assertEquals(expResult, result, 0.0);
//	}
//	}