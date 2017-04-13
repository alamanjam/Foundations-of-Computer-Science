	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
       
       Turtle.clear(Color.WHITE);
       Turtle.setCrawl(false);
       FlowerTurtle lisa= new FlowerTurtle(400*Math.random(),100*Math.random(),Color.RED);
       lisa.drawShape();
       FlowerTurtle lol= new FlowerTurtle(400*Math.random(),100*Math.random(),Color.BLUE);
       lol.drawShape();
       FlowerTurtle kappa= new FlowerTurtle(400*Math.random(),100*Math.random(),Color.MAGENTA);
       kappa.drawShape();
       FlowerTurtle lmao= new FlowerTurtle(400*Math.random(),100*Math.random(),Color.YELLOW);
       lmao.drawShape();


      
      }
   }