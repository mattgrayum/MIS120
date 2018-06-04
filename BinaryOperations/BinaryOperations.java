import java.util.*;
public class BinaryOperations{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      BitSet set1 = new BitSet(n);
      BitSet set2 = new BitSet(n);
      int m = in.nextInt();
      
      // for each operation:
       for(int i = 0; i < m; i++){
         String operation = in.next();
         int left = in.nextInt();
         int right = in.nextInt();
         
         if(operation.equals("AND"))
            if(left == 1) set1.and(set2);
            else set2.and(set1);
            
         else if(operation.equals("OR"))
            if(left == 1) set1.or(set2);
            else set2.or(set1);
            
         else if(operation.equals("XOR"))
            if(left == 1) set1.xor(set2);
            else set2.xor(set1); 
            
         else if(operation.equals("FLIP"))
            if(left == 1) set1.flip(right);
            else set2.flip(right); 
              
         else if(operation.equals("SET"))
            if(left == 1) set1.set(right);
            else set2.set(right);  

         System.out.println(set1.cardinality() + " " + set2.cardinality());
      }
   } 
}                