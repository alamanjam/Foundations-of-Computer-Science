import java.awt.*;
import javax.swing.*;

public class VehicleC
{
   public double myX;   // x and y coordinates of center
   public double myY;
   public double dx;
   public double myWidth;
   public double myHeight;
   public double shift = 30;
   public int color;
   public boolean direction = true;
     // constructors
   public VehicleC()
   {
      myX = 0;
      myY = 10;
      dx = 1;
      myWidth = 20;
      myHeight = shift - 5;
   }
   public VehicleC(double x, double y, double w, double h, boolean dir, int c, double mydx)
   {
      myX = x;
      myY = y;
      dx = mydx;
      myWidth = w;
      myHeight = h;
      direction = dir;
      color = c;
     
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
   public int getColor()
   {
   return color;
   }
   public void setColor(int x)
   {
   color = x;
   }
    
   public void move(double rightEdge)
   {
      setX(getX()+ getdx());                  // move horizontally
      
      if(direction==true&&getX() >= rightEdge)  //hit right edge
      {
         setX(0 - getWidth()); 
         setColor((int)(Math.random()*6));
      }
      if(direction==false&&getX() <= (0-myWidth))             //hits left edge
      {
         setX(rightEdge);
         setColor((int)(Math.random()*6));
      }
   }      
   public void draw(Graphics myBuffer) 
   {
      ImageIcon thomas;
      switch(color)
      {
         case 0:
            if(direction == true)
            {
               thomas = new ImageIcon("bluecarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("bluecarL.jpg");
            }
            break;
         case 1:
            if(direction == true)
            {
               thomas = new ImageIcon("redcarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("redcarL.jpg");
            }
            break;
         case 2:
            if(direction == true)
            {
               thomas = new ImageIcon("greencarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("greencarL.jpg");
            }
            break;
         case 3:
            if(direction == true)
            {
               thomas = new ImageIcon("pinkcarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("pinkcarL.jpg");
            }
            break;
         case 4:
            if(direction == true)
            {
               thomas = new ImageIcon("tealcarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("tealcarL.jpg");
            }
            break;
         case 5:
            if(direction == true)
            {
               thomas = new ImageIcon("policecarR.jpg");
            }
            else
            {
               thomas = new ImageIcon("policecarL.jpg");
            }break;
         default:
            thomas = new ImageIcon("policecarL.jpg");
            break;    
      }
      
      myBuffer.drawImage(thomas.getImage(), (int)myX, (int)myY, (int)myWidth, (int)myHeight, null);
   }
     
}
