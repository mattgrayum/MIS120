//A program that finds the mean, stndard deviation, and median of a set of numbers  

import java.util.*;

public class MeanAndStdDev
{
   public static void main(String args[])
   {
      
      Double value;
      int counter = 0;
      int totalCount = 0;
      double total = 0;
      double mean = 0;
      double totalOfMeans = 0;
      double sampleMean = 0;
      double median = 0;
      double stdDevNumerator = 0;
      double stdDev = 0;
      final int SET_SIZE = 10;
      final int MAX_SAMPLE_SETS = 500;
      Scanner input = new Scanner(System.in);
      do
      {
         ArrayList<Double> set = new ArrayList<>();
         totalCount++;
         for(int i = 0; i < SET_SIZE; i++)
         {
            value = Math.random() * (Math.random() * 100) * (Math.random() * 100);
            set.add(value);
            total += value;
            counter++;  
         }
         
         mean = total / counter;
         totalOfMeans += mean;
      
         Iterator<Double> iterator = set.iterator(); 
         while (iterator.hasNext()) 
         {
            double nextValue = iterator.next();
            System.out.printf("%6.2f, ", nextValue);
            stdDevNumerator += Math.pow(nextValue - mean, 2); 
         }
         System.out.print("\n\n");
         Collections.sort(set);
         iterator = set.iterator();
         while (iterator.hasNext()) 
         {
            double nextValue = iterator.next();
            System.out.printf("%6.2f, ", nextValue); 
         }
         stdDev = Math.sqrt(stdDevNumerator / (counter - 1));
         
         
         
         //If set size is even, median is the average of the two middle values
         if(SET_SIZE % 2 == 0){median = (set.get((SET_SIZE - 1) / 2) + 
                                        set.get(SET_SIZE / 2)) / 2;} 
         else{median = set.get((SET_SIZE - 1)/ 2);} 
         
         
         System.out.printf("\nMean: %6.2f\n", mean);
         System.out.printf("Standard Deviation: %6.2f\n", stdDev);                                  
         System.out.printf("Median: %6.2f\n", median);
      }while(totalCount < MAX_SAMPLE_SETS);   
      
      sampleMean = totalOfMeans / totalCount;
      System.out.printf("Overall mean: %6.2f", sampleMean);
      
   }
}