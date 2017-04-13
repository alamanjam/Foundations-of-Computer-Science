import java.awt.*;
import javax.swing.*;
public class Karel extends Character
{
   ImageIcon karel= new ImageIcon("karel.png");
   public Karel()
   {
      super();
   }
   public void draw(Graphics myBuffer)
   {
      myBuffer.drawImage(karel.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
   }
}