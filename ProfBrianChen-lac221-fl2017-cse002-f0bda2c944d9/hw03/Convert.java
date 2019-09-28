/////////////////////////////////////////
//CSE 2 hw03
//Convert.java - asks the user for doubles that represent the number of acres of land affected by hurricane precipitation
//and how many inches of rain were dropped on average then converts the quantity of rain into cubic miles.
//
import java.util.Scanner; //must have this to use the Scanner class

public class Convert { //start of class convert
  
  public static void main(String[] args) { //start of main method
    
    Scanner myScanner = new Scanner(System.in); // creates an instance of class scanner
    
    System.out.print("Enter the affected area in acres: "); //prompts user to enter a number for the affected area
    double acresAffected = myScanner.nextDouble(); //stores given value in variable acresAffected
    
    System.out.print("Enter the rainfall in the affected area: "); //prompts user for the rainfall in the affected area
    double inchesOfRainfall = myScanner.nextDouble(); //stores given value in the variable rainfall
   
    double gallonsInInch = 27154;
    double gallonsOfRain = acresAffected * inchesOfRainfall * gallonsInInch; //calculates the gallons
    
    double gallonsInCubicMile = 9.0817 * Math.pow(10, -13); //# of cubic miles per gallon
    double cubicMiles = gallonsOfRain * gallonsInCubicMile; // calculates cubic miles
    
    System.out.println("Cubic Miles: " + cubicMiles); //prints out the result to terminal window
  } //end of main method
} //end of class Convert