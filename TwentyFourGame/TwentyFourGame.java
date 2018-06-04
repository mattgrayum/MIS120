public class TwentyFourGame
{
   public static void main(String[] args)
   {
      int[] arr = {13,13,1,1};
      subTwo(arr);
       
   }
   
   public static int addAll(int[] arr)
   {
      int total = 0;
      for(int i = 0; i < arr.length; i++)
      {
         total += arr[i];
      }   
      return total;   
   }
   
   public static int calcSubOne(int[] arr)
   {
      int total = 0;
      
      for(int i = 0; i < arr.length - 1; i++)
      {
         total += arr[i];
      }  
      
      total -= arr[arr.length - 1];
      return total;
   }
   
   public static int calcSubTwo (int[] arr)
   {
      int total = 0;
      
      for(int i = 0; i < arr.length - 1; i++)
      {
         total -= arr[i];
      }  
      
      total += arr[arr.length - 1];
      return total;
   }

   
   public static void shiftLeft(int[] arr)
   {
      int temp = arr[0];
      
      for(int i = 0; i < arr.length - 1; i++)
      {
         arr[i] = arr[i + 1];
      }
      
      arr[arr.length - 1] = temp;
   }
   
   public static void output(int[] arr, int total, char[] ch)
   {
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " " + ch[i] + " ");
      }
      
      System.out.println(total);
   }
   
   public static void subOne(int[] arr)
   {
      char[] ch = {'+', '+', '-', '='};
      int result = 0;
      
      for(int i = 0; i < arr.length; i++)
      {
         shiftLeft(arr);
         result = calcSubOne(arr);
         if(result == 24)
            output(arr, result, ch);
      }
   }
   
   public static void subTwo(int[] arr)
   {
      char[] ch = {'+', '-', '-', '='};
      int result = 0;
      
      for(int i = 0; i < arr.length; i++)
      {
         shiftLeft(arr);
         result = calcSubTwo(arr);
         if(result == 24)
            output(arr, result, ch);
      }
   }
   
   
}