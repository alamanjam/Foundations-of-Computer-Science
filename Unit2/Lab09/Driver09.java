	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void twisties(Turtle arg)
      {
      arg.setPenDown(false);
      arg.turnRight((int)(Math.random()*360));
      arg.forward((int)(Math.random()*200));
      arg.setPenDown(true);
      arg.drawShape();
      }

      
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("TwistyTurtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.setCrawl(false);
         
         Turtle.clear(Color.WHITE);
         TwistyTurtle lisa= new TwistyTurtle();
         twisties(lisa);
         TwistyTurtle2 lol= new TwistyTurtle2();
         twisties(lol);
         TwistyTurtle3 lmao= new TwistyTurtle3();
         twisties(lmao);
         }
         
         }
       