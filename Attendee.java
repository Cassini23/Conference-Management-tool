package designConf.attendee;

import java.util.ArrayList;

import designConf.Enum.LabVisit;
import designConf.Enum.Registration;
import designConf.Enum.Labs;
import designConf.Enum.Restaurant;
import designConf.Enum.Presentations;



import designConf.util.ActivityBuilder;
import designConf.util.ActivityLabVisit;
import designConf.util.ActivityRegister;
//import designConf.util.Display;
import designConf.util.Logging;
//import designConf.util.Result;

import designConf.util.WorkShopInterface;
import designConf.util.Workshop;

import designConf.util.ActivityLab;
import designConf.util.ActivityPresentation;
import designConf.util.ActivityRestaurant;

/**
 * Attendee class which has the ability to attend conference 
 * 
 */
public class Attendee {
	
	 /**
     * student has a list of activities and results
     */
	ArrayList<String> activityName = new ArrayList<String>();
    private ArrayList<ActivityBuilder> activityList;
    //protected Result results;

    /**
     * Student constructor
     *
     * @param registrationSelection (String)
     * @param labSelection (String)
     * @param visitSelection (String)
     * @param presentationSelection (String)
     * @param restaurantSelection (String)
     */
    public Attendee(Registration registrationSelection,
            Labs labSelection, LabVisit visitSelection,
            Presentations presentationSelection, Restaurant restaurantSelection) {
    	
    	activityList = new ArrayList<ActivityBuilder>();
    	// need to add all activities into this list
    	activityList.add(new ActivityRegister(registrationSelection));
    	activityList.add(new ActivityLab(labSelection));
    	activityList.add(new ActivityLabVisit(visitSelection));
    	activityList.add(new ActivityPresentation(presentationSelection));
    	activityList.add(new ActivityRestaurant(restaurantSelection));
    }
    
    /**
     * attend method performs the conference activities
     */
    public ArrayList<ActivityBuilder> attend() {
    	
    	Logging.getInstance().write(3, "Attending to Conference");
        WorkShopInterface attendShop = new Workshop();
        for (int i = 0; i < activityList.size(); i++) {
        	attendShop.construct(activityList.get(i));
        }
        return activityList;
        //results = new Result(activityList);
       // getResults();
    }

    /**
     * get Results method prints out the time/effort/money spent
     */
   /* public void getResults() {
    	
        results.calculateResults();
        Display d = new Display();
        d.display(results);
    }*/
    
}
