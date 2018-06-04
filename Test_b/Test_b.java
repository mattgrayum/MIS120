public class Test_b
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4,5,1,2,3,4,5};
      
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + " | ");
         arr[i] = Math.abs(6 - arr[i]);
         System.out.print(arr[i] + "\n");
      }
   }
}