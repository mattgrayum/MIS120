//Grayum

//Assignment 11.3

//May 16, 2017

class SavingsAccount extends BankAccount{

   private double interestRate;
   
   public SavingsAccount(int a){
      setAccountNumber(a);
   } 
   
   public void withdraw(double amount){
      if(amount <= 0){
         System.out.println("**ENTRY ERROR** --> You must enter a positive value.");
      }
      double tempBalance = getBalance() - amount;
      if(tempBalance < 0){
         System.out.println("**ERROR** You do not have that much money in your account.");
      }
      else{
         setBalance(tempBalance);
      }
   }
}