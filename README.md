# Conference-Management-toolCS542 Design Patterns
Fall 2013
PROJECT 2 README FILE

Due Date: Sunday, October 13, 2013
Submission Date: Wednesday, October 12, 2013
Grace Period Used This Project: 15 Days
Grace Period Remaining: 1 Days
Author(s):  PINAR KUZLU and NINA BALACHANDRAN MARY
e-mail(s): pkuzlu1@binghamton.edu and nbalach1@binghamton.edu

PURPOSE:

To develop a tool that will be used by attendee of Design Patterns Conference at Binghamton University to complete certain activities (registration to conference, visiting a lab, choosing visiting type, attending a presentation and having dinner in a restaurant) during the conference. There is time, cost and carbon footprint associated with each of these activities. Money is measured in dollars, time is measured in minutes and carbon-footprint is measured in tonnes. Each attendee is required to complete 5 activities mentioned above. However, all attendees have some flexibility in how much time, money and carbon footprint they spend for each activity. 

Input Verification:
	The value of DEBUG_VALUE should be between 0 and 4.

Use Debug in the following way:

	If Debug value is 0: do not print anything
	If Debug value is 1: print each attendee's list of activities and time/money/CO2 spent on each 	activity (Default debug value)
	If Debug value is 2: print every time an activity is done by an attendee
	If Debug value is 3: print  every an attendee attends the conference
	If Debug value is 4: print every time time/money/CO2	 spent on an activity

PERCENT COMPLETE:

 "We believe we have completed 100% of this project."

PARTS THAT ARE NOT COMPLETE:

None

BUGS:

None

FILES:

  Included with this project are 23 files:

  Attandee.java, the file that constructs attendee with its activities and calls attend method.
  Labs.java, enumeration class for 3 different labs to be visited.
  LabVisit.java, enumeration class for 3 different types of lab visit option.
  Presentation.java, enumeration class for 3 different presentations .
  Registration.java, enumeration class for 2 different types of registration.
  Restaurant.java, enumeration class for 3 different restaurants to be visited.
  Activity.java, the file that includes information about  time/money/CO2 sent on an activity.
  ActivityBuilder.java, abstract class for building activities.
  ActivityLab.java, the file that implements lab activity.
  ActivityLabVisit, the file that implements lag visit type activity.
  ActivityPresentation.java, the file that implements attending a presentation activity.
  ActivityRegister.java, the file that implements registration activity.
  ActivityRestaurant.java, the file that implements visiting restaurant activity.
  ResultsInterface.java, it is the interface for Results.
  Results.java, the file that contains attendee's activities and time/money/CO2 spent on each activity     results.
  Display.java, it is the class that displays results.
  WorkShopInterfcace, it is the interface with construct method for Worksop.
  Workshop.java, the file that implements construct method to construct an activity.
  UnitInterface.java, the interface that holds measurement units.
  Debug.java, the file which includes information about the debug value.
  Logging.java, the file that implements debug values.
  Driver.java, the main file associated with the program.
  Build.xml, the file that is used for building the project with Ant.

  README.txt, the text file you are presently reading.

Buildfile: C:\workspace\Pinar_Kuzlu_Nina Balachandran_Mary_assign2\designConf\build.xml

jar:

