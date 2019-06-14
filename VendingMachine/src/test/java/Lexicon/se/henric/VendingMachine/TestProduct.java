package Lexicon.se.henric.VendingMachine;

import org.junit.Before;
import org.junit.Test;

import model.Drink;
import model.Product;
import model.VeganRoll;
import model.VeganSnack;

import static org.junit.Assert.*;

public class TestProduct {

	Product testProduct;
	Product testProduct2;
	Drink testProduct3;
	int testProdID;
	
	
	@SuppressWarnings("unused")
	@Before
	public void init() {
		//new product ([String name],[int price], [int caloriesInKcal])
		testProduct = new VeganSnack("testProd",100);
		testProdID = testProduct.getId();	
		testProduct2 = new VeganRoll("testProd2",100);
		testProduct3 = new Drink("testDrink",100);
	}
	
	
	@Test
	public void getinKiloJoules() {
		//1 kcal = 4.18400 kilojoules so rounded down to 4
		//caloriesInKcal = 20000 * 4 = 4000 so
		//expecting 8000
		int expected =8000;
		assertTrue(testProduct.getCaloriesInKiloJoules() == expected);
	}
	 
	@Test
	public void getinKCal() {		
		int expected = 2000;
		assertTrue(testProduct.getCaloriesInKcal() == expected);
	}
	
	@Test
	public void getName() {		
		String expected ="testprod";
		assertTrue(testProduct.getName().equalsIgnoreCase(expected));
	}
	
	@Test
	public void getPrice() {		
		int expected =100;
		assertTrue(testProduct.getPrice() == expected);
	}
	
	//getID should be private but having it public makes testing vendingMachineImpl so
	//much easier so IDC
	@Test
	public void getID() {		
		int expected = testProdID;
		assertTrue(testProduct.getId() == expected);
	}
	
	@Test
	public void buyProductWithInsufficientFundsShouldReturnFalse() {
		assertFalse(testProduct.purchase(1));
	}
	
	@Test
	public void buyProductWithSsufficientFundsShouldReturnTrue() {
		assertTrue(testProduct2.purchase(1000));
	}
	
	@Test
	//Since none was given when initizializing, should be standardvalue of 33
	public void getVolumeInCentilitersShouldBeThirtyThree() {
		assertTrue(testProduct3.getVolumeInCentiliters() ==33);
	}
}
