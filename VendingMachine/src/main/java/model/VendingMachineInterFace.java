package model;

public interface VendingMachineInterFace {
	
	public int addMoney(int money);
	public Product buyProduct(int money, int productId) throws Exception;
	public int returnChange();
	public String presentProduct();
	public int getBalance();
	

}
