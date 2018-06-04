import java.util.*;
public class TestCheckingAccount{
   public static void main(String[] args){
      
      Checking myAcct = new Checking("Matt", "Grayum", 123456, 1000);
      
      System.out.println("Account #: " + myAcct.getAccountNumber());
      System.out.println("Balance: " + myAcct.getBalance());
      
      myAcct.withdraw(400);
      System.out.println("Balance: " + myAcct.getBalance());
      
      myAcct.withdraw(800);
      System.out.println("Balance: " + myAcct.getBalance());
      
      myAcct.setAccountNumber(9999, "MyAccountName");
      System.out.println("New Account Number: " + myAcct.getAccountNumber() + 
                         " Account Name: " + myAcct.getAccountName());
      
   }
}