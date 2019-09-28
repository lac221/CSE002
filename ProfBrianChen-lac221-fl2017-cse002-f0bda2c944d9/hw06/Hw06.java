///////////////////
//Lydia Cornwell
//CSE 2
//hw06

import java.util.Scanner;

public class Hw06{
  public static void main(String[] args){
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter course number: ");
    boolean courseTest = true;
    int courseNum = 0;
    while(courseTest){
      if(myScanner.hasNextInt()){
        courseNum = myScanner.nextInt();
        courseTest = false;
      }
      else{
        System.out.println("Error, please enter course number as an integer");
        myScanner.next();
      }
    }
    
    System.out.println("What department is the course in? ");
    boolean deptTest = true;
    String deptName = "";
    while(deptTest){
      if(myScanner.hasNext() && !(myScanner.hasNextDouble()) && !(myScanner.hasNextInt())){
        deptName = myScanner.next();
        deptTest = false;
      }
      else{
        System.out.println("Error, please enter department as a string: ");
        myScanner.next();
      }
    }
    
    System.out.println("How many times does this class meet a week?");
    boolean amountTest = true;
    int numTimes = 0;
    while(amountTest){
      if(myScanner.hasNextInt()){
        numTimes = myScanner.nextInt();
        amountTest = false;
      }
     else{
       System.out.println("Error please enter how many times the class meets as an integer");
       myScanner.next();
     } 
    }
  
    System.out.println("What time does the class start?");
    boolean timeTest = true;
    int time = 0;
    while(timeTest){
      if(myScanner.hasNextInt()){
        time = myScanner.nextInt();
        timeTest = false;
        }
      }
      else{
        System.out.println("Error, please enter time as a four digit int");
        myScanner.next();
      }
    }
    
    System.out.println("Who is the teacher");
    boolean teachTest = true;
    String teachName = "";
    while(teachTest){
      if(myScanner.hasNext() && !(myScanner.hasNextDouble()) && !(myScanner.hasNextInt())){
        teachName = myScanner.next();
        teachTest = false;
      }
      else{
        System.out.println("Error, please enter teacher name as a string: ");
        myScanner.next();
      }
    }
    
    System.out.println("How many students are in the class?");
    boolean studentTest = true;
    int numStudents = 0;
    while(studentTest){
      if(myScanner.hasNextInt()){
        numStudents = myScanner.nextInt();
        studentTest = false;
      }
     else{
       System.out.println("Error please enter the number of students as an integer");
       myScanner.next();
     } 
    }
    
    System.out.println("Course number: " + courseNum);
    System.out.println("Department: " + deptName);
    System.out.println("Meetings a week: " + numTimes);
    System.out.println("Start time: " + time);
    System.out.println("Teacher name: " + teachName);
    System.out.println("Number of students in class: " + numStudents);
    
  }
}