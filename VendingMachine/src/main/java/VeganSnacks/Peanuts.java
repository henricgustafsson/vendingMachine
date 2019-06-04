package VeganSnacks;

import model.Product;

public class Peanuts extends VeganSnacks {

	public Peanuts(String Name, int price) {
		super(Name, price);
		
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		return "Peanuts are salty roasted and delicious! Yum!";
		
	}

	
	
}
