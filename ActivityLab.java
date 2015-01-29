package designConf.util;

import designConf.Enum.Labs;

public class ActivityLab extends ActivityBuilder {

	/**
	 * Activity Lab constructor
	 * Sets the Attendee's choice of Lab to visit
	 */
	
	public ActivityLab(Labs selection)
	{
		Logging.getInstance().write(2, "Choosing Lab to work");
		moneyConsumption = 0;
		
		setLabChoise(selection.toString());
			
		switch(selection) {
		
		case Lab1:	{
			//choices affect carbon footprint and time
			moneyConsumption = Labs.Lab1.getMoney();
			timeConsumption = Labs.Lab1.getTime();
			CO2Consumption = Labs.Lab1.getCO2();
			break;
		}
		case Lab2:	{
			moneyConsumption = Labs.Lab2.getMoney();
			timeConsumption = Labs.Lab2.getTime();
			CO2Consumption = Labs.Lab2.getCO2();
			break;
		}
		case Lab3:	{
			moneyConsumption = Labs.Lab3.getMoney();
			timeConsumption = Labs.Lab3.getTime();
			CO2Consumption = Labs.Lab3.getCO2();
			break;
		}
		default:	{
			try{
				System.err.println("Choice of Lab does not exist " + selection);
			}
			catch(NullPointerException e){
				System.err.println("choice of Lab is null");
				System.exit(1);
			}
			break;
		}
		}
		
	}
	
	@Override
	/**
	 * overridden timeSpent() method
	 */
	public void timeSpent() {
		
		Logging.getInstance().write(4, "Time spent: " + timeConsumption);
		activity.setTimeSpent(timeConsumption);
	}
	
	/**
	 * overridden moneySpent() method
	 */
	public void moneySpent() {
	
		activity.setMoneySpent(moneyConsumption);
	}
	
	/**
	 * overridden CO2footprintSpent() method
	 */
	public void CO2footprintSpent() {
		
		Logging.getInstance().write(4, "CO2 spent: " + CO2Consumption);
		activity.setFootprintSpent(CO2Consumption);
		
	}
	/**@Override
	 * toString method
	 * @return
	 * returns the current state of moneyConsumption, moneyConsumption, CO2Consumption in String format
	 */
	public String toString(){
		   return "Money Spent = " + moneyConsumption +", Time spent = " +timeConsumption+" , CO2 spent = " + CO2Consumption;
	   }

}
