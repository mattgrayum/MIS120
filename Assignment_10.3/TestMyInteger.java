//Grayum

//MIS 120 - Assignment 10.3

//May 4, 2017

class MyInteger {

   private int value;
   
   MyInteger (int val){
      value = val;
   }
   
   public int getValue(){
      return value;
   }
   
   public boolean isEven(){
      if (this.getValue() % 2 == 0) return true;
      else return false;
   }
   
   public boolean isOdd(){
      if (this.getValue() % 2 == 0) return false;
      else return true;
   }
   
   public boolean isPrime(){
      for(int i = 2; i < this.getValue(); i++){
         if (this.getValue() % i == 0)return false;
      }
      return true; 
   }
   
   public static boolean isEven(int val){
      if (val % 2 == 0) return true;
      else return false;
   }
   
   public static boolean isOdd(int val){
      if (val % 2 == 0) return false;
      else return true;
   }
   
   public static boolean isPrime(int val){
      for(int i = 2; i < val; i++){
         if (val % i == 0) return false;
      }
      return true; 
   }
   
   public static boolean isEven(MyInteger val){
      if (val.getValue() % 2 == 0) return true;
      else return false;
   }
   
   public static boolean isOdd(MyInteger val){
      if (val.getValue() % 2 == 0) return false;
      else return true;
   }
   
   public static boolean isPrime(MyInteger val){
      for(int i = 2; i < val.getValue(); i++){
         if (val.getValue() % i == 0) return false;
      }
      return true; 
   }
   
   public boolean equals(int val){
      if (this.getValue() == val) return true;
      else return false;
   }
   
   public boolean equals(MyInteger val){
      if(this.getValue() == val.getValue()) return true;
      else return false;
   }
}

public class TestMyInteger{

   public static void main(String[] args){

      for(int i = 27, j = 27; i < 30; i++, j--){
         System.out.println("\n                                    *************");
         System.out.println("                                    ** TEST #" + (i - 26) + " **");
         System.out.println("                                    *************");
         
         //Testing the MyInteger instance methods
         System.out.println("\n     TESTING THE MyInteger INSTANCE METHODS:");
         
         MyInteger val = new MyInteger(i); 
         
         System.out.println( "\nval = " + val.getValue() );
         
         if(val.isEven()){
            System.out.println(val.getValue() + " is an even number");
         }
         if(val.isOdd()){
             System.out.println(val.getValue() + " is an odd number");
         } 
         if(val.isPrime()){
             System.out.println(val.getValue() + " is a Prime number\n");
         }

         //Testing the static MyInteger methods that take an integer as an argument
         System.out.println("\n     TESTING THE MyInteger STATIC METHODS THAT TAKE AN INT AS AN ARGUMENT:");
         
         int intValue = j;
         
         System.out.println("\nintValue = " + intValue);
         
         if(MyInteger.isEven(intValue)){
            System.out.println(intValue + " is an even number");
         }
         if(MyInteger.isOdd(intValue)){
             System.out.println(intValue + " is an odd number");
         } 
         if(MyInteger.isPrime(intValue)){
             System.out.println(intValue + " is a Prime number");
         }
         
         
         //Testing the equals method that takes an integer as an argument
         System.out.println("\n     TESTING THE MyInteger.equals() METHOD THAT TAKES AN INT AS AN ARGUMENT:\n");
         
         if (val.equals(intValue)){
            System.out.println(val.getValue() + " is equal to " + intValue);
         }
         else System.out.println(val.getValue() + " is NOT equal to " + intValue);
         
         
         //Testing the MyInteger methods that take a MyInteger object as an argument
         System.out.println("\n     TESTING THE MyInteger STATIC METHODS THAT TAKE A MyInteger OBJECT AS AN ARGUMENT:");
         
         MyInteger val2 = new MyInteger(intValue);
         System.out.println("\nA MyInteger object called val2 has now been created that holds the value " + intValue);
         
         System.out.println("\nval2 = " + val2.getValue());
         
         if(MyInteger.isEven(val2)){
            System.out.println(intValue + " is an even number");
         }
         if(MyInteger.isOdd(val2)){
             System.out.println(intValue + " is an odd number");
         } 
         if(MyInteger.isPrime(val2)){
             System.out.println(intValue + " is a Prime number");
         }
         
         
         //Testing the equals method that takes a MyInteger object as an argument
         System.out.println("\n     TESTING THE MyInteger.equals() METHOD THAT TAKES A MyInteger OBJECT AS AN ARGUMENT:\n");
         if(val.equals(val2)){
            System.out.println(val.getValue() + " is equal to " + val2.getValue());
         }   
         else System.out.println(val.getValue() + " is NOT equal to " + val2.getValue());
      } 
      
      System.out.println("\n                                    **************");
      System.out.println("                                    ** END TEST **");
      System.out.println("                                    **************");  
   }
}   
   
   
   