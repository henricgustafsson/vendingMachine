package Lexicon.se.henric.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Product;

public class VendingMachine implements VendingMachineInterFace {

	
	int[] denominations;
	int moneyPool;
	ArrayList<Product> products;
	
	
	public VendingMachine(ArrayList<Product> products) {
		products = new ArrayList<Product>();
		setProducts(products);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}



	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	private Map<Integer, Product> mapProducts(ArrayList<Product> products) {
		Map<Integer, Product> productsMap = new HashMap<Integer, Product>();
		for (Product product : products) {
			productsMap.put(product.getId(), product);
		}
		return productsMap;
	}

	public int[] getDenominations() {
		return denominations;
	}

	public void setDenominations(int[] denominations) {
		this.denominations = denominations;
	}

	public int getMoneyPool() {
		return moneyPool;
	}

	public void setMoneyPool(int moneyPool) {
		this.moneyPool = moneyPool;
	}

	public String ViewProducts() {
		
		
		
		return null;
	}

	public Void AddMoney(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product buyProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getChange() {
		// TODO Auto-generated method stub
		return 0;
	}

}
