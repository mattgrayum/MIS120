import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneDimensionalArrayGame{
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      boolean stuck;
      int jump;
      int n = 1;
      
      for(int i = 0; i < n; i++){
         stuck = true;
         int size = (int)(Math.random() * 99) + 2;
         do{
            jump = (int)(Math.random() * 101);
         }while(jump > size);   
         System.out.println(size + " " + jump);
         int[] arr = new int[size];
         arr[0] = 0;
         System.out.print(arr[0] + " ");
         for(int j = 1; j < size; j++){
            arr[j] = (int)(Math.random() * 2);
            System.out.print(arr[j] + " ");
         }
         System.out.println("");
         if(jump > size){
            System.out.println("YES");
            stuck = false;
         }
            
         int position = 0;
         while(stuck == true){
            int startPosition = position;
            int maxJumps = (int)(((size - 1) - position)/jump);
            
            if(maxJumps == 0){
               System.out.println("YES");
               stuck = false;
            }
            //Jump as far throught the array as possible first
            for(int p = position + jump; 
               p < size && (arr[p] == 0); p += jump){
               if(arr[p] == 0){
                  position = p;
                  if(p == maxJumps * jump + startPosition){
                     System.out.println("YES");  
                     stuck = false;
                  }   
               } 
            }   
            if(stuck == true){   
               //Then see if you can take a step backward in order to keep jumping
               if(position > 0){
                  if(arr[position + jump - 1] == 0 && arr[position - 1] == 0){
                     position = position + jump -1;
                  }  
               }    
                  //Else see if you can take a step forward in order to keep jumping
               if(position < size - 1){
                  if(arr[position + 1] == 0) position++;
                  //Else you're stuck!
                  else{
                     System.out.println("NO");
                     stuck = false;
                  }
               }    
            }
         }
      }
   }
}