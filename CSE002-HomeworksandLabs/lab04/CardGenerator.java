////////////////////////////////////
//CSE 002 Lydia Cornwell 
//CardGenerator.java - Use a random number generator to select a number from 1 to 52 (inclusive).  Each number represents
//one card, and the suits are grouped:  Cards 1-13 represent the diamonds, 14-26 represent the clubs, 
//then hearts, then spades.  In all suits, card identities ascend in step with the card number: 
//14 is the ace of clubs, 15 is the 2 of clubs, and 26 is the king of clubs.

public class CardGenerator {
  
  public static void main(String[] args){
    
    int baseNum = 1;
    int upperBound = 52;
    
    int randomNumber = (int)(Math.random()*(upperBound + 1)) + baseNum;
    
    String cardNumber;
    String cardSuit = "Suit";
    
    if( randomNumber <= 13 ){
      cardSuit = "Diamonds";
    }
    
    if( (randomNumber > 13) && (randomNumber <= 26) ){
      cardSuit = "Clubs";
    }
    
    if( (randomNumber > 26) && (randomNumber <= 39) ){
      cardSuit = "Hearts";
    }
    
    if( (randomNumber > 39) && (randomNumber <= 52) ){
      cardSuit = "Spades";
    }
    
    switch (randomNumber) {
      case (1):
        cardNumber = "Ace";
        break;
      case (14):
        cardNumber = "Ace";
        break;
      case (27):
        cardNumber = "Ace";
        break;
      case (40):
        cardNumber = "Ace";
        break;
        
        
      case (11):
        cardNumber = "Jack";
        break;
      case (24):
        cardNumber = "Jack";
        break;
      case (37):
        cardNumber = "Jack";
        break;
      case (50):
        cardNumber = "Jack";
        break;
        
        
      case (12):
        cardNumber = "Queen";
        break;
      case (25):
        cardNumber = "Queen";
        break;
      case (38):
        cardNumber = "Queen";
        break;
      case (51):
        cardNumber = "Queen";
        break;
        
        
      case (13):
        cardNumber = "King";
        break;
      case (26):
        cardNumber = "King";
        break;
      case (39):
        cardNumber = "King";
        break;
      case (52):
        cardNumber = "King";
        break;
        
      default: 
    }
    
   System.out.println("Your card is the " + cardNumber + " of " + cardSuit);
    
  }
}

