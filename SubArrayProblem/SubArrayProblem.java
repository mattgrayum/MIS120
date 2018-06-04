import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArrayProblem {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      int countOfNegatives = 0;
      
      //populate array
      for(int i = 0; i < n; i++){
         arr[i] = in.nextInt();
      }
      
      int m = 1;
      for(int i = 0; i < n; i++){
         for(int j = n; j >= m; j--){
            int[] subArr = Arrays.copyOfRange(arr, i, j);
            int sum = 0;
            for(int inx = 0; inx < subArr.length; inx++){
               sum += subArr[inx];
            }
            if(sum < 0){
               countOfNegatives++;
            }
         }
         m++;
      }
      System.out.println(countOfNegatives);      
   }
}