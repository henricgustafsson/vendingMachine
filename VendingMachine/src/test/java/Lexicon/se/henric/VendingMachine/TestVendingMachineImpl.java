package Lexicon.se.henric.VendingMachine;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Denominators;
import model.Drink;
import model.Product;
import model.VeganRoll;
import model.VeganSnack;

public class TestVendingMachineImpl {

	ArrayList<Product> testProductsList;
	VendingMachineImpl testVendingMachine;
	VeganSnack delicato;

	@Before
	public void init() {
		testProductsList = new ArrayList<Product>();
    	testProductsList.add(new Drink("Cuba Cola", 10));
    	testProductsList.add(new VeganSnack("LentilChips", 10));
    	testProductsList.add(new VeganRoll("HummusRoll",30));
    	//Delicatobollar are the best vegan fika!
    	delicato =new VeganSnack("delicato",20);
		testProductsList.add(delicato);
    	
    	
    	testVendingMachine =new VendingMachineImpl(testProductsList);
	}
	
	@Test
	public void testIfGetProductsReturnsProductsList() {
		assertTrue(testVendingMachine.getProducts().equals(testProductsList));
	}
	
	@Test
	public void testIfDelicatoIDReturnsDelicato(){
		Product shouldBeDelicato =testVendingMachine.getProductById(delicato.getId());
		assertTrue(shouldBeDelicato.equals(delicato));
		
	
	}
	
	@Test
	public void addOneHundredGetMoneyPoolShouldReturnOneHundred() {
		testVendingMachine.setMoneyPool(0);
		testVendingMachine.AddMoney(Denominators.ONEHUNDRED);
		assertTrue(testVendingMachine.getMoneyPool() == Denominators.ONEHUNDRED.amount);
		//while we're at it, might as well test getChange
		assertTrue(testVendingMachine.getChange() == Denominators.ONEHUNDRED.amount);
	
	}
	
	@Test
	public void buyProductShouldReturnDelicato() {
		testVendingMachine.setMoneyPool(0);
		testVendingMachine.AddMoney(Denominators.ONEHUNDRED);
		Product shouldBeDelicato = testVendingMachine.buyProduct(delicato.getId());
		
		assertTrue(shouldBeDelicato.equals(delicato));
		
		assertTrue(testVendingMachine.getMoneyPool() == Denominators.ONEHUNDRED.amount - delicato.getPrice());
		
	}
	
	//Only untested method is ViewProducts because its a string representation of objects so
	//fudge that !
	

}
