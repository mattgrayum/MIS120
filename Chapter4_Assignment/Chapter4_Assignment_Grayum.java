//Grayum

//Date: 2/21/2017

//MIS 120 Chapter 4 Assignment

import java.util.Scanner;

public class Chapter4_Assignment_Grayum
{
   public static void main(String[] args)
   { 
      /*Get Social Security Number input from user and validate
       *the input format
       */
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a Social Security Number in the form ###-##-####: ");
      String str = input.next();
      boolean validSSN = true;
      
      if(str.length() == 11) //If not correct length, don't bother looping
      {
         for(int i = 0; ((i < str.length()) && (validSSN == true)); i++)
         {
            validSSN = false;
            if(validSSN_Char(i, str.charAt(i))){validSSN = true;} 
         }  
      }
      else validSSN = false;
            
      if(validSSN){System.out.println("Good job! That's a valid Social Security Number.");}
      else {System.out.println("*ERROR* Invalid entry");}
   }
   
   public static boolean validSSN_Char(int index, char ch)
   {
      /*Checks a character based on it's index postition in a string  
       *to determine if it's part of a valid Social Security Number
       */  
      boolean validChar = false;
      
      switch(index)
      {
         case 0:
         case 1:
         case 2:
         case 4:
         case 5:
         case 7:
         case 8:
         case 9:
         case 10: if (Character.isDigit(ch)){validChar = true;}
                  break;
         case 3: 
         case 6: if(ch == '-'){validChar = true;}
                 break;                
      }
      return validChar;
   }
   
}         