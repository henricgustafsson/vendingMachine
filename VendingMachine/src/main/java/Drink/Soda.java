package Drink;

import model.Product;

public class Soda extends Drink {

	public Soda(String Name, int price) {
		super(Name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		
		return "Carbonated sugarwater is yummy!";
	}

}
