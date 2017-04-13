import java.awt.*;
public class House extends BackObject
{
   private double myX;   // x and y coordinates of center
   private double myY;
   private double myWidth;
   private double myHeight;
   private double shift = 30;
   private final double FRAME = 400;
     // constructors
   public House()
   {
      myX = 0;
      myY = 10;
      myWidth = 20;
      myHeight = shift;
   }
   public House(double x, double y, double w, double h)
   {
      myX = x;
      myY = y;
      myWidth = w;
      myHeight = h;
   }
   public House(double x, double y)
   {
      myX = x;
      myY = y;
      myWidth = 20;
      myHeight = shift - 5;
   }
   public void setX(double x)
   {
      myX = x;
   }
   public void setY(double x)
   {
      myY = x;
   }
   public void setWidth(double x)
   {
      myWidth = x;
   }

   public void setHeight(double x)
   {
      myHeight = x;
   }

   public double getX()
   {
      return myX;
   }
   public double getY()
   {
      return myY;
   }
   public double getWidth()
   {
      return myWidth;
   }
   public double getHeight()
   {
      return myHeight;
   }
   public void draw(Graphics myBuffer) 
   {
      Color brown = new Color(130, 102, 65);
      Color window = new Color(160, 209, 229);
      Color door = new Color(96, 68, 29);
   
      myBuffer.setColor(brown);
      myBuffer.fillRect((int)myX, (int)(myY+(myHeight*(1.0/3.0))), (int)myWidth, (int)(myHeight*(2.0/3.0)));//main body of the house
      int xPoints[] = {(int)myX, (int)(myX+(0.5*myWidth)), (int)(myX+myWidth)};
      int yPoints[] = {(int)(myY+10), (int)(myY), (int)(myY+10)};
      myBuffer.fillPolygon(xPoints, yPoints, 3);
   
      myBuffer.setColor(door);
      myBuffer.fillRect((int)(myX+((myWidth/2.0)-3)), (int)(myY+(myHeight*(2.0/3.0))), 6, 10);//door of the house
   
      myBuffer.setColor(window);
      myBuffer.fillRect((int)myX+3, (int)myY+15, 5, 5);
      myBuffer.fillRect((int)(myX+(myWidth-8)), (int)myY+15, 5, 5);
   
   }
}