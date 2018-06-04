//Grayum

//Due Date: 2/7/2017

//Chapter 2 Programming Exercise 2.3

import java.util.Scanner;

public class Convert_Grayum
{
   public static void main(String[] args)
   {
      double feet = 0;
      Scanner input = new Scanner(System.in);
      
      while(true)
      {
         System.out.print("Enter a value for feet: ");
         
         try
         {
            feet = Double.parseDouble(input.next());
            break;
         }
         catch (NumberFormatException ignore) 
         {
           System.out.println("\n\nERROR - Invalid input\n\n");
         }
      }
      double meters = feet * .305;
      
      System.out.println(feet + " feet is equal to " + meters + " meters.");
   }
}