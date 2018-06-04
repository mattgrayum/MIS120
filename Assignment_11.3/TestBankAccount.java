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