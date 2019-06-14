package model;

public enum Denominators {
	
	ONE("1kr", 1),FIVE("5kr", 5),TEN("10kr", 10),TWENTYY("20kr", 20),
	FIFTY("50kr", 50),ONEHUNDRED("100kr", 100), FIVEHUNDRED("500kr", 500),
	ONETHOUSAND("1000kr", 1000);
	
	public String DenominatorName;
	public int amount;

	
	/** Constructor for enum Denominators
	 * @param DenominatorName
	 * @param amount
	 */
	Denominators(String DenominatorName, int amount) {
		this.DenominatorName = DenominatorName;
		this.amount = amount;
	}
	
	
	/** static method to count number of members
	 * @return int
	 
	@SuppressWarnings("unused")
	private static int sizeOf() {
		int i =0;
		for ( Denominators denominator : Denominators.values()) {
			i++;
		}
		return i;
	}
	
	public static int[] toArr() {
		int[] denominatorArr= new int[sizeOf()];
		for (Denominators denominator : Denominators.values()) {
			for (int i = 0; i < denominatorArr.length; i++) {
				denominatorArr[i] = denominator.amount;
			}
		}
		return denominatorArr;
	} */

}
