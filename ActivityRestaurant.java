package designConf.util;

import designConf.Enum.Restaurant;

/**
 * class ActivityRestaurant extends ActivityBuilder, implements the abstract methods
 * according to the way the attendee chooses the restaurant.
 *
 */
public class ActivityRestaurant extends ActivityBuilder {
	
	/**
	 * Constructor of the class ActivityRestaurant
	 */
	
	public ActivityRestaurant(Restaurant selection)
	{
		 Logging.getInstance().write(2, "Visiting restaurant");
		setRestaurantChoice(selection.toString());
		
		switch(selection){
		case PSRestaurant:{
			moneyConsumption = Restaurant.PSRestaurant.getMoney();
			timeConsumption = Restaurant.PSRestaurant.getTime();
			CO2Consumption = Restaurant.PSRestaurant.getCO2();
			break;
			
		}
		case Number5Restaurant:{
			moneyConsumption = Restaurant.Number5Restaurant.getMoney();
			timeConsumption = Restaurant.Number5Restaurant.getTime();
			CO2Consumption = Restaurant.Number5Restaurant.getCO2();
			break;
			
		}
		case LemongrassRestaurant:{
			moneyConsumption = Restaurant.LemongrassRestaurant.getMoney();
			timeConsumption = Restaurant.LemongrassRestaurant.getTime();
			CO2Consumption = Restaurant.LemongrassRestaurant.getCO2();
			break;
		}
		default:{
			try{
				System.err.println("Choice of Restaurant does not exist " + selection);
			}
			catch(NullPointerException e){
				System.err.println("Choice of Restaurant is null");
				System.exit(1);
			}
			//System.out.println("System default");
			break;
		}
		}

	}
	
	/**
	 * Overridden timeSpent() method
	 */
	@Override
	public void timeSpent() {
		
		Logging.getInstance().write(4, "Time spent: " + timeConsumption);
		activity.setTimeSpent(timeConsumption);
	}
	
	/**
	 * Overridden moneySpent() method
	 */

	@Override
	public void moneySpent() {
		
		Logging.getInstance().write(4, "Money spent: " + moneyConsumption);
		activity.setMoneySpent(moneyConsumption);
	}
	
	/**
	 * Overridden CO2footprintSpent() method
	 */
	@Override
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

