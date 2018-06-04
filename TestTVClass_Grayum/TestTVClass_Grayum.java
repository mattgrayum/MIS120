// A.	Create a new instance of TV Class passing it:
// i.	Channel 32, 
// ii.	Volumelevel 10, 
// iii.	true (on)
// B.	Call toString method
// C.	Set channel to channel 55
// D.	Call channelUp method - changing channel
// E.	Set volume to level 33
// F.	Call toString method
// G.	Call volumeUp method - turning volume up
// H.	Call volumeUp method - turning volume up
// I.	Call toString method
// J.	Calling turnOff method
public class TestTVClass_Grayum{
   public static void main(String[] args){
   
      // TV myTV = new TV(32, 10, true);
      TV myTV = new TV();
      myTV.setChannel(32);
      myTV.setVolume(10);
      myTV.turnOn();
      myTV.toString();
      
      myTV.setChannel(55);
      myTV.channelUp();
      myTV.setVolume(33);
      myTV.toString();
      
      myTV.volumeUp();

      myTV.volumeUp();
      myTV.toString();
      
      myTV.turnOff();
      myTV.toString();
      
   }
}
