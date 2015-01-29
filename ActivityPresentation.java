package designConf.util;

import designConf.Enum.Presentations;

/**
 * class ActivityPresentation
 * extends the ActivityBuilder class
 * implements abstract methods according to the way the attendee chooses the presentation
 * 
 */

public class ActivityPresentation extends ActivityBuilder {
	
	/**
	 * Activity Presentation constructor
	 * Set's the Attendee's choice of Presentation
	 */

	public ActivityPresentation(Presentations selection)
	{
		 Logging.getInstance().write(2, "Attending presentation");
		 
		/*Presentation choices affect only the CO2footprint*/
				
		setPresentationChoice(selection.toString());
		
		switch(selection){
		
		case presentation1:{
			moneyConsumption = Presentations.presentation1.getMoney();
			timeConsumption = Presentations.presentation1.getTime();
			CO2Consumption = Presentations.presentation1.getCO2();
			break;
		}
		
		case presentation2:{
			moneyConsumption = Presentations.presentation2.getMoney();
			timeConsumption = Presentations.presentation2.getTime();
			CO2Consumption = Presentations.presentation2.getCO2();
			break;
			
		}
		case presentation3:{
			moneyConsumption = Presentations.presentation3.getMoney();
			timeConsumption = Presentations.presentation3.getTime();
			CO2Consumption = Presentations.presentation3.getCO2();
			break;
		}
		
		default:{
			try{
				System.err.println("Choice of Presentation does not exist " + selection);
			}
			catch(NullPointerException e){
				System.err.println("Choice of Presentation is null");
				System.exit(1);
			}
			//System.out.println("System default");
			break;
		}

		}
		
		
	}
	/**
	 * Overridden timeSpent()  method of ActivityBuilder
	 * 
	 */
	@Override
	public void timeSpent() {
		
		activity.setTimeSpent(timeConsumption);

	}

	/**
	 * Overridden moneySpent() method of ActivityBuilder
	 */
	@Override
	public void moneySpent() {

		activity.setMoneySpent(moneyConsumption);
	}
	
	/**
	 * Overridden CO2footprintSpent() method of ActivityBuilder
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
