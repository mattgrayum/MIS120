//Grayum

//Exam 4

//May 4 2017

public class TestEmployeeClass_Grayum{
   public static void main(String[] args){
      
      Employee myEmp1 = new Employee(1234, "123456789", "Joe", "Smith",
                                    'm', "123 Elm Street", "Consultant");
      System.out.println(myEmp1.toString());  
      
      myEmp1.setEmpType("Contractor");
      myEmp1.addYrsExperience(2);
      System.out.println(myEmp1.toString()); 
      
      Employee myEmp2 = new Employee(2345, "111111111", "Mary", "Jones",
                                     'f', "123 Oak Street", "Consultant");
      System.out.println(myEmp2.toString()); 
      
      myEmp2.setEmpType("Manager");
      System.out.println(myEmp2.toString()); 
      
      myEmp2.addYrsExperience(6);
      System.out.println(myEmp2.toString());
      
      System.out.println(""); 
      
      if(myEmp1.getYrsExperience() > myEmp2.getYrsExperience()){
         System.out.println(myEmp1.getfName() + " " + myEmp1.getlName());
      }
      else System.out.println(myEmp2.getfName() + " " + myEmp2.getlName());
                                                              
   }
}