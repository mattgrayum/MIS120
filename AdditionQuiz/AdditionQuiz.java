//Grayum

//Date: 2/7/2017

//Chapter 3 Practice

import java.util.Scanner;

public class AdditionQuiz
{
   public static void main(String[] args)
   {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        String response;
 
        do
        {
            //Create a Scanner
            Scanner input = new Scanner(System.in);
            
           System.out.print("What is " + number1 + " + " + number2 + "? ");
           
           int answer = input.nextInt();
           
           System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
           
           System.out.print("Another? (y or n): ");
           response = input.next();
           
         }while(response == "y" || response == "Y");
           
           
   }
   
}   
