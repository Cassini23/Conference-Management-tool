package designConf.util;

import java.util.ArrayList;

/**
 * Result class calculates and prints all results 
 */
public class Result implements ResultInterface {
	
	
    private ArrayList<ActivityBuilder> activityList;
    //	    private int totalTime;
    //	    private double totalCost;
    //	    private int totalCO2footPrint;
    private String choises;
    private String result = "";
    //cost per activity
    
    private int timeActivity;
    private double costActivity;
    private int CO2Activity;
    
    //Units of display
    
    /*private String currencyType = "dollars";
    private String timeMeasure = "minutes";
    private String CO2Unit = "tonnes";*/
    
    //Activity name
    StringBuffer activityResult;
    ArrayList<String> resultList;
    /**
     * Result constructor
     * @param activities list of activities of attendee's 
     * assigns activities argument to activityList field
     * and initializes other fields to 0
     */
    public Result(ArrayList<ActivityBuilder> activities) {
        
        activityList = activities;
	    /*    totalCost = 0.0;
         totalTime = 0;
         totalCO2footPrint = 0;*/
        choises = "";
        activityResult = new StringBuffer(); 
        resultList = new ArrayList<String>();
    }
    
    /**
     *  Overriden calculateResults
     * calculates the sum of time,money and carbon footprint spent in conference
     */
    public void calculateResults() {
        //added for displaying individual activity
        timeActivity = 0;
        costActivity = 0.0;
        CO2Activity = 0;
       
        
        //choises += "Registration Type: " + activityList.get(0).getRegistrationChoice() + " \n";
        //result += choises;
        for (int i = 0; i < activityList.size(); i++) {
            /* totalCost += activityList.get(i).activity.getMoneySpent();
             totalTime += activityList.get(i).activity.getTimeSpent();
             totalCO2footPrint+= activityList.get(i).activity.getFootprintSpent();
             */
            
            //Getting activity name
            switch (i){
	    		case 0:{
	    			//Registration type
	    			//System.out.println("Registration switch");
	    			choises += "Registration Type: " + activityList.get(i).getRegistrationChoice() + "\n";
	    			result += choises;
	    			
	    			break;
	    		}
	    		case 1:{
	    			//Lab  type
	    			//System.out.println("Lab switch");
	    			choises += "Lab Type: " + activityList.get(i).getLabChoise() + "\n";
	    			result += choises;
	    			break;
	    			
	    		}
	    		case 2:{
	    			//Lab visit type
	    			//System.out.println("Lab visit switch");
	    			choises += "Lab Visit Type: " + activityList.get(i).getVisitChoice() + "\n";
	    			result += choises;
	    			break;
	    		}
	    		case 3:{
	    			//Presentation type
	    			//System.out.println("Presentation switch");
	    			choises += "Presentation Type: " + activityList.get(i).getPresentationChoice() + "\n";
	    			result += choises;
	    			break;
	    		}
	    		case 4:{
	    			//Restaurant type
	    			//System.out.println("Restaurant switch");
	    			choises += "Restaurant Type: " + activityList.get(i).getRestaurantChoice() + "\n";
	    			result += choises;
	    			break;
	    		}
	    		default:{
	    			//System.out.println("System default");
	    			break;
	    		}
            }
            timeActivity = activityList.get(i).activity.getTimeSpent();
            costActivity = activityList.get(i).activity.getMoneySpent();
            CO2Activity = activityList.get(i).activity.getFootprintSpent(); 
            //Display d = new Display();
            //d.display(this);
            resultList.add(generateResult());
            activityResult.delete(0, activityResult.length());
            
            
        }
        
    }
    
    /**
     * Overriden toString method
     *
     * @return String result
     */
    public String toString() {
       
    	for(int i = 0; i<resultList.size(); i++)
    	{
    		 activityResult.append(resultList.get(i));
    		
    	}
    	
    	return activityResult.toString();
    }
    
    public String generateResult()
    {
    	 result += "Money spent on Activity = " + Double.toString(costActivity) + " " + UnitInterface.currency + "\n";
         result += "Time spent on Activity = " + Integer.toString(timeActivity) + " " + UnitInterface.timeMeasure +"\n";
         result += "Carbon FootPrint spent on Activity = " + Integer.toString(CO2Activity) + " " + UnitInterface.CO2Unit + "\n\n";	    	
 	     activityResult.append(result);
         result="";
         choises ="";
         return activityResult.toString();
    	
    	
    }
}
