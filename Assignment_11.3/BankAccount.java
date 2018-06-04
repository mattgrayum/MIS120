//Grayum

//MIS 120 Exam #3

//April 11, 2017

//Grayum

//Assignment 11.3

//May 16, 2017

public class BankAccount{

   private int accountNumber;
   private double balance;
   
   public BankAccount(){}
   
   public BankAccount(int acctNum){
      accountNumber = acctNum;
   }

   public void setAccountNumber(int acctNum){
      accountNumber = acctNum;
   }

   public int getAccountNumber(){
      return accountNumber;
   }

   public double getBalance(){
      return balance;
   }

   public void setBalance(double bal){
      balance = bal;
   }

   public void deposit(double amount){
      if(amount <= 0){
         System.out.println("**ENTRY ERROR** --> You must enter a positive value.");
      }
      else balance += amount;
   }

   public void withdraw(double amount){
      if(amount <= 0){
         System.out.println("**ENTRY ERROR** --> You must enter a positive value.");
      }
      else balance -= amount;
      
      if(balance < 0){
         System.out.println("**OVERDRAFT WARNING** --> You don't have enough in your account.");
         balance += amount;
      }
   }

   public static void main(String[] args){
   
      BankAccount myAcct = new BankAccount(1234);
      
      myAcct.setBalance(50.00);
      System.out.printf("Account " + myAcct.getAccountNumber() + 
                        " has a balance of %.1f\n", myAcct.getBalance());
                        
      myAcct.deposit(50.00);
      myAcct.withdraw(75.00);
      
      System.out.printf("Account " + myAcct.getAccountNumber() + 
                        " has a balance of %.1f\n", myAcct.getBalance());           
   }
}
