//Grayum

//Date: 2/9/2017

//MIS 120 - Exam #1

import java.util.Scanner;

public class GratuityCalculator_Grayum
{
   public static void main(String[] args)
   {
      double total = 0.0;
      double gratuityPercentage = 0.0;
      double totalGratuity = 0.0;
      double totalBill = 0.0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your toal bill: ");
      total = input.nextDouble();
      
      System.out.print("Enter a percentage for a gratuity: ");
      gratuityPercentage = input.nextDouble();
      
      totalGratuity = total * gratuityPercentage;
      
      totalBill = total + totalGratuity;
      
      System.out.printf("You have a total bill of $%,.2f" + 
                         " which consists of a $%,.2f" + 
                         " bill and a $%,.2f tip.", totalBill, total, totalGratuity);
      
   }  
}   
