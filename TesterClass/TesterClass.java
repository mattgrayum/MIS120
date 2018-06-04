public class TesterClass
{

   public static void main (String [] args )
   {
   
       CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject( 32.32, "blue" , true );
       
       System.out.println ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   
       circle1.printCircle();
       
       System.out.println ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       
       System.out.println ( circle1.toString() );
       
       circle1.setColor( "orange" );
       
       System.out.println ( circle1.toString() );
       
       System.out.println ( circle1.getClass() );

       
       Object myList[] = new Object[3];

       
       myList[0] = new CircleFromSimpleGeometricObject( 45.32, "blue" , true );
       myList[1] = new CircleFromSimpleGeometricObject( 33.32, "yello" , false );
       myList[2] = new CircleFromSimpleGeometricObject( 3.32, "purple" , true );
       
       for (int i=0; i < myList.length; i++ )
       {
          System.out.println( "^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          ((CircleFromSimpleGeometricObject)myList[i]).printCircle();
       }
       
   
   }


}