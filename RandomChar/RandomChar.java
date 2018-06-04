import java.util.Scanner;

public class RandomChar
{
   public static void main(String[] args)
   {
      final int MAX_WORD_LENGTH = 7;
      final int MIN_WORD_LENGTH = 2;
      final int MAX_LINES = 10;
      final int MAX_WORDS_PER_LINE = 15;
      
      System.out.print("    ");
      for(int i = 0; i < MAX_LINES; i++)
      {
         System.out.print(randomCharBetween('A', 'Z'));
         
         for(int j = 0; j < MAX_WORDS_PER_LINE; j++)
         {
            int wordLength = (int)(MIN_WORD_LENGTH + Math.random() * 
                                  (MAX_WORD_LENGTH - MIN_WORD_LENGTH + 1));
            for(int c = 0; c < wordLength; c++)
            {
               System.out.print(randomCharBetween('a', 'z'));
            }
            System.out.print(" ");
         }
         System.out.print("\n");
      }   
   }
   
   public static char randomCharBetween(char ch1, char ch2)
   {
      return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
   }
}