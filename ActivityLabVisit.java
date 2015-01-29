package designConf.util;

import designConf.Enum.LabVisit;

/**
 * class ActivityLabVisit 
 * extends ActivityBuilder class
 * implements abstract methods according to way to  attendee's visit a lab
 */

public class ActivityLabVisit extends ActivityBuilder {
	
	/**
	 * ActivityLabVisit constructor
	 * @param selection sets visit type of attendee
	 */
     public ActivityLabVisit(LabVisit selection) {
		
    	 Logging.getInstance().write(2, "Visiting Lab");
    	 setVisitChoice(selection.toString());
		
		switch (selection) {
			
			case campusBus: {
				moneyConsumption = LabVisit.campusBus.getMoney();
				timeConsumption = LabVisit.campusBus.getTime();
				CO2Consumption = LabVisit.campusBus.getCO2();
	            break;
			}
			case takeElevatorsTunnels: {
				moneyConsumption = LabVisit.takeElevatorsTunnels.getMoney();
				timeConsumption = LabVisit.takeElevatorsTunnels.getTime();
				CO2Consumption = LabVisit.takeElevatorsTunnels.getCO2();
				break;
			}
			
			case onFoot: {
				moneyConsumption = 0;
				timeConsumption = 50;
				CO2Consumption = 30;
				break;
			}
			

			default: {
				try{
					System.err.println("Choice of Lab visit does not exist " + selection);
				}
				catch(NullPointerException e){
					System.err.println("Choice of Lab visit is null");
					System.exit(1);
				}
				//System.out.println("default");
				break;
			}

			}
	}

	@Override
	 /**
     * overriden calculateTimeSpent method
     */
	public void timeSpent() {
		
		Logging.getInstance().write(4, "Time spent: " + timeConsumption);
		activity.setTimeSpent(timeConsumption);

	}

	@Override
	/**
     * overriden calculateMoneySpent method
     */
	public void moneySpent() {
		activity.setMoneySpent(moneyConsumption);

	}

	@Override
	/**
     * overriden calculateCO2footprintSpent method
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
