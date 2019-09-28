///////////////////
//Lydia Cornwell
//cse 2
//10/6/17

import java.util.Scanner;
public class TwistGenerator{
  public static void main(String[] args){
    
    Scanner myScanner = new Scanner(System.in);
    
    int length = 0;
    boolean continueLoop = true;
    System.out.print("Please enter a postitive integer: ");
    while(continueLoop){
       if(myScanner.hasNextInt()){
         length = myScanner.nextInt();
        continueLoop = false;
       }
      else{
        System.out.print("error, please enter a postive integer: ");
        myScanner.next();
      }
    }
    
    for(int i = 0; i < length; i++ ){
      if(i % 3 == 0){
        System.out.print("\\");
      }
      else if( i % 3 == 1){
        System.out.print(" ");
      }
      else{
        System.out.print("/");
      }
    }
    
    System.out.println();
    
    for(int i = 0; i < length; i++){
      if(i % 3 == 0){
        System.out.print(" ");
      }
      else if( i % 3 == 1){
        System.out.print("X");
      }
      else{
        System.out.print(" ");
      }
    }
    
    System.out.println();
    
    for(int i = 0; i < length; i++){
      if(i % 3 == 0){
        System.out.print("/");
      }
      else if( i % 3 == 1){
        System.out.print(" ");
      }
      else{
        System.out.print("\\");
      }
    }
    
    System.out.println();
    
  }
}