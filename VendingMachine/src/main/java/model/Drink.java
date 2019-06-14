package model;

public class Drink extends Product{

	//Private field
	private int volumeInCentiliters;
	
	

	/**Constructor taking 2 params
	 * @param name
	 * @param price
	 */
	public Drink(String name, int price) {
		//if volume is unspecified, a standard value of 33cl is given
		this(name,price,33);
	}
	
	/**Constructor taking 3 params
	 * @param name
	 * @param price
	 * @param volumeInCentiliters
	 */
	public Drink(String name, int price,int volumeInCentiliters) {
		//if caloriesInKCal is unspecified, 139 is given
		//equal to 33 cl of coke
		this(name,price,volumeInCentiliters,139);
	}
	
	/** Constructor taking 4 params
	 * @param name
	 * @param price
	 * @param volumeInCentiliters
	 * @param caloriesInKcal
	 */
	public Drink(String name, int price,int volumeInCentiliters, int caloriesInKcal){
		super(name, price, caloriesInKcal);
		setVolumeInCentiliters(volumeInCentiliters);
		
	}
	
	
	
	/** getter for field int volumeInCentiliters
	 * @return int volumeInCentiliters
	 */
	public int getVolumeInCentiliters() {
		return volumeInCentiliters;
	}

	/**setter for field int volumeInCentiliters
	 * @param int volumeInCentiliters
	 */
	private void setVolumeInCentiliters(int volumeInCentiliters) {
		this.volumeInCentiliters = volumeInCentiliters;
	}

	
	/*
	 * Overriden method for using product
	 */
	@Override
	public String use() {
		
		return "GLUGG,GLUGG,GLUGG, AAAAH.";
	}

	
	/**
	 *Overriden method to get string representation of the product
	 *
	 *@return string
	 */
	@Override
	public String toString() {
		
		return "Name: "+ getName() +" Price: "+getPrice()+" Volume: " + volumeInCentiliters+" Calories: "+getCaloriesInKiloJoules()+" KJ / "+getCaloriesInKcal()+" KCal ";
	}

	
	
}
