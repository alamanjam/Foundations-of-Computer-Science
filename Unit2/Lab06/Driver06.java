	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(false);     //a class method
      
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.setSize(20);
         smidge.drawShape();
         
         SquareTurtle a = new SquareTurtle(100);
         a.setColor(Color.RED);
         a.setThickness(4);
         a.setSize(40);
         a.drawShape();
         
         SquareTurtle b = new SquareTurtle(150,150,45);
         b.setColor(Color.YELLOW);
         b.setThickness(15);
         b.setSize(60);
         b.drawShape();
         
         SquareTurtle c = new SquareTurtle(300,200,135);
         c.setColor(Color.BLACK);
         c.setThickness(10);
         c.setSize(100);
         c.drawShape();
         
         
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
   }