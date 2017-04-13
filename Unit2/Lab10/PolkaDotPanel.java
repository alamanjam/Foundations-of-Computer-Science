   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PolkaDotPanel extends JPanel
   {
   //constants
      private static final int FRAME = 400;   
      private static final Color BACKGROUND = new Color(204, 204, 204);
   //fields
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Timer t;
      private Polkadot pd;
      private Polkadot pd2;
      private int xPos, yPos;
       public PolkaDotPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
         pd = new Polkadot();
         t = new Timer(1000, new Listener());
         t.start();
            addMouseListener(new Mouse());
}
  private class Mouse extends MouseAdapter
  {
    public void mousePressed( MouseEvent e )
    {
      pd.setX( e.getX() );
      pd.setY( e.getY() );
    }  }

      
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
            pd.jump(FRAME, FRAME);
                       pd.draw(myBuffer);
          
            
            repaint();
         }
      }
   }