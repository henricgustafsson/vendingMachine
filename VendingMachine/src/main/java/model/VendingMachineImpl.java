package model;

import java.util.ArrayList;
import java.util.function.Predicate;

public class VendingMachineImpl implements VendingMachineInterFace {

	
	/**
	 * Private fields
	 */
	private int[] denominations;
	private ArrayList<Product> products;
	private int moneyPool;
	
	
	

	/**
	 * Constructor for VendingMachingeImpl
	 */
	public VendingMachineImpl() {
		setProducts(new ArrayList<Product>());
		setDenominations();
	}

	

	/** Getter for field denominations
	 * @return field int[] denominations
	 */
	public int[] getDenominations() {
		return denominations;
	}



	/** Setter for field denominations
	 * uses enum denominators in order to be able to add
	 * denominators if wanted, making the code a little more
	 * flexible. the size of the field int[] denominations
	 * is dependent on number of denominations in Enum Denominators
	 * which is returned by method Denominators.count().
	 * Loops through denominator, adding each amount to field
	 * int[] denominations.
	 * @return void
	 * 
	 */
	private void setDenominations() {
		denominations = new int[Denominators.count()];
		for (Denominators denominator : Denominators.values()) {
			for (int i = 0; i < denominations.length; i++) {
				denominations[i] = denominator.amount;
			}
		}	
	}



	/** Getter for field products
	 * @return Field ArrayList Products
	 */
	public ArrayList<Product> getProducts() {
	return products;
	}


	/** setter for field products
	 * @param Product products
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}


	

	/** setter for field int moneyPool
	 * @param field int moneyPool
	 */
	private void setMoneyPool(int moneyPool) {
		this.moneyPool = moneyPool;
	}

	/** method for adding money to moneyPool
	 * 	uses setter for field MoneyPool, with param money plus current amount in moneyPool
	 * (using getter for field MoneyPool) 
	 *  @param int money 
	 *  @return int 
	 */
	public int addMoney(int money) {
		setMoneyPool(getBalance()+money);
		return getBalance();
	}

	
	
	/**
	 *
	 */
	public Product buyProduct(int money, final int productId) throws Exception {
		//Check if balance is sufficient
		if(getBalance() > money) {
			throw new Exception("Insufficient funds, please insert more money.");
		}
		//get product by id
		Product product =(Product) products.stream().filter(new Predicate<Product>() {
			public boolean test(Product p) {
				return p.getId() == productId;
			}
		});
		
		
		product.purchase(money);
		
		return product;
	}

	/**
	 *When the user decides to stop buying things,
	 *the remaining money is returned by calling getBalance()
	 */
	public int returnChange() {
		
		return getBalance();
	}

	/**
	 *
	 */
	public String presentProduct() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Product product : products) {
			stringBuilder.append("Product name" + product.getName() + "Product Price:"+product.getPrice());
		}
		return stringBuilder.toString();
	}

	/**
	 *
	 */
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	/** add product to field ArrayList products
	 * @param product
	 * @return void
	 */
	public void addProduct(Product product) {
		products.add(product);
	}
}
