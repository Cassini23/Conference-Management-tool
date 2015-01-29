package designConf.util;

import designConf.Enum.Registration;
import designConf.util.ActivityBuilder;

/**
 * ActivityRegister extends ActivityBuilder class and implements abstract methods according to
 * registration type of the attendee
 */
public class ActivityRegister extends ActivityBuilder {

	 /**
	     * ActivityRegister constructor
	     *
	     * @param selection sets registration type
	     */
	 
	public ActivityRegister(Registration selection) {
		
		Logging.getInstance().write(2, "Registering to Conference");
		/*timeConsumption = 0;
		CO2Consumption = 0;
		moneyConsumption = 100;*/
		setRegistrationChoice(selection.toString());
		switch (selection) {
			
			case RegisterByBUAlumniPlatinumCard: {
				Registration.RegisterByBUAlumniPlatinumCard.applyDiscount(Registration.RegisterByOtherCard.getMoney(), 10);
				moneyConsumption = Registration.RegisterByBUAlumniPlatinumCard.getMoney();
				timeConsumption = Registration.RegisterByBUAlumniPlatinumCard.getTime();
				CO2Consumption = Registration.RegisterByBUAlumniPlatinumCard.getCO2();
				break;
			}
			case RegisterByOtherCard: {
				moneyConsumption = Registration.RegisterByOtherCard.getMoney();
				timeConsumption = Registration.RegisterByOtherCard.getTime();
				CO2Consumption = Registration.RegisterByOtherCard.getCO2();
				break;
			}
			

			default: {
				System.out.println("default");
				break;
			}

			}
		
	}

	@Override
	 /**
     * overriden calculateTimeSpent method
     */
	public void timeSpent() {
		activity.setTimeSpent(timeConsumption);
		
		
	}

	@Override
	/**
     * overriden calculateMoneySpent method
     */
	public void moneySpent() {
		
		Logging.getInstance().write(4, "Money spent: " + moneyConsumption);
		activity.setMoneySpent(moneyConsumption);
	}

	@Override
	/**
     * overriden calculateCO2footprintSpent method
     */
	public void CO2footprintSpent() {
		
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
