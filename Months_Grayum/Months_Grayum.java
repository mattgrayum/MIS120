//Grayum

//Due Date: 2/16/2017

//Chapter 3 Programming Exercise 3.4

import java.util.Scanner;

public class Months_Grayum
{
   public static void main(String[] args)
   {
      int month = 0;
      
      do
      {
         month = (int)(Math.random() * 10 * 1.33);
         
       }while(month < 1 || month > 12); //re-pick number if month is 0 or 13, which are possible outcomes 
      
      System.out.println("\nThe " + month + addOrdinal(month) + " month of the year is " + 
                          getMonthName(month) + ".");
   }
   
   public static String addOrdinal(int value)
   {
      String ordinal = "";
   
      if(value == 1) ordinal = "st";
      else if (value == 2) ordinal = "nd";
      else if (value == 3) ordinal = "rd";
      else ordinal = "th";
      
      return ordinal;
   }
   
   public static String getMonthName(int monthNumber)
   {
      String monthName = "";
      
      switch(monthNumber)
      {
         case 1: 
            monthName = "January";
            break;
         case 2: 
            monthName = "February";
            break;
         case 3: 
            monthName = "March";
            break;
         case 4: 
            monthName = "April";
            break;
         case 5: 
            monthName = "May";
            break;
         case 6: 
            monthName = "June";
            break;
         case 7: 
            monthName = "July";
            break;
         case 8: 
            monthName = "August";
            break;
         case 9: 
            monthName = "September";
            break;
         case 10: 
            monthName = "October";
            break;
         case 11: 
            monthName = "November";
            break;
         case 12: 
            monthName = "December";
            break;
      }
      return monthName;      
   }
   
}   
