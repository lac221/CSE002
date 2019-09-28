import java.util.Scanner;
import java.util.Arrays;
public class CSE2Linear{ 
    public static void main (String[]args){
        System.out.println("Enter 15 ints");// asks user to enter 15 ints
        Scanner myScanner  = new Scanner(System.in);
        int counter = 0;
        int[] array1 = new int[15];
        while (counter < 15){
            if (myScanner.hasNextInt()){
                array1[counter] = myScanner.nextInt();
                if (array1[counter] < 0 || array1[counter] > 100){// checks to see if the user input is greater than 100 or less than 0
                    System.out.println("You didn't enter an int within the range 0-100");
                    System.exit(0);
                }
                else{
                    if (counter > 0){
                        if (array1[counter] < array1[counter - 1]){// check to make sure the input is greater than the previous number
                            System.out.println("You didn't enter an intger greater than the last one ");
                            System.exit(0);
                        }
                    }
                counter++;
                }
            }
            else{
                System.out.println("You didn't enter an integer");
                System.exit(0);
            }
        }
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(array1));// converts array to a string statement so it can be printed 
        System.out.print("Enter a grade to search for: ");
        if (myScanner.hasNextInt()){// checks to see if the user input an int
       
            int x = myScanner.nextInt();
            BinarySearch(array1, x);
            Scramble(array1);
            System.out.println("Scrambled:");// prints "Scrambled:"
            System.out.println(Arrays.toString(array1));// coverts scrambled array to string so it can be printed
            System.out.print("Enter a grade to search for: ");// tells the user to enter a number to search for
            if (myScanner.hasNextInt()){
                LinearSearch(array1,x);
            }
            else{
                System.out.println("You didn't enter an integer");
                System.exit(0);
            }
        }
        else{
            System.out.println("You didn't enter a grade to seach for");
            System.exit(0);
        }
    }
    
    public static void LinearSearch(int[] array1, int x){
        for (int i = 0; i < array1.length; i++){
       
            if (array1[i] == x){// checks to see if the number at given position is equal to the user input
           
                System.out.println(x + " was found in the list in " + (i + 1) + " iterations");
                break;
            }
            else if (array1[i] != x && i == (array1.length - 1)){//if user input is not found after 15 iterations 
            
                System.out.println(x + " was not found in " + (i + 1) + " iterations");
            }
        }
    }
    public static int[] Scramble(int[] array1){
        for (int i = 0; i < array1.length; i++){
            int x = (int)(Math.random()*array1.length);// random number 
            int temp = array1[i];// stores number at i index in array temporarily
            while (x != i){// as long as the random number isn't equal to i switch the indices of i and the random number
            
                array1[i] = array1[x];
                array1[x] = temp;
                break;
            }
        }
        return array1;
    }
    public static void BinarySearch(int[] array2, int integer){
        int higherIndex = array2.length - 1;
        int lowerIndex = 0;
        int counter = 0;
        while (lowerIndex <= higherIndex){
            counter++;
            int midIndex = (higherIndex + lowerIndex)/2;
            if (integer < array2[midIndex]) {
                higherIndex = midIndex - 1;
            }
            else if (integer > array2[midIndex]){
                lowerIndex = midIndex + 1;   
            }
            else if (integer == array2[midIndex]){
                System.out.println(integer + " was found in " + counter + " iterations");
                break;
            }
        }
        if (lowerIndex > higherIndex){
            System.out.println(integer + " was not found in " + counter + " iterations");
        }
    }
}