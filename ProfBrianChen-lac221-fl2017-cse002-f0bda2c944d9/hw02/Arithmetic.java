////////////////////////////
///CSE 002
///Cornwell HW02 Arithmetic
public class Arithmetic {
  
  public static void main(String[] args){
    
int numPants = 3; //Number of pairs of pants
double pantsPrice = 34.98; //Cost per pair of pants

int numShirts = 2; //Number of sweatshirts
double shirtPrice = 24.99; //Cost per shirt

int numBelts = 1; //number of belts
double beltCost = 33.99; //cost per belt

double paSalesTax = 0.06; //tax rate

double totalCostOfPants; //total cost of pants
double totalCostOfShirts; //total cost of shirts
double totalCostOfBelts; //total cost of belts

double taxOnPants; //total tax on pants
double taxOnShirts; //total tax on shirts
double taxOnBelts; //total tax on belts

double totalCostOfPurchasesBeforeTax; //total cost before tax
double totalSalesTax; //total sales tax

double totalPaid; //total paid for purchase, including tax

totalCostOfPants = numPants * pantsPrice; //calculates cost of pants before tax
taxOnPants = totalCostOfPants * paSalesTax; //calculates tax on pants
    taxOnPants = ((int)(taxOnPants * 100)/100.0); //eliminates extra digits for the tax on pants 

totalCostOfShirts = numShirts * shirtPrice; //calculates cost of shirts before tax
taxOnShirts = totalCostOfShirts * paSalesTax; //calculates tax on shirts
    taxOnShirts = ((int)(taxOnShirts * 100) /100.0); //eliminates extra digits for the tax on shirts
    

totalCostOfBelts = numBelts * beltCost; //calculates cost of pants before tax
taxOnBelts = beltCost * paSalesTax; //calculates tax on pants
    taxOnBelts = ((int)(taxOnBelts * 100)/100.0); //eliminates extra digits for the tax on belts

totalCostOfPurchasesBeforeTax = totalCostOfPants + totalCostOfShirts + totalCostOfBelts; //calculates the total cost of 3 goods before taxnBelts
totalSalesTax = taxOnPants + taxOnShirts + taxOnBelts; //calculates the combined sales tax of all three products 
totalPaid = totalCostOfPurchasesBeforeTax + totalSalesTax; // adds cost before tax and tax to calculate total paid

System.out.println("Total cost of pants: " + totalCostOfPants); //prints total cost of pants to the terminal window
System.out.println("Total tax on pants: " + taxOnPants); //prints total tax of pants to the terminal window
System.out.println();
System.out.println("Total cost of shirts: " + totalCostOfShirts); //prints total cost of shirts to the terminal window
System.out.println("Total tax on shirts: " + taxOnShirts); //prints total tax on shirts to the terminal window
System.out.println();
System.out.println("Total cost of belts: " + totalCostOfBelts); //prints total cost of belts to the terminal window
System.out.println("Total tax on belts: " + taxOnBelts); //prints total tax on belts to the terminal window
System.out.println();
System.out.println("Total cost before tax: " + totalCostOfPurchasesBeforeTax); //prints the total cost before tax to terminal window
System.out.println("Total sales tax: " + totalSalesTax); //prints total sales tax to terminal window
System.out.println("Total paid for this transaction, including sales tax: " + totalPaid); //prints total paid for transaction
    
 }
}

