	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {  
   
      
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
         super.setColor(myColor);
         for(int x=0;x<30;x++)
         {
         forward(mySize);
         back(mySize);
         turnLeft(360/30);
      
      }
      turnRight(180);
      forward(mySize);
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
       super.setColor(Color.GREEN);
       forward((1.5)*mySize);
       turnRight(180);
       forward(.25*mySize);
       turnRight(45);
       forward(mySize);
       back(mySize);
       turnLeft(90);
       forward(.5*mySize);
       back(.5*mySize);
       turnLeft(135);
       forward(.5*mySize);
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }