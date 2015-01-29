package designConf.util;
/**
 * Workshop class  
 *that implements WorkshopInterface and
 *constructs an activity
 */
public class Workshop implements WorkShopInterface {

	@Override
	/**
	 * overriden construct method
	 * calls:
	 * calculateTimeSpent
	 * calculateMoneySpent
	 * calculateCO2footprintSpen
	 * methods.
	 */
	public void construct(ActivityBuilder builder) {
		builder.timeSpent();
		builder.moneySpent();
		builder.CO2footprintSpent();
		
	}

}
