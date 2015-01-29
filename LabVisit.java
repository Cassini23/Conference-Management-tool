package designConf.Enum;

public enum LabVisit {
	
	campusBus(0,30,80),
	takeElevatorsTunnels(0,40,60),
	onFoot(0,50,30);
	
	private double money;
	private int time;
	private int CO2;
	
	/**
	 * Enum LabVisit private constructor
	 * Sets the money, time and CO2 consumption of each Enum value
	 * @param moneyIn double
	 * @param timeIn int
	 * @param CO2In int
	 */
	private LabVisit(double moneyIn, int timeIn, int CO2In){
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
	public void setCO2(int CO2In) {
		CO2 = CO2In;
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
