//Grayum

//Date: 3/19/2017

//MIS 120 Chapter 6 Assignment - 6.8

public class Fahrenheit_CelsiusConverter
{
   public static void main(String[] args)
   {
      final int MAX_LINES = 10;
      double celsius = 40.0;
      double fahrenheit = 120.0;
      
      System.out.printf("\n%-12s%-15s|%15s%12s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
      System.out.println("===========================|===========================");
      
      for(int i = 0; i < MAX_LINES; i++)
      {
         System.out.printf("%-12.1f%-15.1f|     %-15.1f%-7.2f\n", 
                           celsius, celsiusToFahrenheit(celsius), 
                           fahrenheit, fahrenheitToCelsius(fahrenheit));
         celsius -= 1;
         fahrenheit -= 10;                  
      }
   }
   
   public static double fahrenheitToCelsius(double fahrenheit)
   {
      return (5.0 / 9) * (fahrenheit - 32);
   }
   
   public static double celsiusToFahrenheit(double celsius)
   {
      return (9.0 / 5) * celsius + 32; 
   }
}