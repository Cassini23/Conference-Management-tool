
package designConf.driver;

import designConf.Enum.LabVisit;
import designConf.Enum.Registration;
import designConf.Enum.Labs;
import designConf.Enum.Presentations;
import designConf.Enum.Restaurant;
import designConf.attendee.Attendee;
import designConf.util.Debug;
import designConf.util.Display;
import designConf.util.Logging;
import designConf.util.Result;


/**
 * main function (Driver) create an attendee and attend conference
 */

public class Driver {

    public static void main(String args[]) {

    	try {
			Debug.setDEBUG_VALUE(Integer.parseInt(args[0]));
		} catch (NumberFormatException e) {
			System.err
					.println("Debug value must be integer");
			System.exit(1);
		} finally {
		}
    	
    	if (Debug.getDEBUG_VALUE() > 4 || Debug.getDEBUG_VALUE() < 0) {
			System.err
					.println("Debug Value should be between 0 and 4. Current debug level is "
							+ Debug.getDEBUG_VALUE());
			System.exit(1);
		}
    	//System.out.println(Logging.getInstance().toString());
    	Registration[] registration = Registration.values();
    	LabVisit[] visit = LabVisit.values();
    	Labs[] labchoice = Labs.values();
    	Presentations[] presentation = Presentations.values();
    	Restaurant[] restaurant = Restaurant.values();
    	
    	Result results;
    	int attendeeID = 0;
    	int attendeeCount;

    	for(attendeeCount = 5; attendeeCount > 0; attendeeCount -- ){
    		attendeeID++;
            System.out.println("Attendee ID: " + Integer.toString(attendeeID));
            Registration registerType = registration[attendeeCount % registration.length];
            LabVisit visitType = visit[attendeeCount % visit.length];
   		 	Labs labType = labchoice[attendeeCount % labchoice.length];
   		 	Presentations presentationType = presentation[attendeeCount % presentation.length];
   		 	Restaurant restaurantType = restaurant[attendeeCount % restaurant.length];
   		 	Attendee attendee = new Attendee(registerType, labType, visitType,presentationType,restaurantType);
   		 	results = new Result(attendee.attend());
   		 	results.calculateResults();
   		 	Display d = new Display();
   		 	Logging.getInstance().write(1,d.display(results));
    	}
    
    } // end main(...)
} // end class Driver
