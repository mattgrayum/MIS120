//Grayum

//Date: 2/7/2017

//Chapter 3 Practice

import java.util.Scanner;

public class CalculateBMI
{
   public static void main(String[] args)
   {
   
      double weight = getValidDouble("Enter your weight in pounds: ") * 0.45359237;
      double height = getValidDouble("Enter your height in inches: ") * 0.0254;
   
      double bmi = weight / Math.pow(height, 2);
   
      String strOut = "\nYour BMI is " + bmi + ". \n\nThis is considered to be ";
   
      if (bmi < 18.5)
      {
         System.out.println(strOut + "underweight");
      }   
         
      else if (bmi < 25.0)
      {
         System.out.println(strOut + "normal");   
      } 
      else if (bmi < 30.0)
      {
         System.out.println(strOut + "overweight");   
      } 
      else 
      {
         System.out.println(strOut + "obese");   
      }   
   }
   
   public static double getValidDouble(String prompt)
   {
      Scanner input = new Scanner(System.in);
      double value = 0;
      boolean valid;
      
      do
      {
         System.out.print(prompt);
         
         try
         {
            value = Double.parseDouble(input.next());
            valid = true;
         }
         catch (NumberFormatException ignore) 
         {
            valid = false;   
            System.out.println("\n\nERROR - Invalid input\n\n");
         }
      }while(valid == false);
      
      return value;
   }
}