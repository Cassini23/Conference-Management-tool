package designConf.util;

/**
*
* Activity Builder abstract class
*
*/
public abstract class ActivityBuilder {

	 protected Activity activity = new Activity();

	    /**
	     * abstract methods: calculateTimeSpent method,calculateMoneySpent method, calculateCO2footprintSpent
	     * method 
	     */
	    abstract public void timeSpent();
	    abstract public void moneySpent();
	    abstract public void CO2footprintSpent();

	   
	    protected int timeConsumption;
	    protected double moneyConsumption;
	    protected int CO2Consumption;
	    
	    private String registrationChoice = null;
	    private String restaurantChoice = null;
	    private String labChoise = null;
	    private String presentationChoice = null;
	    private String visitChoice = null;

	    /**
	     * getRegistrationChoice method
	     *
	     * @return String registrationChoice in this activity
	     */
		public String getRegistrationChoice() {
			return registrationChoice;
		}

		 /**
	     * setRegistrationChoice method
	     *
	     * @param registrationSelection String value to set registrationChoice 
	     */
		public void setRegistrationChoice(String registrationSelection) {
			registrationChoice = registrationSelection;
		}

		/**
	     * getRestaurantChoice method
	     *
	     * @return String restaurantChoice in this activity
	     */
		public String getRestaurantChoice() {
			return restaurantChoice;
		}

		 /**
	     * setRestaurantChoice method
	     *
	     * @param restaurantSelection String value to set restaurantChoice
	     */
		public void setRestaurantChoice(String restaurantSelection) {
			restaurantChoice = restaurantSelection;
		}

		/**
	     * getLabChoice method
	     *
	     * @return String labChoise in this activity
	     */
		public String getLabChoise() {
			return labChoise;
		}

		 /**
	     * setLabChoice method
	     *
	     * @param labSelection String value to set labChoice
	     */
		public void setLabChoise(String labSelection) {
			labChoise = labSelection;
		}

		/**
	     * getPresentationChoice method
	     *
	     * @return String presentationChoice in this activity
	     */
		public String getPresentationChoice() {
			return presentationChoice;
		}

		 /**
	     * setPresentationChoice method
	     *
	     * @param presentationSelection String value to set presentationChoice
	     */
		public void setPresentationChoice(String presentationSelection) {
			presentationChoice = presentationSelection;
		}

		/**
	     * getVisitChoice method
	     *
	     * @return String visitChoice in this activity
	     */
		public String getVisitChoice() {
			return visitChoice;
		}

		/**
	     * setVisitChoice method
	     *
	     * @param visitSelection String value to set visitChoice
	     */
		public void setVisitChoice(String visitSelection) {
			visitChoice = visitSelection;
		}
	    
	      
	}

