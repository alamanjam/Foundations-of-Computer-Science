import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class TwistyTurtle3 extends Turtle    {
   private int mySize;
   public TwistyTurtle3()
   {
   mySize=150;
   }
   public TwistyTurtle3(int n)
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
   for(int x = 25;x<=mySize;x+=5)
   {
   for(int y=0;y<4;y++)
   {
   forward(x);
   turnLeft(90);
   }
   turnLeft(45);
   }
}
}
}
