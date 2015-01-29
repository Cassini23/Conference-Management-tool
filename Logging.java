package designConf.util;

public class Logging {

	public enum LogLevels {
		NO_OUTPUT, ATTENDEE_ACT_RESULTS, NEW_ACTIVITY, ATTEND, EXPENSE;

	}

	private int debug_value;

	private static Logging instance = null;

	private Logging() {
		setDebug_value(Debug.getDEBUG_VALUE());
	}

	/**
	 * getInstance method 
	 * @return the unique instance of Logging object
	 */
	public static Logging getInstance() {
		if (instance == null) {
			instance = new Logging();
		}
		return instance;
	}

	 public int getDebug_value() {
		return debug_value;
	}

	public void setDebug_value(int debug_value) {
		this.debug_value = debug_value;
	}
	
	/**
     * write method
     *
     * @param debug_level given debug level for the program
     * @param message log message to print 
     */
     public void write(int debug_level, String message) {
		
		
		if (debug_level == Debug.getDEBUG_VALUE()) {
			switch (LogLevels.values()[debug_level]) {

			case NO_OUTPUT: {
				
				break;
			}
			case ATTENDEE_ACT_RESULTS: {
				System.out.println("Attendee Activity Results");
				System.out.println(message);
				break;
			}
			case NEW_ACTIVITY: {
				System.out.println("New Activity :" + message);
				break;
			}
			case ATTEND: {
				System.out.println("Attend Method CALL:" + message);
				break;
			}
			case EXPENSE: {
				System.out.println("Time / Money/ CO2 FootPrint is Spent: " + message);
				break;
			}

			default: {
				System.out.println("default");
				break;
			}

			}
		}

		
	}
     /**@Override
 	 * toString method
 	 * @return
 	 * returns the current state of variables in String format
 	 */
 	public String toString(){
 		   return "Debug value = " + debug_value;
 	   }
}

