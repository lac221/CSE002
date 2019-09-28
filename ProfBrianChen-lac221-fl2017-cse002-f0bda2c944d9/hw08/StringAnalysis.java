////////////////////////
//Lydia Cornwell
//CSE 002
//StringAnalysis.java

import java.util.Scanner;

public class StringAnalysis{
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Please enter a string: ");
    String word = null;
    boolean wordTest = true;
    while(wordTest){
      if(myScanner.hasNext() && !(myScanner.hasNextInt()) && !(myScanner.hasNextDouble())){
        word = myScanner.next();
        wordTest = false;
        System.out.print("Would you like to analyze the whole string (type \"all\") or only part of the string (type \"part\"): ");
        boolean methodTest = true;
        String partOfString = null;
        int lengthOfString = 0;
        boolean result;
        
        while(methodTest){
          if(myScanner.hasNext() && !(myScanner.hasNextInt()) && !(myScanner.hasNextDouble())){
            partOfString = myScanner.next();
            switch(partOfString){
              case ("all"):
               result = stringTest(word);
                if(result){
                  System.out.println("True, the entire string is letters");
                }
                else{
                  System.out.println("False, the string is not all letters");
                }
                methodTest = false;
                break;
              case ("part"):
                System.out.print("Please enter how many characters you would like to test: ");
                boolean numTest = true;
                int testNum = 0;
                while(numTest){
                  if(myScanner.hasNextInt()){
                    testNum = myScanner.nextInt();
                    numTest = false;
                  }
                  else{
                    System.out.print("Error, please enter an integer for the number of characters to test: ");
                    myScanner.next();
                  }
                }
                result = stringTest(word, testNum);
                if(result){
                  System.out.println("True, the entire selected section of the string is letters");
                }
                else{
                  System.out.println("False, the selected section is not all letters");
                }
                methodTest = false;
                break;
              default:
                System.out.print("please type all or part: ");
                myScanner.next();
            }
          }
          else{
            System.out.print("Please type all or part: ");
            myScanner.next();
          }
        }
      }
      else{
        System.out.print("Please enter a string: ");
        myScanner.next();
      }
    }
  }
  public static boolean stringTest(String word){
    int letterCounter = 0;
    for(int i = 0; i < word.length(); i++){
      char testChar = word.charAt(i);
      if(Character.isLetter(testChar)){
        letterCounter += 1;
      }
    }
    if(letterCounter == word.length()){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static boolean stringTest(String word, int testNum){
    int letterCounter = 0;
    for(int i = 0; i < testNum; i++){
      char testChar = word.charAt(i);
      if(Character.isLetter(testChar)){
        letterCounter += 1;
      }
    }
    if(letterCounter == testNum){
      return true;
    }
    else{
      return false;
    }
  }
}