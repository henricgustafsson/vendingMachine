package Lexicon.se.henric.VendingMachine;

import model.Denominators;
import model.Product;

public interface VendingMachineInterFace {

	
	/*Abstract Methods*/
	
	public String ViewProducts();
	public void AddMoney(Denominators denominator);
	public Product buyProduct(int id);
	public int getChange();
}
