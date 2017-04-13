import java.awt.*;
import javax.swing.*;

public class Vehicle
{
   public double myX;   // x and y coordinates of center
   public double myY;
   public double dx;
   public double myWidth;
   public double myHeight;
   public double shift = 30;
   public int color;
   public int myLevel;
   public boolean direction = true;
     // constructors
   public Vehicle()
   {
      myX = 0;
      myY = 10;
      dx = 1;
      myWidth = 20;
      myHeight = shift - 5;
   }
   public Vehicle(double x, double y, double w, double h, boolean dir, int c, int level)
   {
      myX = x;
      myY = y;
      myLevel = level;
      if(dir==true)
      {
         if(level==2)
         {
            setdx((Math.random()*2)+2);
         }
         if(level==1)
         {
            setdx((Math.random()*1.75)+.5);
         }
         if(level==3)
         {
            setdx((Math.random()*7)+50);
         }
      }
      if(dir==false)
      {
         if(level==2)
         {
            setdx(-1*((Math.random()*3)+2));
         }
         if(level==1)
         {
            setdx(-1*((Math.random()*.4)+.1));
         }
         if(level==3)
         {
            setdx(-1*((Math.random()*4)+3));
         }
      }
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
   public void setLevel(int x)
   {
      myLevel = x;
   }

   public double getLevel()
   {
      return myLevel;
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
         if(myLevel==2)
         {
            setdx((Math.random()*3)+2);
            setColor((int)(Math.random()*6));
         }
         if(myLevel==1)
         {
            setdx((Math.random()*.4)+.1);
            setColor((int)(Math.random()*6));
         }
         if(myLevel==3)
         {
            setdx((Math.random()*4)+3);
            setColor((int)(Math.random()*6));
         } 
      }
      if(direction==false&&getX() <= (0-myWidth))             //hits left edge
      {
         setX(rightEdge);
         if(myLevel==2)
         {
            setdx(-1*((Math.random()*3)+2));
            setColor((int)(Math.random()*6));
         }
         if(myLevel==1)
         {
            setdx(-1*((Math.random()*.4)+.1));
            setColor((int)(Math.random()*6));
         }
         if(myLevel==3)
         {
            setdx(-1*((Math.random()*4)+3));
            setColor((int)(Math.random()*6));
         }
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
