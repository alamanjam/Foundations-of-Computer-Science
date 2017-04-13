// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all doubles, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 private int myX;
    private int myXWidth;
    private int myYWidth;
    private int myY;
    private Color myColor;
   
   
     //constructors
       public Bumper()         //default constructor
      {
       
       myX=200;
       myY=200;
       myXWidth=100;
       myYWidth=200;
       myColor=Color.BLUE;
      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
      myX=x;
      myY=y;
      myXWidth=xWidth;
       myYWidth=yWidth;
       myColor=c;
      
      }
      
     // accessor methods  (one for each field)
     public int getX() 
      { 
         return myX;
      }
      public int getY()      
      { 
         return myY;      
         }
         public int getXWidth() 
      { 
         return myXWidth;
      }
      public int getYWidth()      
      { 
         return myYWidth;      
         }
     public Color getColor() 
      { 
         return myColor;
               }



   
     // modifier methods  (one for each field)
     public void setColor(Color c)
     {
     myColor=c;
     }
     
     public void setX(int x)
     {
     myX=x;
     }
     public void setXWidth(int xWidth)
     {
     myXWidth=xWidth;
     }
      public void setY(int y)
     {
     myY=y;
     }
      public void setYWidth(int yWidth)
     {
     myYWidth=yWidth;
     }

     
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
         double myXX=(double)myX;
         double myYY=(double)myY;
         // moves location to random (x, y) within the edges
         myXX = ((Math.random()* (rightEdge)));
         myYY = ((Math.random()* (bottomEdge)));

      
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getYWidth(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every podouble on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
