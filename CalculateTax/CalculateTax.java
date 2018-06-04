//Grayum

//Due Date: 2/16/2017

//Chapter 3 Programming Exercise 3.4

import java.util.Scanner;

public class CalculateTax
{
   public static void main(String[] args) {
      
      final double[] RATE = {.10, .15, .25, .28, .33, .35};    //Current tax rates for each bracket
  
      Scanner input = new Scanner(System.in);
      double taxAmount = 0;
      int incomeBracket;
      int status;
      
      //Get tax filing status
      do
      {
         System.out.print("Enter the number that corresponds with your tax filing status:\n\n" + 
                          "Single - 1\nMarried Filing Jointly - 2\nMarried Filing SepaRATEly - 3\n" +
                          "Head of Household - 4\n\nEnter your status here: ");      
         status = input.nextInt();
         
         if(status < 1 || 4 < status)
         {
            System.out.println("ERROR: Invalid entry.\n\n");
         }
         
      }while(status < 1 || 4 < status);   
             
      int[] brackets = getTaxBrackets(status);
      
      //Get taxable income
      do
      {
         System.out.print("Enter your taxable income as a whole dollar amount: ");
         int income = input.nextInt();
         
         if(income < 0)
         {
            System.out.println("ERROR: Invalid entry.\n\n");
         }   
      }while(income < 0);
      
      //Set tax bracket
      if     (income <= brackets[0]){incomeBracket = 0;}
      else if(income <= brackets[1]){incomeBracket = 1;}
      else if(income <= brackets[2]){incomeBracket = 2;}
      else if(income <= brackets[3]){incomeBracket = 3;}
      else if(income <= brackets[4]){incomeBracket = 4;}
      else                          {incomeBracket = 5;}
       
      //Calculate tax      
      if(incomeBracket == 0){taxAmount = income * RATE[0];}
      
      else
      {
         for(int i = 0; i < incomeBracket; i++)
         {
             taxAmount += brackets[i] * RATE[i];
             System.out.println(taxAmount);      
         }
         
         taxAmount += (income - brackets[incomeBracket - 1]) * RATE[incomeBracket];
      }
      
      System.out.println("With taxable income of $" + income + ", you will owe $" + 
                         taxAmount + " in taxes.");
   }
   
   public static int[] getTaxBrackets(int filingStatus)
   {
      final int MAX_TAX_BRACKETS = 5;
      int[] taxBrackets = new int[MAX_TAX_BRACKETS];
      
      if(filingStatus == 1)
      {
         taxBrackets[0] = 8350; taxBrackets[1] = 33950; taxBrackets[2] = 82250;
         taxBrackets[3] = 181550; taxBrackets[4] = 372950;
      }   
      //else if(filingStatus == 2){taxBrackets = {16700, 67900, 137050, 208850, 372950}};
      //else if(filingStatus == 3){taxBrackets = {8350, 33950, 68525, 104425, 186475}};
      //else                      {taxBrackets = {11950, 45500, 117450, 190200, 372950}};
      
      return taxBrackets;
   }
}                         
        
      
      