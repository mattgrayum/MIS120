//Grayum

//Date: 2/14/2017

//MIS 120 - Exam #1

import java.util.Scanner;

public class TaxCalculator_Grayum
{
   public static void main(String[] args)
   {
      final double TAXRATE = 0.35;
      double income = 0.0;
      double taxPaid = 0.0;
      double taxOwed = 0.0;
      double refund = 0.0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your income: ");
      income = input.nextDouble();
      
      taxOwed = income * TAXRATE;
      
      System.out.print("Enter the tax you paid: ");
      taxPaid = input.nextDouble();
      
      refund = taxPaid - taxOwed;
      
      if(refund >= 0)
      {
         System.out.printf("You have a refund of $%,.2f", refund);
      }
      else
      {
         System.out.printf("You owe taxes of $%,.2f", refund * -1);
      }
   }
}   
