

public class Practice_Lecture_14March
{
   public static void main(String[] args)
   {
      //int minNum = 150;
      //int maxNum = 0;
      //int[] arr = new int[10];
      final int OUTSIDE_MAX = 25;
      int
      
      for(int j = 0; j < OUTSIDE_MAX; j++)
      {
         final int COUNT = 10;
         int minNum = 150;
         int maxNum = 0;
         int[] arr = new int[COUNT];
         int total = 0;
         
         for(int i = 0; i < arr.length; i++)
         {
            int topOfRange = (int)(Math.random() * 10000) + 50;
            arr[i] = (int)(Math.random() * topOfRange);
            
            total += arr[i];
            
            if(Math.max(arr[i], maxNum) > maxNum)
               maxNum = arr[i];
               
            if(Math.min(arr[i], minNum) < minNum)
               minNum = arr[i];
         } 
         
         int avg = total / COUNT;
         
         System.out.println("Min = " + minNum + " and Max = " + maxNum + " and Avg = " + avg);
      }         

   }
}