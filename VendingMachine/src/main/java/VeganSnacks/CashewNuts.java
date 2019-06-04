package VeganSnacks;

import model.Product;

public class CashewNuts extends VeganSnacks {
	
	public CashewNuts(String Name, int price) {
		super(Name, price);
		
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		return "Cashews are salty roasted and delicious! Yum!";
		
	}
}
