package designConf.Enum;

public enum Registration {
	RegisterByBUAlumniPlatinumCard(0,0,0),
	RegisterByOtherCard(100,0,0);
	

	private double money;
	private int time;
	private int CO2;

	/**
	 * Enum Registration private constructor
	 * Sets the money, time and CO2 consumption of each Enum value
	 * @param moneyIn double
	 * @param timeIn int
	 * @param CO2In int
	 */
	
	private Registration(double moneyIn, int timeIn,int CO2In){
		
		money = moneyIn;
		time = timeIn;
		CO2 = CO2In;
	}
	
	/**
     * getMoney method
     *
     * @return returns money 
     */
	public double getMoney() {
		return money;
	}

	/**
     * setMoney method
     *
     * @param moneyIn double value to set money 
     */
	public void setMoney(double moneyIn) {
		money = moneyIn;
	}

	/**
     * getTime method
     *
     * @return returns time 
     */
	public int getTime() {
		return time;
	}

	/**
     * setTime method
     *
     * @param timeIn int value to set time 
     */
	
	public void setTime(int timeIn) {
		time = timeIn;
	}

	/**
     * getCO2 method
     *
     * @return returns CO2 
     */
	public int getCO2() {
		return CO2;
	}

	/**
     * setCO2 method
     *
     * @param CO2In int value to set CO2 
     */
	public void setCO2(int cO2In) {
		CO2 = cO2In;
	}
	
	/**
	 * applyDiscount method
	 *
	 * @param double moneyIn
	 * @param int discount 
	 * 
	 * applies discount specified to the money and sets the new money value
	 */
	public void applyDiscount(double moneyIn, int discount) {
		money = moneyIn - ((moneyIn * discount) / 100);
		setMoney(money);
	}

	/**
	 * @return String
	 * returns the money, time and CO2 associated with the enum value
	 */
	/*public String toString()
	{
		return " Money = "+money+" Time = "+ time+" CO2 = "+CO2;
	}*/
}
