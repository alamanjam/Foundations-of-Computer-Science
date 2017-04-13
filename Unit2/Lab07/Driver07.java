	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         PolygonTurtle lmao = new PolygonTurtle();
         lmao.drawShape();
         
         PolygonTurtle lol = new PolygonTurtle(400,300,90,150,4);
         lol.drawShape();
         
         PolygonTurtle gottem = new PolygonTurtle(200,200,90,150,5);
         gottem.drawShape();
         
         PolygonTurtle red = new PolygonTurtle(300,350,90,125,7);
         red.drawShape();
         
         PolygonTurtle blue = new PolygonTurtle(400,200,90,100,8);
         blue.drawShape();
         
         PolygonTurtle yellow = new PolygonTurtle(300,400,90,50,10);
         yellow.drawShape();

         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
   }