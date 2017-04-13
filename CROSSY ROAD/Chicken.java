import java.awt.*;
import javax.swing.*;
public class Chicken extends Character
{
   ImageIcon chicken= new ImageIcon("chicken1.png");
   public Chicken()
   {
      super();
   }
   public void draw(Graphics myBuffer)
   {
      myBuffer.drawImage(chicken.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
   }
}
