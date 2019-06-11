package model;

public class Drink extends Product{

	private int volumeInCentiliters;
	
	

	public Drink(String name, int price) {
		//if volume is unspecified, a standard value of 33cl is given
		this(name,price,33);
	}
	
	public Drink(String name, int price,int volumeInCentiliters) {
		//if caloriesInKCal is unspecified, 139 is given
		//equal to 33 cl of coke
		this(name,price,volumeInCentiliters,139);
	}
	
	public Drink(String name, int price,int volumeInCentiliters, int caloriesInKcal){
		super(name, price, caloriesInKcal);
		
	}
	
	
	
	public int getVolumeInCentiliters() {
		return volumeInCentiliters;
	}

	public void setVolumeInCentiliters(int volumeInCentiliters) {
		this.volumeInCentiliters = volumeInCentiliters;
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
		
		return "Name: "+ getName() +"Price "+getPrice()+"Volume" + volumeInCentiliters+"Calories:"+getCaloriesInKiloJoules()+"KJ/"+getCaloriesInKcal()+"KCal";
	}

	
	
}
