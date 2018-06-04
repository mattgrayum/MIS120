//Grayum

//Date: 2/23/2017

//MIS 120 In Class Assignment #2

import java.util.Scanner;

public class Scrabble_Grayum
{
   public static void main(String[] args)
   {
      int wordTotal = 0;
      int bonus = 0;
      boolean validWord = true;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word in uppercase or lowercase: ");
      String word = new String(input.next());
      
      //By creating a separate object for the lowercase version of the word, 
      //I can output the word back to the user in the same form in which it was entered
      String lcWord = new String(word.toLowerCase()); 
            
      for(int i = 0; i < lcWord.length() && validWord == true; i++)
      {
         int letterScore = charScore(lcWord.charAt(i));
         if(letterScore == 0){validWord = false;}    
         else {wordTotal += letterScore;}   
      }
      
      if(validWord)
      {
         System.out.println("Total for word " + word + " is: " + wordTotal);
         
         if(word.length() > 4)
         {
            determineBonus(word.length(), wordTotal, word);
         }
      }
      else 
      {
         System.out.println("At least one of the characters you entered isn't a letter.\n" +
                            "You are disqualified!");
      }                           
   }
   
   public static int charScore(char ch)
   {
      int score;
      switch(ch)
      {
         case 'a':   case 'e':   case 'i':   case 'u':   case 'n':   
         case 'r':   case 'o':   case 's':   case 'l':   case 't': 
            score = 1;
            break;
         case 'g':   case 'd': 
            score = 2;
            break;
         case 'm':   case 'b':   case 'c':   case 'p': 
            score = 3;
            break;
         case 'y':   case 'f':   case 'v':   case 'w':   case 'h': 
            score = 4;
            break;
         case 'k': 
            score = 5;
            break; 
         case 'j':   case 'x': 
            score = 8;
            break;                            
         case 'q':   case 'z': 
            score = 10;
            break;
         default:
            score = 0;
            break;                                                     
      }
      return score;
   }
   
   public static void determineBonus(int len, int wordTotal, String word)
   {
      if(len > 12){wordTotal *= 4;}
      else if (len > 8){wordTotal *= 3;}
      else if (len > 4){wordTotal *= 2;}
      
      System.out.println("Bonus for word " + word + " is: " + wordTotal);
   }
}   
