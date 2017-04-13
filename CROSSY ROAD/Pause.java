import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public class Pause
{
   public double myX;   // x and y coordinates of center
   public double myY;
   public double myWidth; 
   public double myHeight;
   public static int p;
   
public Pause()     //default constructor
   {
      myX = 350;
      myY = 5;
      myWidth = 50;
      myHeight = 50;
   
      
   }
   public Pause(double x, double y, double h, double w)
   {
      myX = x;
      myY = y;
      myHeight = h;
      myWidth = w;
   }
 // accessor methods
   public double getX() 
   { 
      return myX;
   }
   public double getY()      
   { 
      return myY;      
   }
   public double getHeight() 
   { 
      return myHeight;
   }
   public double getWidth() 
   { 
      return myWidth;
   }
  // modifier methods
   public void setX(double x)
   {
      myX = x;
   } 
   public void setY(double y)
   {
      myY=y;
   } 
   public void setHeight(double h)
   {
      myHeight = h;
   }
   public void setWidth(double w)
   {
      myWidth = w;
      
   }
    ImageIcon pause = new ImageIcon("pause.png"); 
    ImageIcon play = new ImageIcon("play.png"); 
   public void draw(Graphics myBuffer)
{
if(p==0)
myBuffer.drawImage(pause.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
if(p==1)
myBuffer.drawImage(play.getImage(),(int)(myX),(int)(myY),(int)(myWidth),(int)(myHeight),null);
}
}
