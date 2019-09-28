import java.util.Scanner;
public class encrypted_x {
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Input an integer 0-100: ");
    boolean intTest = true;
    int squareSize = 0;
    while (intTest) {
      if (myScanner.hasNextInt()) {
        squareSize = myScanner.nextInt();
        if (squareSize >= 0 && squareSize <= 100) {
          intTest = false;
        } else {
          System.out.println("Error, please type in an integer");
        }
      } else {
        System.out.println("Error, please type in an integer");
        myScanner.next();
      }
    }
    
    for(int i = 0; i < squareSize; i++){
      for(int j = 0; j < squareSize; j++){
        if(j % squareSize == i || j%squareSize == squareSize - i -1){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}