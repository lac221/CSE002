

import java.util.Scanner; //must have this statement to use the scanner class

public class Check{
    			//main method
   			public static void main(String[] args) {
          
          Scanner myScanner = new Scanner( System.in ); //creates an instance of class scanner
 
System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompts user to enter cost of check
double checkCost = myScanner.nextDouble(); //imports given value into checkCost
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " ); //prompts user to enter tip%
double tipPercent = myScanner.nextDouble(); //imports given value into tipPercent
tipPercent /= 100; //converts the percentage into a decimal value

System.out.print("Enter the number of people who went out to dinner: "); //prompts user to enter # of people paying
int numPeople = myScanner.nextInt(); //imports given value into numPeople


          
double totalCost; //declares variable total cost as a double
double costPerPerson;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent); //calculates the cost including tip
costPerPerson = totalCost / numPeople; //calculates how much each person must pay

dollars=(int)costPerPerson;//get the whole amount, dropping decimal fraction

dimes=(int)(costPerPerson * 10) % 10;//get dimes amount, 
pennies=(int)(costPerPerson * 100) % 10; //get pennies amount
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); //prints how much each person pays

}  //end of main method   
  	} //end of class
