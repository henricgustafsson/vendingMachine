package VeganSnacks;

import model.Product;

public class LentilChips extends VeganSnacks {

	public LentilChips(String Name, int price) {
		super(Name, price);
		
	}

	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		
		return "Lentil chips are such protein-packed goodness! Yum, yum!";
	}

}
