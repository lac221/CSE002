////////////
//Lydia Cornwell
//CSE 2

import java.util.Arrays;

public class HoldEm{
  public static void main(String[] args){
    int[] shuffled = shuffle(deck());
    
    int[] player1 = new int[7];
    int[] player2 = new int[7];
    
    //each players 2 cards
    player1[0] = shuffled[0];
    System.out.println("Player one gets the " + translateCard(shuffled[0]));
    player2[0] = shuffled[1];
    System.out.println("Player two gets the " + translateCard(shuffled[1]));
    player1[1] = shuffled[2];
    System.out.println("Player one gets the " + translateCard(shuffled[2]));
    player2[1] = shuffled[3]; 
    System.out.println("Player two gets the " + translateCard(shuffled[3]));
    
    //flop cards
    player1[2] = shuffled[4];
    player1[3] = shuffled[5];
    player1[4] = shuffled[6];
    player1[5] = shuffled[7];
    player1[6] = shuffled[8];
    
    player2[2] = shuffled[4];
    player2[3] = shuffled[5];
    player2[4] = shuffled[6];
    player2[5] = shuffled[7];
    player2[6] = shuffled[8];
    
    System.out.println("The flop cards are: " + translateCard(shuffled[4]) + ", " + translateCard(shuffled[5]) + ", " 
                       + translateCard(shuffled[6])  + ", " + translateCard(shuffled[7]) + ", " + translateCard(shuffled[8]));
    
    //Scoring
    int pOneScore = 0;
    int pTwoScore = 0;
    
    //see what the highest hand player one has 
    if(fullHouse(player1)){
      System.out.println("Player One has a full house");
      pOneScore += 5;
    }
    else if(flush(player1)){
      System.out.println("player One has a flush");
      pOneScore += 4;
    }
    else if(threes(player1)){
      System.out.println("Player One has three of a kind");
      pOneScore += 3;
    }
    else if(pair(player1)){
      System.out.println("Player One has a pair");
      pOneScore += 2;
    }
    else{ //high card hand
      System.out.println("Player One does not have a special hand: High card hand");
      pOneScore += 1;
    }
    
    //highest hand for player 2
    if(fullHouse(player2)){
      System.out.println("Player two has a full house");
      pTwoScore += 5;
    }
    else if(flush(player2)){
      System.out.println("Player Two has a flush");
      pTwoScore += 4;
    }
    else if(threes(player2)){
      System.out.println("Player two has three of a kind");
      pTwoScore += 3;
    }
    else if(pair(player2)){
      System.out.println("Player two has a pair");
      pTwoScore += 2;
    }
    else{
      System.out.println("Player two does not have a specaial hand: High card hand");
      pTwoScore += 1;
    }
    
    if(pOneScore > pTwoScore){
      System.out.print("Player One wins");
    }
    else if(pOneScore < pTwoScore){
      System.out.print("Player Two Wins");
    }
    else if(pOneScore == pTwoScore){
      System.out.print("Draw");
    }
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
  
  public static boolean pair(int[] hand){
    int count0 = 0; //declares a counter for each number of card
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;
    
    for(int i = 0; i < hand.length; i++){ //loops through the players hand to find what number cards they have
      switch(hand[i]%13){
        case 0:
          count0++;
        case 1:
          count1++;
        case 2:
          count2++;
        case 3:
          count3++;
        case 4:
          count4++;
        case 5:
          count5++;
        case 6:
          count6++;
        case 7:
          count7++;
        case 8:
          count8++;
        case 9:
          count9++;
        case 10: 
          count10++;
        case 11:
          count11++;
        case 12:
          count12++;
      }
    }
    //if there are a least 2 of a kind, return that there is a pair
    if((((count0 >= 2 || count1 >= 2) || (count2 >= 2 || count3 >= 2)) || ((count4 >= 2 || count5 >= 2) || (count6 >= 2 ||
      count7 >= 2))) || (((count8 >= 2 || count9 >= 2) || (count10 >= 2 || count11 >= 2)) || count12 >= 2)){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static boolean threes(int[] hand){
    int count0 = 0; //same as pairs, but check for three instead of two
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;
    
    for(int i = 0; i < hand.length; i++){
      switch(hand[i]%13){
        case 0:
          count0++;
        case 1:
          count1++;
        case 2:
          count2++;
        case 3:
          count3++;
        case 4:
          count4++;
        case 5:
          count5++;
        case 6:
          count6++;
        case 7:
          count7++;
        case 8:
          count8++;
        case 9:
          count9++;
        case 10: 
          count10++;
        case 11:
          count11++;
        case 12:
          count12++;
      }
    }
    if((((count0 >= 3 || count1 >= 3) || (count2 >= 3 || count3 >= 3)) || ((count4 >= 3 || count5 >= 3) || (count6 >= 3 ||
      count7 >= 3))) || (((count8 >= 3 || count9 >= 3) || (count10 >= 3 || count11 >= 3)) || count12 >= 3)){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean flush(int[] hand){
    int diamonds = 0;// declare a counter for each suit
    int clubs = 0;
    int hearts = 0;
    int spades = 0;
    
    for(int i = 0; i < hand.length; i++){
      switch((int)hand[i]/13){ //determine which suit the card is and add to that counter
        case 1:
          diamonds++;
        case 2:
          clubs++;
        case 3:
          hearts++;
        case 4:
          spades++;
      }
    }
    //if the counter is equal to the number of cards in the hand, the player has a flush, return true
    if((diamonds == hand.length || clubs == hand.length) || (hearts == hand.length || spades == hand.length)){
      return true;
    }
    else{
      return false;
    }
    
  }
  public static boolean fullHouse(int[] hand){ //if they have a pair and a double, return true, they have a full house
    if(pair(hand) && threes(hand)){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static String translateCard(int card){
    String cardName = "";
    if(card % 13 == 0){ //ace
      switch (card/13){
          case 1:
            cardName = "Ace of Diamonds";
            break;
          case 2:
            cardName = "Ace of Clubs";
            break;
          case 3: 
            cardName = "Ace of Hearts";
            break;
          case 4: 
            cardName = "Ace of Spades";  
        }
    }
      else if(card % 13 == 1){ //2
          switch (card/13){
          case 1:
            cardName = "Two of Diamonds";
            break;
          case 2:
            cardName = "Two of Clubs";
            break;
          case 3: 
            cardName = "Two of Hearts";
            break;
          case 4: 
            cardName = "Two of Spades";  
        }
      }
      else if(card % 13 == 2){ //3
          switch (card/13){
          case 1:
            cardName = "Three of Diamonds";
            break;
          case 2:
            cardName = "Three of Clubs";
            break;
          case 3: 
            cardName = "Three of Hearts";
            break;
          case 4: 
            cardName = "Three of Spades";  
        }
      }
      else if(card % 13 == 3){ //4
          switch (card/13){
          case 1:
            cardName = "Four of Diamonds";
            break;
          case 2:
            cardName = "Four of Clubs";
            break;
          case 3: 
            cardName = "Four of Hearts";
            break;
          case 4: 
            cardName = "Four of Spades";  
        }
      }
      else if(card % 13 == 4){ //5
          switch (card/13){
          case 1:
            cardName = "Five of Diamonds";
            break;
          case 2:
            cardName = "Five of Clubs";
            break;
          case 3: 
            cardName = "Five of Hearts";
            break;
          case 4: 
            cardName = "Five of Spades";  
              break;
        }
      }
      else if(card % 13 == 5){ //6
          switch (card/13){
          case 1:
            cardName = "Six of Diamonds";
            break;
          case 2:
            cardName = "Six of Clubs";
            break;
          case 3: 
            cardName = "Six of Hearts";
            break;
          case 4: 
            cardName = "Six of Spades";  
              break;
        }
      }
      else if(card % 13 == 6){ //7
          switch (card/13){
          case 1:
            cardName = "Seven of Diamonds";
            break;
          case 2:
            cardName = "Seven of Clubs";
            break;
          case 3: 
            cardName = "Seven of Hearts";
            break;
          case 4: 
            cardName = "Seven of Spades";  
              break;
        }
      }
      else if(card % 13 == 7){ //8
          switch (card/13){
          case 1:
            cardName = "Eight of Diamonds";
            break;
          case 2:
            cardName = "Eight of Clubs";
            break;
          case 3: 
            cardName = "Eight of Hearts";
            break;
          case 4: 
            cardName = "Eight of Spades";  
              break;
        }
      }
      else if(card % 13 == 8){ //9
          switch (card/13){
          case 1:
            cardName = "Nine of Diamonds";
            break;
          case 2:
            cardName = "Nine of Clubs";
            break;
          case 3: 
            cardName = "Nine of Hearts";
            break;
          case 4: 
            cardName = "Nine of Spades";  
              break;
        }
      }
      else if(card % 13 == 9){ //10
          switch (card/13){
          case 1:
            cardName = "Ten of Diamonds";
            break;
          case 2:
            cardName = "Ten of Clubs";
            break;
          case 3: 
            cardName = "Ten of Hearts";
            break;
          case 4: 
            cardName = "Ten of Spades";  
              break;
        }
      }
      else if(card % 13 == 10){ //jack
          switch (card/13){
          case 1:
            cardName = "Jack of Diamonds";
            break;
          case 2:
            cardName = "Jack of Clubs";
            break;
          case 3: 
            cardName = "Jack of Hearts";
            break;
          case 4: 
            cardName = "Jack of Spades";
              break;
        }
      }
      else if(card % 13 == 11){ //queen
          switch (card/13){
          case 1:
            cardName = "Queen of Diamonds";
            break;
          case 2:
            cardName = "Queen of Clubs";
            break;
          case 3: 
            cardName = "Queen of Hearts";
            break;
          case 4: 
            cardName = "Queen of Spades"; 
            break;
        }
      }
      else if(card % 13 == 12){ //king
          switch (card/13){
          case 1:
            cardName = "King of Diamonds";
            break;
          case 2:
            cardName = "King of Clubs";
            break;
          case 3: 
            cardName = "King of Hearts";
            break;
          case 4: 
            cardName = "King of Spades"; 
        }
      }
    return cardName;
    }  
  }  