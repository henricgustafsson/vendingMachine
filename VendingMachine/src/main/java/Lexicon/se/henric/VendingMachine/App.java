package Lexicon.se.henric.VendingMachine;

import java.util.ArrayList;
import model.Denominators;
import model.Drink;
import model.Product;
import model.VeganRoll;
import model.VeganSnack;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Product> products = new ArrayList<Product>();
    	products.add(new Drink("Cuba Cola", 10));
    	products.add(new VeganSnack("LentilChips", 10));
    	products.add(new VeganRoll("HummusRoll",30));
    	
    	//
    	VendingMachineImpl vendingMachine =new VendingMachineImpl(products);
    	
    	//prompt user to input money
    	//lets say they choose 100kr
    	vendingMachine.AddMoney(Denominators.ONEHUNDRED);
    	//User chooses to view available products
    	//Print vendingMachine.ViewProducts()
    	/*prodArr =vendingMachine.getProducts().toArray();
    	 * loop em, print i .+" prodArr[i].getName()"
    	 * switch string input get product by id
    		vendingMachine.buyProduct(productid)
    		ECT. ECT */
    	
    	
    	
    	
    	
    	
    	
    }
}
