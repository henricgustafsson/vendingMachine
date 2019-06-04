package Drink;

import model.Product;

public class Juice extends Drink {

	public Juice(String Name, int price) {
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
		
		return "Healthy and delicious! O.J is innocent!";
	}

}
