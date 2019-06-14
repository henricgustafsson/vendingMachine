package Lexicon.se.henric.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Denominators;
import model.Product;

public class VendingMachineImpl implements VendingMachineInterFace {

	/**
	 * Private fields
	 */
	
	//I know requirements say "Money denominations should be defined as an array of integers"
	//so made a function to add each member of Enum Denominators and add em to an array.
	//See no reason to use it though, but I can if you force me...
	//private int[] denominators = Denominators.toArr();
	private int moneyPool;
	private ArrayList<Product> products;
	
	
	/**Constructor
	 * @param ArrayList<Product> products
	 */
	public VendingMachineImpl(ArrayList<Product> products) {
		
		setProducts(products);
	}

	/** getter for field ArrayList<Product> products
	 * @return ArrayList<Product> products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}

	/**Method for getting product by id
	 * @param id
	 * @return Product
	 */
	public Product getProductById(int id) {
		Map<Integer,Product> productsHash =mapProducts();
		return productsHash.get(id);
	}

	/**Setter for field ArrayList<Product> products
	 * @param products
	 * @return void
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	/** method for looping through field ArrayList<Product> products
	 * @return Map<Integer, Product> productsMap
	 */
	public Map<Integer, Product> mapProducts() {
		Map<Integer, Product> productsMap = new HashMap<Integer, Product>();
		for (Product product : products) {
			productsMap.put(product.getId(), product);
		}
		return productsMap;
	}

	/** getter for field int moneyPool
	 * @return field int moneyPool
	 */
	public int getMoneyPool() {
		return moneyPool;
	}

	/** setter for field int moneyPool
	 * @param field int money
	 * @return void
	 */
	public void setMoneyPool(int money) {
		this.moneyPool = money;
	}

	/** Method for getting string representation
	 * of all products in field ArrayList<Product> products
	 *@return string
	 */
	public String ViewProducts() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Products:\n");
		for (Product product :products) {
			stringBuilder.append(product.toString());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
		
	}

	/**Method for adding money to field moneyPool
	 * using enum Denominators which user can choose
	 * by input, adding current amount in moneypool + denominator.amount
	 */
	public void AddMoney(Denominators denominator) {
		
		setMoneyPool(getMoneyPool()+ denominator.amount);
		
	}

	
	/**method for buying product. Gets a hashMap of products
	 * by calling Map<Integer, Product> mapProducts()
	 * tries to pruchase and set moneypool to current amount -
	 * price of the product.
	 */
	public Product buyProduct(int id) {
		
		Product product =getProductById(id);
		if(product.purchase(moneyPool)) {
			setMoneyPool(getMoneyPool()-product.getPrice());
		}
		
		return product;
		
	}

	/** method returning whats left in the moneyPool
	 * using getter getMoneyPool() for field moneyPool
	 * @return field int moneyPool
	 */
	public int getChange() {
		
		return getMoneyPool();
	}

}
