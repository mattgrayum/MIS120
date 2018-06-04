public class Account

{
   private String fName;
   private String lName;
   private int accountNumber; 
   private double balance; 
   
   public Account ()
   {
     this( null, null, 0, 0.0 );
   }
   
   public Account (String fName, String lName, int accountNumber, double balance) //Create an account with all information
   {
     this.fName = fName;
     this.lName = lName;
     this.balance = balance;
     this.accountNumber = accountNumber;
   } 
   
   public Account (String fName, String lName) //Create an account object with only first name and last name
   {
     this.fName = fName;
     this.lName = lName;
     balance = 0.0;
     accountNumber = 0;
   } 

   public String getfName()  //Gets first name
   {
      return fName;
   }

   public void setfName(String fName)  //Sets first name
   {
      this.fName =  fName;
   }
   public String getlName()  //Gets last name
   {
      return lName;
   }

   public void setlName(String lName)  //Sets last name
   {
      this.lName =  lName;
   }

   public int getAccountNumber() //Gets account number
   {
      return accountNumber;
   }

   public void setAccountNumber (int accountNumber) //Sets account number
   {
      this.accountNumber =  accountNumber;
   }

   public double getBalance ()  //Gets balance
   {
      return balance; 
   }
   
   public void setBalance (double balance)  //Sets balance
   {
      this. balance = balance; 
   }
   
   public void deposit (double amount)  //Deposit money in account
   {
      balance = balance + amount; 
   } 
   
   public void withdraw (double amount)  //Withdraws money from account
   {
      balance = balance - amount;
   }
}