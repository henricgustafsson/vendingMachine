package VeganSnacks;

import model.Product;

public class VeganChocolate extends VeganSnacks {

	public VeganChocolate(String Name, int price) {
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
		
		return "Chocolatey vegan goodness,yum yum";
	}

}
