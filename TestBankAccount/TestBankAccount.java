//Grayum

//Assignment 11.3

//May 16, 2017

public class TestBankAccount{

   public static void main(String [] args){
   
      double withdrawlAmount = 0;
      
      SavingsAccount sa = new SavingsAccount(1234567);
      System.out.println("A Savings account has been set up with account #" + sa.getAccountNumber());
      
      sa.setBalance(1000.00);
      System.out.println("The beginning balance is $" + sa.getBalance());
      
      withdrawlAmount = 600;
      sa.withdraw(withdrawlAmount);
      System.out.println("After withdrawing $" + withdrawlAmount + " the balance is $" + sa.getBalance());
      
      System.out.println("Now I will try to withdraw another $" + withdrawlAmount);
      sa.withdraw(withdrawlAmount);
      
      System.out.println("");
      
      CheckingAccount ch = new CheckingAccount(987654);
      System.out.println("A Checking account has been set up with account #" + ch.getAccountNumber());
      
      ch.setBalance(1000.00);
      System.out.println("The beginning balance is $" + ch.getBalance());
      
      withdrawlAmount = 550;
      ch.withdraw(withdrawlAmount);
      System.out.println("After withdrawing $" + withdrawlAmount + " the balance is $" + ch.getBalance());
      
      System.out.println("Now I will try to withdraw another $" + withdrawlAmount);
      ch.withdraw(withdrawlAmount);
      System.out.println("The balance in the Checking account is now $" + ch.getBalance());
      
      withdrawlAmount = 1;
      System.out.println("Now I will try to withdraw $" + withdrawlAmount);
      ch.withdraw(withdrawlAmount);
   }
}

class BankAccount{

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
}

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