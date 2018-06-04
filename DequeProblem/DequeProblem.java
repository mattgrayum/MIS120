
/*In this problem, you are given N integers. You need to find the maximum number of 
unique integers among all the possible contiguous subarrays of size M.
Note: Time limit is 3 second for this problem.

Input Format
The first line of input contains two integers N and M: representing the total number 
of integers and the size of the subarray, respectively. The next line contains N space separated integers.

Constraints
1 <= N <= 100000
1 <= M <= 100000
M <= N

The numbers in the array will range between [0, 10000000].

Output Format
Print the maximum number of unique integers among all possible contiguous subarrays of size M.
*/

 import java.util.*;
 
 public class DequeProblem {
     public static void main(String[] args) {
         double time = System.currentTimeMillis();
         Scanner in = new Scanner(System.in);
         Deque<Integer> deque = new ArrayDeque<Integer>();
         int[] arr = new int[10000001];
        
         long n = 6;
         long m = 3;
         long count = 0;
         long max = 0;

         for (long i = 0; i < n; i++) {
            if(i >= m){
               int temp = deque.removeFirst();
               if(arr[temp] > 0){
                  arr[temp]--;
                  if(arr[temp] == 0){
                     count--;
                  }
               }
            }
            int num = (int)(Math.random() * 10);
            if(arr[num] == 0){
               count++;
               max = Math.max(max, count);
            }
            arr[num]++;
            deque.add(num);
            //System.out.println(deque);
         } 
         System.out.println("Max number of unique values per set were: " + max);
         System.out.println(((System.currentTimeMillis() - time) / 1000) + " seconds");
         
         
     }
     
 }