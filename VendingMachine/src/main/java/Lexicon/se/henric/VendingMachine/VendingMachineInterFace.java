package Lexicon.se.henric.VendingMachine;

import model.Product;

public interface VendingMachineInterFace {

	
	/*Abstract Methods*/
	
	public String ViewProducts();
	public Void AddMoney(int money);
	public Product buyProduct(int id);
	public int getChange();
}
