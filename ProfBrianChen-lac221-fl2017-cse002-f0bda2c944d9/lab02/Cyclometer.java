////////////////////////////
///Lydia Cornwell
///Chen CSE 002
///sept. 12 2017

public class Cyclometer {
  
  public static void main(String[] args) {
    int secsTrip1 = 480; //number of seconds in trip 1
    int secsTrip2 = 3220; //number of seconds in trip 2
    int countsTrip1 = 1561; //rotations of front wheel in trip 1
    int countsTrip2 = 9037; //rotations of front wheel in trip 2
    
    double wheelDiameter=27.0,  //diameter of front wheel
  	PI = 3.14159, //PI 
  	feetPerMile = 5280,  //number of feet in a mile
  	inchesPerFoot = 12,   //number of inches in a foot
  	secondsPerMinute = 60;  //number of seconds in a min 
    double distanceTrip1, distanceTrip2, totalDistance;  //distances of trip 1, 2, and total distance
    
     System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts."); 
    //calculate trip minutes in trip one and print time and rotations of front wheel to terminal window
	   System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
    //calculate trip minutes in trip two and print time and rotations of front wheel to terminal window
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2 = countsTrip2 * wheelDiameter * PI/inchesPerFoot/feetPerMile; // calculates distance in miles for trip two
	totalDistance = distanceTrip1 + distanceTrip2; //calculates total distance of both trips
    
    //Print out the output data.
  System.out.println("Trip 1 was " + distanceTrip1 + " miles");
	System.out.println("Trip 2 was " + distanceTrip2 + " miles");
	System.out.println("The total distance was " + totalDistance + " miles");

    
  } //end of main method
} //end of class Cyclometer