	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class TwistyTurtle extends Turtle    {
   private int mySize;
   public TwistyTurtle()
   {
   mySize=400;
   }
   public TwistyTurtle(int n)
   {
   mySize=n;
   }
   public void setSize(int n)
   {
   mySize=n;
   }
   
   public void drawShape()
   {
   if(mySize==400)
   {
   for(int x = 5;x<=mySize;x+=10)
   {
   forward(x);
   turnLeft(123);
   }
}
}
   
  }    