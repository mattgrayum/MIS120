//Grayum

//Date: 2/7/2017

//Chapter 3 Practice

import java.util.Scanner;

public class IfThenPractice
{
   public static void main(String[] args)
   {
      double area = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an value for radius: ");
      double radius = input.nextDouble();
      
      
      if(radius >= 0)
      {
         area = radius * radius * 3.15159;
         System.out.println("The area for the " + "circle of radius " + radius + " is " + area);
      }
      else
      {
         System.out.println("Negative input");
      }
   }
}      
