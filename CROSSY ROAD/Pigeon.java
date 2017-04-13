import java.awt.*;
import javax.swing.*;
public class Pigeon extends Character
{
   ImageIcon pigeon= new ImageIcon("pigeon.png");
   public Pigeon()
   {
      super();
   }
   public void draw(Graphics myBuffer)
   {
      myBuffer.drawImage(pigeon.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
   }
}