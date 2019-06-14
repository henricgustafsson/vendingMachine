package model;

public class VeganRoll extends Product {

	/** Constructor taking 2 params
	 * @param name
	 * @param price
	 */
	public VeganRoll(String name, int price) {
		//if kcal unspecified, 400 is given);
		this(name, price,400);
		
	}
	
	/**Constructor taking 3 params
	 * @param name
	 * @param price
	 * @param caloriesInKcal
	 */
	public VeganRoll(String name, int price, int caloriesInKcal) {
		super(name, price, caloriesInKcal);
		
	}

	

	/**
	 *Overriden method for using product
	 *
	 *@return string
	 */
	@Override
	public String use() {
		
		return "NOM NOM NOM YUMMIE SAMMICH";
	}

	/**
	 *Overriden method to get string representation of the product
	 *
	 *@return string
	 */
	@Override
	public String toString() {
		return "Name: " + getName() + ", Price :" + getPrice() + "Calories: " + getCaloriesInKiloJoules() + " KJ / "+ getCaloriesInKcal() +" Kcal";
	}

}
