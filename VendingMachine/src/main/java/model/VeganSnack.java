package model;

public class VeganSnack extends Product{

	
	

	/**Constructor taking 2 params
	 * @param name
	 * @param price
	 */
	public VeganSnack(String name, int price) {
		/*standard value of 20000 if calories in Kcal are not specified
		based on a approximate median of calories in 2 types of snacks
		(peanuts & lintilchips).
		*/
		this(name,price,2000);
		
		
	}
	
	/**Constructor taking 3 params
	 * @param name
	 * @param price
	 * @param caloriesInKcal
	 */
	public VeganSnack(String name,int price,int caloriesInKcal) {
		super(name, price, caloriesInKcal);
	}
		
	
	/**
	 *Overriden method for using product
	 *
	 *@return string
	 */
	@Override
	public String use() {
		
		return "NOM NOM NOM I luvz snacks";
	}
	
	/**
	 *Overriden method to get string representation of the product
	 *
	 *@return string
	 */
	@Override
	public String toString() {
		
		return "Name: "+ getName() +" Price: "+getPrice()+" Calories: "+getCaloriesInKiloJoules()+" KJ / "+getCaloriesInKcal()+" KCal ";
	}
}