run:
     [java] Attendee ID: 1
     [java] Attendee Activity Results
     [java] Registration Type: RegisterByOtherCard
     [java] Money spent on Activity = 100.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 0 tonnes
     [java] 
     [java] Lab Type: Lab3
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 15 minutes
     [java] Carbon FootPrint spent on Activity = 5 tonnes
     [java] 
     [java] Lab Visit Type: onFoot
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 50 minutes
     [java] Carbon FootPrint spent on Activity = 30 tonnes
     [java] 
     [java] Presentation Type: presentation3
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 50 tonnes
     [java] 
     [java] Restaurant Type: LemongrassRestaurant
     [java] Money spent on Activity = 35.0 dollars
     [java] Time spent on Activity = 75 minutes
     [java] Carbon FootPrint spent on Activity = 50 tonnes
     [java] 
     [java] 
     [java] Attendee ID: 2
     [java] Attendee Activity Results
     [java] Registration Type: RegisterByBUAlumniPlatinumCard
     [java] Money spent on Activity = 90.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 0 tonnes
     [java] 
     [java] Lab Type: Lab2
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 10 minutes
     [java] Carbon FootPrint spent on Activity = 10 tonnes
     [java] 
     [java] Lab Visit Type: takeElevatorsTunnels
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 40 minutes
     [java] Carbon FootPrint spent on Activity = 60 tonnes
     [java] 
     [java] Presentation Type: presentation2
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 30 tonnes
     [java] 
     [java] Restaurant Type: Number5Restaurant
     [java] Money spent on Activity = 40.0 dollars
     [java] Time spent on Activity = 80 minutes
     [java] Carbon FootPrint spent on Activity = 60 tonnes
     [java] 
     [java] 
     [java] Attendee ID: 3
     [java] Attendee Activity Results
     [java] Registration Type: RegisterByOtherCard
     [java] Money spent on Activity = 100.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 0 tonnes
     [java] 
     [java] Lab Type: Lab1
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 5 minutes
     [java] Carbon FootPrint spent on Activity = 10 tonnes
     [java] 
     [java] Lab Visit Type: campusBus
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 30 minutes
     [java] Carbon FootPrint spent on Activity = 80 tonnes
     [java] 
     [java] Presentation Type: presentation1
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 10 tonnes
     [java] 
     [java] Restaurant Type: PSRestaurant
     [java] Money spent on Activity = 50.0 dollars
     [java] Time spent on Activity = 90 minutes
     [java] Carbon FootPrint spent on Activity = 60 tonnes
     [java] 
     [java] 
     [java] Attendee ID: 4
     [java] Attendee Activity Results
     [java] Registration Type: RegisterByBUAlumniPlatinumCard
     [java] Money spent on Activity = 90.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 0 tonnes
     [java] 
     [java] Lab Type: Lab3
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 15 minutes
     [java] Carbon FootPrint spent on Activity = 5 tonnes
     [java] 
     [java] Lab Visit Type: onFoot
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 50 minutes
     [java] Carbon FootPrint spent on Activity = 30 tonnes
     [java] 
     [java] Presentation Type: presentation3
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 50 tonnes
     [java] 
     [java] Restaurant Type: LemongrassRestaurant
     [java] Money spent on Activity = 35.0 dollars
     [java] Time spent on Activity = 75 minutes
     [java] Carbon FootPrint spent on Activity = 50 tonnes
     [java] 
     [java] 
     [java] Attendee ID: 5
     [java] Attendee Activity Results
     [java] Registration Type: RegisterByOtherCard
     [java] Money spent on Activity = 100.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 0 tonnes
     [java] 
     [java] Lab Type: Lab2
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 10 minutes
     [java] Carbon FootPrint spent on Activity = 10 tonnes
     [java] 
     [java] Lab Visit Type: takeElevatorsTunnels
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 40 minutes
     [java] Carbon FootPrint spent on Activity = 60 tonnes
     [java] 
     [java] Presentation Type: presentation2
     [java] Money spent on Activity = 0.0 dollars
     [java] Time spent on Activity = 0 minutes
     [java] Carbon FootPrint spent on Activity = 30 tonnes
     [java] 
     [java] Restaurant Type: Number5Restaurant
     [java] Money spent on Activity = 40.0 dollars
     [java] Time spent on Activity = 80 minutes
     [java] Carbon FootPrint spent on Activity = 60 tonnes
     [java] 
     [java] 

BUILD SUCCESSFUL
Total time: 1 second


TO COMPILE:

Just extract the files and then compile the dTunesStore with ANT.
(
   1. cd to the folder where you downloaded Pinar_Kuzlu_Nina\ Balachandran_Mary_assign2.tar.gz
   2. use these commands:
	2a) gunzip Pinar_Kuzlu_Nina\ Balachandran_Mary_assign2.tar.gz
	2b) tar -xvf Pinar_Kuzlu_Nina\ Balachandran_Mary_assign2.tar.gz
   3. cd to Pinar_Kuzlu_Nina\ Balachandran_Mary_assign2
   4. cd to designConf
   5. ant compile
)

TO RUN:

Please run as: Project Location >ant run

  For example:  PINARs-MacBook-Pro:designConf pinarkuzlu$ ant run

  To test with different debug values go to build.xml and change <argvalue> in the target "run". 

BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
PINAR KUZLU, NINA BALACHANDRAN MARY


  * http://www.cs.binghamton.edu/~mgovinda/courses/cs542/
 

ACKNOWLEDGEMENT:

M. Govindaraju


  

