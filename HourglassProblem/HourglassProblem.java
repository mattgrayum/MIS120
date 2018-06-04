import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourglassProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int y, x, row, column;
        final int MIN_TOTAL = -63;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = MIN_TOTAL;
        //x and y represent the coordinates of the top left corner of each hourglass
        for(y = 0; y < 4; y++){
           for(x = 0; x < 4; x++){
               int sum = 0;
               for(row = x; row < x + 3; row++){
                   for(column = y; column < y + 3; column++){
                       if(row == x + 1){
                           if(column == y + 1){
                               sum += arr[row][column];
                           }
                       }   
                       else if(row == x || row == x + 2){
                           sum += arr[row][column];    
                       }
                    }
                }
                max = Math.max(sum, max);
            }
         }   
         System.out.println(max);
     }
}     