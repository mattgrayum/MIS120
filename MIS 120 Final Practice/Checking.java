public class Checking extends Account{

   private double overdraftLimit;
   private String accountName;
   
   //Create an account with all information
   public Checking (String fName, String lName, int accountNumber, double balance) 
   {
     setfName(fName);
     setlName(lName);
     setBalance(balance);
     setAccountNumber(accountNumber);
   } 
   
   public String getAccountName(){
      return accountName;
   }
   
   public double getOverdraftLimit(){
      return overdraftLimit;
   }
   
   //Ovriding the witdraw() method
   public void withdraw (double amount)  
   {
      double tempBalance = super.getBalance() - amount;
      if(tempBalance < this.getOverdraftLimit()){
         System.out.println("You cannot withdraw that much!");
      }
      else{
         setBalance(tempBalance);
      }
   }
   
   //Overloading the setAccountNumber method
   public void setAccountNumber (int accountNumber, String acctName) //Sets account number
   {
      setAccountNumber(accountNumber);
      accountName = acctName;
   }
}