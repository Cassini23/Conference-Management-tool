package designConf.util;

/**
 * Activity class includes the timespent,moneyspent and carbonFootprintspent records of the activity
 */
public class Activity {

    
    private double moneySpent;
    private int timeSpent;
    private int carbonFootprintSpent;
   
    /**
     * getTimeSpent method
     *
     * @return integer timespent in this activity
     */
   
    public int getTimeSpent() {
        return timeSpent;
    }

    /**
     * setTimeSpent method
     *
     * @param ts int value to set to timeSpent 
     */
    public void setTimeSpent(int time_Spent) {
        timeSpent = time_Spent;
    }

    /**
     * getMoneySpent method
     *
     * @return Double moneySpent :money spent in this activity
     */
    public double getMoneySpent() {
        return moneySpent;
    }

    /**
     * setMoneySpent method
     *
     * @param money_Spent double 
     * money_Spent double value to set moneySpent .
     */
    public void setMoneySpent(double money_Spent) {
        moneySpent = money_Spent;
    }

    /**
     * getFootprintSpent method
     *
     * @return int
     * int footprintSpent carbon footprint spent in this activity
     */
    public int getFootprintSpent() {
        return carbonFootprintSpent;
    }

    /**
     * setFootprintSpent method
     *
     * @param carbonFootprint_Spent int
     * footprint_Spent integer value to set carbon footprint 
     */
    public void setFootprintSpent(int carbonFootprint_Spent) {
        carbonFootprintSpent = carbonFootprint_Spent;
    }
    /**
     * @return String
     * returns the int values moneySpent, timeSpent, carbonFootprintSpent in String format
     */
   public String toString(){
	   return "Money Spent = " + moneySpent +", Time spent = " +timeSpent+" , CO2 spent = " + carbonFootprintSpent;
   }
}

