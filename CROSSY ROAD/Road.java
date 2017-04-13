import java.awt.*;
public class Road extends BackObject
{
   private double myX;   // x and y coordinates of center
   private double myY;
   private double myWidth;
   private double myHeight;
   private double shift = 30;
   private final double FRAMEx = 400;
   private int counter=1;
   
     // constructors
   public Road()
   {
      myX = 0;
      myY = 10;
      myWidth = 20;
      myHeight = shift;
   }
   public Road(double x, double y, double w, double h)
   {
      myX = x;
      myY = y;
      myWidth = w;
      myHeight = h;
   }
   public Road(double x, double y)
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
   public int getLanes()
   {
      return (int)(myHeight/shift);
   }
   public void setLanes(int x)
   {
      myHeight = shift*x;
   }
   public void setCounter(int x)
   {
      counter = x;
   }
   public int getCounter()
   {
      return counter;
   }
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(Color.GRAY.darker());
      myBuffer.fillRect((int)myX, (int)myY, (int)FRAMEx, (int)myHeight);
      myBuffer.setColor(Color.YELLOW.darker());
      if(myHeight==shift)
      {
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+myHeight-3), 10, 3);
         }
      
      }
      if(myHeight==shift*2)
      {
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+(myHeight/2)), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+myHeight-3), 10, 3);
         }
      }
      if(myHeight==shift*3)
      {
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+shift), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+(shift*2)), 10, 3);
         }
         for(int x = 0; x<FRAMEx; x+=20)
         {
            myBuffer.fillRect((int)x, (int)(myY+myHeight-3), 10, 3);
         }
      }
   }
}