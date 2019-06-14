package model;

public abstract class Product {

	/**
	 * Private fields
	 */
	private static int COUNTER=0;
	private String name;
	private int id;
	private int price;	
	private int caloriesInKiloJoules;
	private int caloriesInKcal;

	
	
	public Product(String name, int price, int caloriesInKcal) {
		setId(++COUNTER);
		setPrice(price);
		setName(name);
		setCaloriesInKcal(caloriesInKcal);
		int caloriesInKJ = calculateCaloriesFromKcalToKiloJoules(caloriesInKcal);
		setCaloriesInKiloJoules(caloriesInKJ);
	}
	
	
	public int getCaloriesInKiloJoules() {
		return caloriesInKiloJoules;
	}

	protected void setCaloriesInKiloJoules(int caloriesInKiloJoules) {
		this.caloriesInKiloJoules = caloriesInKiloJoules;
	}

	public int getCaloriesInKcal() {
		return caloriesInKcal;
	}

	protected void setCaloriesInKcal(int caloriesInKcal) {
		this.caloriesInKcal = caloriesInKcal;
	}

	/** getter for field int price
	 * @return field int price
	 */
	public int getPrice() {
		return price;
	}


	/** Setter for field int price
	 * @param int price
	 */
	private void setPrice(int price) {
		this.price = price;
	}

	
	/** getter for field String name
	 * @return field String name
	 */
	public String getName() {
		return name;
	}
	
	
	/** setter for field String name
	 * @param field String name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/** Getter for field int id
	 * @return field int id
	 */
	public int getId() {
		return id;
	}
	
	
	/** Setter for field int id
	 * @param field int id
	 */
	private void setId(int id) {
		this.id = id;
	}
	
	/**
	 *Abstract methods
	 */
	
	/** Abstract method for purchasing a Product
	 * @param money
	 * @return
	 */
	public boolean purchase(int money) {
		
		return (money > getPrice());
	}
	
	/**
	 * Abstract method for using a product
	 */
	public abstract String use();
	

	
	/* 1 kcal = 4.18400 kilojoules so rounded down to 4
	 * */
	protected int calculateCaloriesFromKcalToKiloJoules(int caloriesInKcal) {
		return caloriesInKcal *4;
		
		
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + ", caloriesInKiloJoules="
				+ caloriesInKiloJoules + ", caloriesInKcal=" + caloriesInKcal + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caloriesInKcal;
		result = prime * result + caloriesInKiloJoules;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (caloriesInKcal != other.caloriesInKcal)
			return false;
		if (caloriesInKiloJoules != other.caloriesInKiloJoules)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}
