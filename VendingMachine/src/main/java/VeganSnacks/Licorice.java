package VeganSnacks;

import model.Product;

public class Licorice extends VeganSnacks {

	public Licorice(String Name, int price) {
		super(Name, price);
		
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		
		return "Salmiak goodness,yum yum!";
	}

}
