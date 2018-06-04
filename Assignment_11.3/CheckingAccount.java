//Grayum

//Assignment 11.3

//May 16, 2017

class CheckingAccount extends BankAccount{
   
   private final double overdraftLimit = -100;
   
   public CheckingAccount(int acctNum){
      setAccountNumber(acctNum);
   }
   
   public void withdraw(double amount){
   
      if(amount <= 0){
         System.out.println("**ENTRY ERROR** --> You must enter a positive value.");
      }
      
      double tempBalance = getBalance() - amount;
      if(tempBalance < overdraftLimit){
         System.out.println("**ERROR** There is not enough money in your account to make that withrawl.");
      }
      else{
         setBalance(tempBalance);
      }
   }
   
   
}