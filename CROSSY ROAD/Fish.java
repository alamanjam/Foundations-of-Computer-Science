import java.awt.*;
import javax.swing.*;
public class Fish extends Character
{
   ImageIcon fish= new ImageIcon("fish.png");
   public Fish()
   {
      super();
   }
   public void draw(Graphics myBuffer)
   {
      myBuffer.drawImage(fish.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
   }
}