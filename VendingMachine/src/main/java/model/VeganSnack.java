package model;

public class VeganSnack extends Product{

	
	

	public VeganSnack(String name, int price) {
		/*standard value of 20000 if calories in Kcal are not specified
		based on a approximate median of calories in 2 types of snacks
		(peanuts & lintilchips).
		*/
		this(name,price,2000);
		
		
	}
	
	public VeganSnack(String name,int price,int caloriesInKcal) {
		super(name, price, caloriesInKcal);
	}

	

	
	@Override
	public Product purchase(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String use() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		
		return "Name: "+ getName() +"Price "+getPrice()+"Calories:"+getCaloriesInKiloJoules()+"KJ/"+getCaloriesInKcal()+"KCal";
	}
}