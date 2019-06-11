package Lexicon.se.henric.VendingMachine;

import model.Product;

public class VeganRoll extends Product {

	public VeganRoll(String name, int price) {
		//if kcal unspecified, 400 is given);
		this(name, price,400);
		
	}
	
	public VeganRoll(String name, int price, int caloriesInKcal) {
		super(name, price, caloriesInKcal);
		
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		// TODO Auto-generated method stub
		return null;
	}

}
