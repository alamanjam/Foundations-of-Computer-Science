	// Phil Ero 15JUL08
	
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
    public class BumperPanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = Color.WHITE;
      private static final Color BALL_COLOR = Color.BLACK;
      private static final Color PRIZE_COLOR = Color.RED;
      private static final Color BUMPER_COLOR = Color.BLUE;
      private static final double BALL_DIAM = 50;
      private static final double PRIZE_DIAM = 25;
      private static final int BUMPER_X_WIDTH = 75;
      private static final int BUMPER_Y_WIDTH = 125;
   
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Bumper bumper;
      private Bumper bumper2;
      private int hits;
      private int hits2;
      private Timer timer;    
      
       public BumperPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         
         // create ball and jump
      
         ball=new Ball();
        
         ball.jump(FRAME,FRAME);
                   
      
      	bumper=new Bumper(775,300,25,200,Color.RED);
        
         
         bumper2=new Bumper(0,300,25,200,Color.BLUE);
        
         
               

         hits = 0;
         hits2=0;
         timer = new Timer(5, new Listener());
         timer.start();
         addKeyListener(new Key());
         setFocusable(true);

      }
         private class Key extends KeyAdapter
    {
  public void keyPressed(KeyEvent e)
      {
       if(e.getKeyCode() == KeyEvent.VK_UP)
          bumper.setY( bumper.getY()-40 ); 
       if(e.getKeyCode() == KeyEvent.VK_DOWN)
          bumper.setY( bumper.getY()+40 ); 
        if(bumper.getY() >= 625 - bumper.getXWidth())  //hit bottom edge
         {
            bumper.setY(625 - bumper.getXWidth());
            }
            if(bumper.getY() <= 0 )  //hit top edge
         {
            bumper.setY(0);
          
         
     }
      if(e.getKeyCode() == KeyEvent.VK_W)
          bumper2.setY( bumper2.getY()-40); 
       if(e.getKeyCode() == KeyEvent.VK_S)
          bumper2.setY( bumper2.getY()+40 ); 
        if(bumper2.getY() >= 625 - bumper2.getXWidth())  //hit bottom edge
         {
            bumper2.setY(625 - bumper2.getXWidth());
            }
            if(bumper2.getY() <= 0 )  //hit top edge
         {
            bumper2.setY(0);

   }}
   }

       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
      private void restart()
      {
      bumper.setX(775);
      bumper.setY(300);
      bumper2.setX(0);
      bumper2.setY(300);
      ball.setX(400);
      ball.setY(400);
      ball.setdx(Math.random() * 12 - 6);
      ball.setdy(Math.random() * 12 -6);

      timer.stop();
      timer.setInitialDelay(3000);
      

      timer.start();
                 }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           // clear buffer and move ball
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME,FRAME); 
            ball.move(FRAME, FRAME);
            
            // check for collisions
            BumperCollision.collide(bumper, ball);
            BumperCollision.collide(bumper2, ball);
            
            if(ball.getX()>=(800-ball.getRadius()))
            {
            hits++;
            restart();
            }
            if(ball.getX()<=(0+ball.getRadius()))
            {
            hits2++;
            restart();
            }
            
            // draw ball, bumper & prize
            ball.draw(myBuffer);
            bumper.draw(myBuffer);
            bumper2.draw(myBuffer);
            
         	
            
         
            // update hits on buffer
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Player 2: " + hits, FRAME - 200, 25);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Player 1: " + hits2, 50, 25);
            
            if(hits==5)
            {
            myBuffer.setColor(Color.WHITE);
            myBuffer.fillRect(0,0,800,600);
            myBuffer.setColor(Color.BLUE);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 50));

            myBuffer.drawString("Player 1 Wins", 250, 300);
            timer.stop();
            }
             else if(hits2==5)
            {
            myBuffer.setColor(Color.WHITE);
            myBuffer.fillRect(0,0,800,600);
            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 50));
               
            myBuffer.drawString("Player 2 Wins", 250, 300);
            timer.stop();
            }
            
            repaint();
         }
      } 
      
   	// checks to see if the ball & prize collide
   	// if so, increments hits & relocates prize	
             private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
   }
   