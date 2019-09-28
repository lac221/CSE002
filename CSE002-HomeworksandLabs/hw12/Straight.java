//////////////
//Lydia Cornwell
//CSE 002
import java.util.Arrays;
public class Straight{
  public static void main(String[] args){
    int numStraight = 0;
    for(int i = 0; i < 1000001; i++){
      int[] shuffled = shuffle(deck());
      
      //generate hand
    int[] hand = new int[5];
    for(int j = 0; j < hand.length; j++){
      hand[j] = shuffled[j];
    }
    //check for straight
    if(straight(hand)){
      numStraight++;
    }
    }
    System.out.println("There are " + numStraight + "straights in the test of 1 million");
    System.out.println("Percentage of straights: " + ((numStraight/1000000) * 100) + "%"); 
  }
   //creates a deck of 52 cards, numbered 0 through 51
  public static int[] deck(){ 
    int[] cards = new int[52];
    for(int i = 0; i < cards.length; i++){
      cards[i] = i;
    }
    return cards;
  }
  
  //shuffles the deck of cards
  public static int[] shuffle(int[] cards){
    for (int i = 0; i < cards.length; i++){
      int x = (int)(Math.random()*cards.length);// random number 
      int temp = cards[i];// stores number at i index in array temporarily
      while(x != i){// as long as the random number isn't equal to i switch the indices of i and the random number
        cards[i] = cards[x];
        cards[x] = temp;
        break;
      }
    }
    return cards;
  }
  
  public static int low(int[] cards){
    int low = cards[0];
    for(int i = 1; i < cards.length; i++){
      if(cards[i] < low){
        low = cards[i];
      }
    }
    return low;
  }
  
  public static boolean search(int[] cards, int x){
    for(int i = 0; i < cards.length; i++){
      if(cards[i] == x){
        return true;
      }
    }
    return false;
  }
  public static boolean straight(int[] cards){
    int lowNum = low(cards);
    boolean straightTest;
    for(int i = 1; i < cards.length; i++){
      straightTest = search(cards, lowNum+1);
      if(straightTest == false){
        return false;
      }
    }
    return true;
  }
}