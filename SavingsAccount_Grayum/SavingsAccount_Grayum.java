//Grayum

//MIS 120 Final Exam

//May 16, 2017

public class SavingsAccount_Grayum extends Account{
   
   public SavingsAccount_Grayum(String fname, String lname, int accountNumber, double balance){
   
      super(fname, lname, accountNumber, balance);
      
   }
   
   public SavingsAccount_Grayum(String fname, String lname){
      
      super(fname, lname);
      
   }
   
   public void deposit(double amount){
      if(getAccountNumber() == 0){
         System.out.println("Error: can not dposit money, no Account Number defined");
      }
      else{
         setBalance(getBalance() + amount);
      }
   }
   
   public void withdraw(double amount){
      if(amount >= getBalance()){
         System.out.println("Error: can not withdraw money, overdraft of account");
      }
      else{
         setBalance(getBalance() - amount);
      }
   }
   
   public String toString(){
      return "Name: " + getlName() + " " + getfName() + 
             " Account Number: " + getAccountNumber() + 
             " Balance: " + getBalance();   
   }
   
   public static void main(String[] args){
      
      SavingsAccount_Grayum mySA1 = new SavingsAccount_Grayum("Joe", "Smith", 12345, 200.00);
      System.out.println(mySA1.toString());
      
      SavingsAccount_Grayum mySA2 = new SavingsAccount_Grayum("Molly", "Brown"); 
      System.out.println(mySA2.toString());
      
      mySA1.deposit(50.00);
      System.out.println(mySA1.toString());
      
      mySA2.deposit(100.00);
      System.out.println(mySA2.toString());
      
      mySA1.withdraw(100.00);
      System.out.println(mySA1.toString());
      
      mySA2.withdraw(100.00);
      System.out.println(mySA2.toString());
  
   }
   
}