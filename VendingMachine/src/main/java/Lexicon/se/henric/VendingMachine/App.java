package Lexicon.se.henric.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;

import model.Drink;
import model.Product;
import model.VeganSnack;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Product> products = new ArrayList<Product>();
    	products.add(new Drink("Cuba Cola", 10));
    	products.add(new VeganSnack("LentilChips", 10));
    	products.add(new VeganRoll("HummusRoll",30));
    	
    	new VendingMachine(products);
    }
}
