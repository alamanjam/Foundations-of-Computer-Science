import java.awt.*;



public class Vehicle
{
   private double myX;   // x and y coordinates of center
   private double myY;
   private double dx;
   private double myWidth;
   private double myHeight;
   private double shift = 30;
     // constructors
   public Vehicle()
   {
      myX = 0;
      myY = 10;
      dx = 1;
      myWidth = 20;
      myHeight = shift - 5;
   }
   public Vehicle(double x, double y, double d, double w, double h)
   {
      myX = x;
      myY = y;
      dx = d;
      myWidth = w;
      myHeight = h;
   }
   public Vehicle(double x, double y)
   {
      myX = x;
      myY = y;
      dx = 2;
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

   public void setdx(double x)
   {
      dx = x;
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
   public double getdx()
   {
      return dx;
   }
   public double getWidth()
   {
      return myWidth;
   }
   public double getHeight()
   {
      return myHeight;
   }
   
    
   public void move(double rightEdge)
   {
      setX(getX()+ dx);                  // move horizontally
      
      if(getX() >= rightEdge)  //hit right edge
      {
         setX(0 - getWidth()); 
      }
      else if(getX() <= 0 )             //hits left edge
      {
         setX(rightEdge);
      }
   }      
   public void draw(Graphics myBuffer) 
   {
   
   
   }
     
}
