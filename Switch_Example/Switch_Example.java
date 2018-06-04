public class Switch_Example
{
   public static void main(String[] args)
   {
      int inx = 9;
      
      switch(inx)
      {
         default: System.out.println("Number not found");
              
         case 1: System.out.println("One");
                 break;
         case 2: System.out.println("Two");
         case 3: System.out.println("Three");
                 break;
         case 4: System.out.println("Four");
                 break;
         case 5: System.out.println("Five");
                 break; 
                                                
      }
   }
}