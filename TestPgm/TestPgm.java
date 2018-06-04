public class TestPgm{
   public static void main (String[] args){
      int inx = 3;
      Integer myInt = new Integer(4);
      System.out.println(inx);
      System.out.println(myInt.MIN_VALUE);
      testMethod(inx, myInt);
   }
   public static void testMethod( int num1, Integer num2){
      System.out.println(" " + num1);
      System.out.println("+" + num2);
      System.out.println("---");
      
      System.out.println(" " + (num1 + num2));
   }
}
