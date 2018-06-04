

public class Test
{
   public static void main(String[] args)
   {
      System.out.printf("|%15s|", centered("Number", 15));
   }
   
   public static String centered(String str, int spaces)
   {
      String left = "";
      String right = "";
      int padLeft = ((spaces - str.length()) / 2);
      int padRight = (spaces - str.length() - padLeft);
      
      for(int i = 0; i < padLeft; i++)
      {
         left += " ";
      }
      for(int i = 0; i < padRight; i++)
      {
         right += " ";
      }

      return left + str + right;
   }  
}