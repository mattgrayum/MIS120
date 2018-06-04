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