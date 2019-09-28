/////////////////////////////////////
// Lydia Cornwell
// CSE 002 hw03
//Pyramid.java - prompts the user for the dimensions of a pyramid and returns the volume inside the pyramid. 

import java.util.Scanner; //must have this to use the Scanner class

public class Pyramid { //begining of class Pyramid
  
  public static void main(String[] args){ //begining of main method
    
    Scanner myScanner = new Scanner(System.in); //creates an instance of class scanner 
    
    System.out.print("The square side of the pyramid is (input length): "); //prompts user to enter square side length
    double squareSide = myScanner.nextDouble(); //stores given value in the variable squareSide
    
    System.out.print("The height of the pyramid is (input height): "); //prompts the user to enter the height
    double height = myScanner.nextDouble(); //stores given value into variable height
    
    double volumeInside; //declares the variable for volume
    volumeInside = ((Math.pow(squareSide, 2) * height) / 3); //calculates volume with given values
    
    System.out.println("The volume inside the pyramid is: " + volumeInside); //prints the calculated volume to terminal 
    
    
  } //end of main method
} //end of class Pyramid