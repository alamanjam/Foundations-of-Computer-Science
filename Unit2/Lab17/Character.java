import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public class Character
{
   private double myX;   // x and y coordinates of center
   private double myY;
   private double myWidth; 
   private double myHeight;
   private int FRAME=400;
   private double shift = 30;
  // constructors
   public Character()     //default constructor
   {
      myX = 200;
      myY = 200;
      myWidth = 16;
      myHeight = 16;
   
      
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
   public void moveUp()
   {
      setY(getY()- shift );
      if(getY() <= 0 )  //hit top edge
      {
         setY(0);
          
         
      }
   
   }
   public void moveRight()
   {
      setX(getX() + shift );
      if(getX() >= FRAME-myWidth )  //hit right edge
      {
         setX(FRAME-myWidth);
          
         
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
   
     //	 instance methods
   public void draw(Graphics myBuffer) 
   {
        
      ImageIcon tj= new ImageIcon("tj.jpg");
      myBuffer.drawImage(tj.getImage(),(int)(myX),(int)(myY),(int)getWidth(),(int)getHeight(),null);  
   }
}