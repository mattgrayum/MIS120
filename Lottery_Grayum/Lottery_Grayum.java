//Grayum

//Date: 3/9/2017

//MIS 120 Exam 2

import java.util.Scanner;

public class Lottery_Grayum
{
   public static void main(String[] args)
   {
      int lotteryNumber1 = 0;
      int lotteryNumber2 = 0;
      int lotteryNumber3 = 0;
      boolean invalidInput = true;
      
      do
      {
         lotteryNumber1 = (int)(Math.random() * 50);
         lotteryNumber2 = (int)(Math.random() * 50);
         lotteryNumber3 = (int)(Math.random() * 50);
         
         if (lotteryNumber1 != lotteryNumber2)
            if(lotteryNumber1 != lotteryNumber3)
               if(lotteryNumber2 != lotteryNumber3)
                  invalidInput = false;
   
      }while(invalidInput == true);
      
      printNumbers(lotteryNumber1, lotteryNumber2, lotteryNumber3);
   }
   
   public static void printNumbers(int num1, int num2, int num3)
   {
      int[] array = {num1, num2, num3};
      sortAscending(array);
              
      System.out.println("The three lottery numbers are " + 
                         array[0] + ", " + array[1] + ", and " + array[2]);
   }
   
   public static int[] sortAscending(int[] arr)
   {
      int i, outer, temp;
	   boolean swap = true;
      
	   for(outer = arr.length; outer > 0 && swap == true; outer--)
      {
		   swap = false;
   		for(i = 0; i < outer - 1; i++)
         {
   			if(arr[i] > arr[i + 1])
            {
   				temp = arr[i];
   				arr[i] = arr[i+1];
   				arr[i + 1] = temp;
   				swap = true;
            }
         }
      } 
      return arr;
   }
}