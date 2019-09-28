//////////////////////
//Lydia Cornwell
//cse 002
//Area.java

import java.util.Scanner;

public class Area{
  public static void main(String[] args){
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("What shape would you like to find the area of(circle, rectangle, or triangle): ");
    boolean shapeTest = true;
    String shape = null;
    while(shapeTest){
      if(myScanner.hasNext() && !(myScanner.hasNextDouble()) && !(myScanner.hasNextInt())){
        shape = myScanner.next();
        switch(shape){
            //checks which shape the input matches, so that it can run the corresponding method
            //if a user enters bad input, they are re prompted until they enter one of the three shapes
          case ("rectangle"):
            System.out.print("Enter the width of the rectangle: ");
            double width = input(myScanner);
            System.out.print("Enter the height of the rectangle: ");
            double height = input(myScanner);
            rectArea(width, height);
            shapeTest = false;
            break;
          case ("triangle"):
            System.out.print("Enter the base of the triangle: ");
            double base = input(myScanner);
            System.out.print("Enter the height of the triangle: ");
            double triHeight = input(myScanner);
            triArea(base, triHeight);
            shapeTest = false;
            break;
          case ("circle"):
            System.out.print("Enter the radius of the circle: ");
            double radius = input(myScanner);
            circArea(radius);
            shapeTest = false;
            break;
          default:
            System.out.print("Error, please enter an acceptable shape: ");
            myScanner.next(); 
        }
        
      }
      else{
        System.out.print("Error, please enter an acceptable shape: ");
        myScanner.next();
      }
    }
    
  }
  public static void rectArea(double width, double height){
    //calculates and prints the area of a rectangle
    double area = width * height;
    System.out.println("The area of the rectangle is: " + area);
  }
  public static void triArea(double base, double height){
    //calculates and prints the area of a triangle
    double area = (base * height)/2;
    System.out.println("The area of the triangle is: " + area);
  }
  public static void circArea(double radius){
    //calculates and prints the area of a circle
    double area = Math.pow(radius, 2) * 3.14;
    System.out.println("The area of the circle is: " + area);
  }
  public static double input(Scanner s){
    //tests input to see if it is a double. If the user doesnt enter a double they are re-prompted until they enter doubles
    boolean doubleTest = true;
    double value = 0;
    while(doubleTest){
      if(s.hasNextDouble()){
        value = s.nextDouble();
        doubleTest = false;
      }
      else{
        System.out.println("Error, please enter a double: ");
        s.next();
      }
    }
    return value;
  }
}