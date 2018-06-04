

public class TV 
{
  int channel = 1; // Default channel is 1
  int volumeLevel = 1; // Default volume level is 1
  boolean on = false; // By default TV is off
  
  public TV() //Default Constructor, Creates an object but does not initialize anything
  {
  }
  
  public void turnOn() 
  {
    on = true;
    System.out.println( "Turning TV On" );
  }
  
  public void turnOff() 
  {
    on = false;
    System.out.println( "Turning TV Off" );
  }
  
  public void setChannel(int newChannel) 
  {
    if (on == true && newChannel >= 1 && newChannel <= 120) //Make sure TV is on and channel between 1 and 120
    {
      channel = newChannel;
      System.out.println( "Set Channel to: " + channel );
    }
  }
  
  public void setVolume(int newVolumeLevel) 
  {
    if (on == true && newVolumeLevel >= 1 && newVolumeLevel <= 7) //Make sure TV is on and volume between 1 and 7
    {
      volumeLevel = newVolumeLevel;
      System.out.println( "Set Volume to: " + volumeLevel );
    }
  }
  
  public void channelUp() 
  {
    if (on == true && channel < 120) //Make sure TV is on and channel is less than 120
    {                                //In other words, don't change the channel up if the TV is not on and the channel is at its max
      channel++;
      System.out.println( "Turned Channel Up by 1: " + channel );
    }
  }
  
  public void channelDown() 
  {
    if (on == true && channel > 1) //Make sure TV is on and channel is greater than 1
    {                              //In other words, don't change the channel up if the TV is not on and the channel is at its minimum
      channel--;
      System.out.println( "Turned Channel Down by 1: " + channel );
    }
  }
  
  public void volumeUp() 
  {
    if (on == true && volumeLevel < 7) //Make sure TV is on and volume is less than 7
    {                                  //In other words, don't change the volume up if the TV is not on and the volume is at its max
      volumeLevel++;
      System.out.println( "Turned Volume Up by 1: " + volumeLevel );
    }
  }
  
  public void volumeDown()
  {                       
    if (on && volumeLevel > 1) //Make sure TV is on and volume is greater than 1
    {                          //In other words, don't change the volume down if the TV is not on and the channel is at its minimum
      volumeLevel--;
      System.out.println( "Turned Down Up by 1: " + volumeLevel );
    }
  }
  
  public static void main(String[] args)
  {
    System.out.println( "Begin testing TV Class" );
       
    TV myTV = new TV(); //Creating a new instance of TV Class
       
    myTV.turnOn();    //Calling turnOn method
    myTV.channelUp(); //Calling channelUp method - changing channel
    myTV.volumeUp();  //Calling volumeUp method - turning volume up
    myTV.volumeUp();  //Calling volumeUp method - turning volume up
    myTV.turnOff();   //Calling turnOff method

  }

}