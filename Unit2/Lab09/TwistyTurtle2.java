import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class TwistyTurtle2 extends Turtle   
    {
   private int mySize;
   public TwistyTurtle2()
   {
   mySize=150;
   }
   public TwistyTurtle2(int n)
   {
   mySize=n;
   }
   public void setSize(int n)
   {
   mySize=n;
   }
   
   public void drawShape()
   {
   if(mySize==150)
   {
   for(int x = 5;x<=mySize;x+=2)
   {
   forward(x);
   turnLeft(30);
   }
}
   
  }    }