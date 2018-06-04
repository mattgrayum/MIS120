import java.util.Scanner; //Scanner is in the java.util package

public class Dinner
{
   public static void main(String[] args)
   {
      Turkey myTurkey = new Turkey();
      myTurkey.setlbs( 25 );
      myTurkey.setTemp( 325 );
      myTurkey.makeReady( true );
      
      Potato myPotato = new Potato();
      myPotato.setMashed( true );
      myPotato.setLbs( 10 );
      myPotato.makeReady( true );
      
      Peas myPeas = new Peas();
      myPeas.setType( "Snow Peas" );
      myPeas.setLbs( 1 );
      myPeas.makeReady( true );
      
      if (myTurkey.getReady() && myPotato.getReady() && myPeas.getReady() )
      {
          System.out.println( "Dinner is Served" );
          System.out.println( "We will have a " + myTurkey.getLbs() + " pound turkey, served at "+ myTurkey.getTemp() + " degrees" );
      
      }
   }   
}   

class Turkey
{

     private int temp;
     private int lbs;
     private boolean isReady;
     
     public void makeReady ( boolean ready )
     {
         isReady = ready;
     }
     public void setlbs( int turkeySize )
     {
         lbs = turkeySize;
     }
     public void setTemp( int turkeyTemp )
     {
         temp = turkeyTemp;
     }
     public int getTemp()
     {
         return temp;
     }
     public int getLbs()
     {
         return lbs;
     }
     public boolean getReady()
     {
         return isReady;
     }

}
class Potato
{
     private boolean mashed;
     private int lbs;
     private boolean isReady;
     
     public void makeReady ( boolean ready )
     {
         isReady = ready;
     }
     public void setLbs( int potatoSize )
     {
         lbs = potatoSize;
     }
     public void setMashed ( boolean isMashed )
     {
          mashed = isMashed;
     }
     
     public int getLbs()
     {
         return lbs;
     }
     public boolean getReady()
     {
         return isReady;
     }

}

class Peas
{

     private String type;
     private int lbs;
     private boolean isReady;
     
     public void makeReady ( boolean ready )
     {
         isReady = ready;
     }
     public void setLbs( int peaSize )
     {
         lbs = peaSize;
     }
     public void setType ( String peaType )
     {
          type = peaType;
     }
     
     public int getLbs()
     {
         return lbs;
     }
     
     public String getType()
     {
         return type;
     }
      public boolean getReady()
     {
         return isReady;
     }

}