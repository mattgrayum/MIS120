//Grayum

//Date: 3/9/2017

//MIS 120 Chapter 5 Homework

public class DivisibleBy5or6_Grayum
{
   public static void main(String[] args)
   {
      /*Displays a table with numbers 10 through 100 in the first column,
        and if that number can be divided evenly by 5 or 6 in the next 
        two columns (Yes or No).
      */
      
      final String HEADER_FORMAT = "|%8s|%11s|%11s|\n";
      
      //Header
      System.out.println("\n|========|===========|===========|");
      System.out.printf(HEADER_FORMAT, "", center("Divisible", 11), center("Divisible", 11));
      System.out.printf(HEADER_FORMAT, center("Number", 8), center("by 5", 11), center("by 6", 11));
      System.out.println("|========|===========|===========|");
      
      //Create table body
      for(int i = 10; i <= 100; i++)
      {
         System.out.printf("|%8s|", center(String.valueOf(i), 8));
         System.out.printf("%11s|%11s|\n", 
                          center((i % 5 == 0) ? "Yes" : "No", 11),
                          center((i % 6 == 0) ? "Yes" : "No", 11));
         if(i < 100)
            System.out.println("|--------|-----------|-----------|");
         else 
            System.out.println("|========|===========|===========|");
      }
   }
   
   public static String center(String str, int spaces)
   {
      /*A method that returns a string that is centered within
        a given number of spaces.
      */
      String pad = "";

      for(int i = 0; i < (spaces - str.length()) / 2; i++)
      {
         pad += " ";
      }   
      return pad + str + pad;
   }                           
}
