   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = Color.WHITE;
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Pigeon pd;
   
   private Timer t; 
   private int hits=0;
		//constructor   
   public PrizePanel()
   {
     
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      setOpaque(false);
      int xPos = (int)(Math.random()*(FRAME-100) + 50);
      int yPos = (int)(Math.random()*(FRAME-100)+ 50);
      ball = new Ball(xPos, yPos, 50,Color.BLACK);
      pd=new Pigeon();
    
      t = new Timer(5, new Listener());
      t.start();
      addKeyListener(new Key());
      setFocusable(true);
    
         
   }
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode() == KeyEvent.VK_RIGHT)
         {
            pd.moveRight();
         }
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
         {
            pd.moveLeft();
         }
         if(e.getKeyCode() == KeyEvent.VK_UP)
         {
            pd.moveUp();          
         }
      }
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         ball.move(FRAME, FRAME);
         collide(ball, pd);
         ball.draw(myBuffer);
         pd.draw(myBuffer);
             
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
         repaint();
      }
   }   
   private void collide(Ball ball, Character pd)
   {
            
      double d = distance(ball.getX(),ball.getY(),pd.getX(),pd.getY());  
      if(d<=(ball.getRadius()+pd.getWidth()))
      {
         hits++;
      
        
      }
   }
   private double distance(double x1, double y1, double x2, double y2)
   {
               
      return   (Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2) ))));
   
   }}