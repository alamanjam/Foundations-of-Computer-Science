import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public abstract class Character
{
   public double myX;   // x and y coordinates of center
   public double myY;
   public double myWidth; 
   public double myHeight;
   public int FRAME=450;
   public int FRAMEx=400;
   public double shift = 30;
  // constructors
   public Character()     //default constructor
   {
      myX = ((FRAME/2)-15);
      myY = (FRAME-90);
      myWidth = 30;
      myHeight = 30;
   
      
   }
   public Character(double x, double y, double h, double w)
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
   
   public void moveRight()
   {
      setX(getX() + shift );
      if(getX() >= FRAMEx-myWidth )  //hit right edge
      {
         setX(FRAMEx-myWidth);   
      }
   
   }
   public void moveLeft()
   {
      setX(getX() - shift );
      if(getX() <= 0 )  //hit right edge
      {
         setX(0);  
      }
   
   }
   public void moveDown()
   {
      setY(getY()+ shift );
      if(getY() >= FRAME-myHeight)  //hit top edge
      {
         setY(FRAME-myHeight);   
      }
   
   }
   
     //	 instance methods
   public abstract void draw(Graphics myBuffer) ;
  
}