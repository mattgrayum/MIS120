//Grayum

//Due Date: 4/4/2017

//Chapter 7 Assignment 7.2

import java.util.*;
public class ReverseArray{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int[] arr = new int[10];
      
      System.out.print("Enter 10 space-separated integers: ");
      for(int i = 0; i < arr.length; i++){
         arr[i] = in.nextInt();
      }
      printReverseArray(arr);
   }
   
   public static void printReverseArray(int[] arr){
      for(int i = arr.length - 1; i >=0; i--){
         System.out.print(arr[i] + " ");
      } 
   }
}