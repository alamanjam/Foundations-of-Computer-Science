import java.awt.*;
public class BackObject
{
   private double myX;   // x and y coordinates of center
   private double myY;
   private double myWidth;
   private double myHeight;
   private double shift = 30;
     // constructors
   public BackObject()
   {
      myX = 0;
      myY = 10;
      myWidth = 20;
      myHeight = shift - 5;
   }
   public BackObject(double x, double y, double d, double w, double h)
   {
      myX = x;
      myY = y;
      myWidth = w;
      myHeight = h;
   }
   public BackObject(double x, double y)
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
   
   
   }
}
