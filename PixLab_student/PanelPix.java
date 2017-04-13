//
//name:        date:
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
public class PanelPix extends JPanel
{
   public JTextField red;
   public int redv;
   public DisplayPix display;

  public ScoreboardPix scoreboard;

   public PanelPix()
   {
      setLayout(new BorderLayout());
   //
   // north
   //
      scoreboard = new ScoreboardPix();
      add(scoreboard,BorderLayout.NORTH);
   //
   // east
   //
      JPanel east = new JPanel();
      east.setLayout(new GridLayout(18,1));
   /******************************************************************  1 */
      JButton zero = new JButton("Zero Blue");
      zero.addActionListener(new Listener_zeroBlue());
      east.add(zero);
   /******************************************************************  2 */
      JButton negate = new JButton("Negate");
      negate.setEnabled(false);
      east.add(negate);
   /******************************************************************  3 */
      JButton gray = new JButton("Grayscale");
      gray.addActionListener(new Listener_gray());
      gray.setEnabled(true);
      east.add(gray);
   /******************************************************************  4 */
      JButton sepia = new JButton("Sepia Tone");
      sepia.addActionListener(new Listener_sepia());
      sepia.setEnabled(true);
      east.add(sepia);
   /******************************************************************  5 */
      JButton blur = new JButton("Blur");
      blur.setEnabled(false);
      east.add(blur);			
   /******************************************************************  6 */
      JButton posterize = new JButton("Posterize");
      posterize.setEnabled(false);
      east.add(posterize);			
   /******************************************************************  7 */
      JButton splash = new JButton("Color Splash");
      splash.addActionListener(new Listener_splash());
   
      splash.setEnabled(true);
      east.add(splash);					
   /******************************************************************  8 */
      JButton mirrorLR = new JButton("Mirror Left-Right");
      mirrorLR.addActionListener(new Listener_mirrorLR());
      mirrorLR.setEnabled(true);
      east.add(mirrorLR);			
   /******************************************************************  9 */
      JButton mirrorUD = new JButton("Mirror Up-Down");
      mirrorUD.addActionListener(new Listener_mirrorUD());
      mirrorUD.setEnabled(true);
      east.add(mirrorUD);
   /****************************************************************** 10 */
      JButton flipLR = new JButton("Flip Left-Right");
      flipLR.setEnabled(false);
      east.add(flipLR);
   /****************************************************************** 11 */
      JButton flipUD = new JButton("Flip Up-Down");
      flipUD.setEnabled(false);
      east.add(flipUD);			
   /****************************************************************** 12 */
      JButton pixelate = new JButton("Pixelate");
      pixelate.addActionListener(new Listener_pixel());
      pixelate.setEnabled(true);
      east.add(pixelate);			
   /****************************************************************** 13 */
      JButton sunsetize = new JButton("Sunsetize");
      sunsetize.addActionListener(new Listener_sun());
      sunsetize.setEnabled(true);
      east.add(sunsetize);	
   /****************************************************************** 14 */
      JButton redeye = new JButton("Remove Red-Eye");
      redeye.setEnabled(false);
      east.add(redeye);									
   /****************************************************************** 15 */
      JButton detect = new JButton("Edge Detector");
      detect.setEnabled(false);
      east.add(detect);
   /****************************************************************** 16a */
      JButton encoder = new JButton("Encode");
      encoder.setEnabled(false);
      east.add(encoder);
   /****************************************************************** 16b */
      JButton decoder = new JButton("Decode");
      decoder.setEnabled(false);
      east.add(decoder);		
   
   /****************************************************************** 17 */
      JButton chromakey = new JButton("Chromakey");
      chromakey.setEnabled(false);
      east.add(chromakey);		
   
   /****************************************************************** END */      
      add(east,BorderLayout.EAST);
   //
   // center
   //
      display = new DisplayPix();
      display.addMouseListener(new Mouse());
   
      display.addKeyListener(new Key());
      display.setFocusable(true);
      add(display,BorderLayout.CENTER);
   //
   // south
   //
      JPanel south = new JPanel();
      south.setLayout(new FlowLayout());
      JButton restore = new JButton("Restore Original Image");
      restore.addActionListener(new Listener_restore());
      south.add(restore);
      JButton openimg = new JButton("Open an Image File");
      openimg.addActionListener(new Listener_openimg());
      south.add(openimg);
      JButton undo = new JButton("Undo");
      undo.setEnabled(false);
      south.add(undo);
       red = new JTextField("0.00",5);
      south.add(red);
      JButton r = new JButton("Red");
      r.setEnabled(true);
      r.addActionListener(new Listener_r());
      south.add(r);
      add(south,BorderLayout.SOUTH);
       }
//
/**********************************************************************/
//
// pixel operation listener
// 
   private class Listener_zeroBlue implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.zeroBlue();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_gray implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.grayScale();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_sepia implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.sepia();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_mirrorLR implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.mirrorLR();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_mirrorUD implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.mirrorUD();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_sun implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.sun();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_pixel implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.pixelate();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_splash implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.splash();
         update( display.getXval() , display.getYval() );
      }
   } 
//  ---------->  add more Listeners here   <-----------







//   
/**********************************************************************/
//
   private class Listener_restore implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.resetImage();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_openimg implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if( display.openImage() )
         {
            update( display.getXval() , display.getYval() );
         }
      }
   }
   private class Listener_r implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
       redv = Integer.parseInt(red.getText());

      display.setRed(redv);
      update( display.getXval() , display.getYval() );

      }
   }

   private class Mouse extends MouseAdapter
   {
      public void mouseClicked(MouseEvent e)
      {
         update( e.getX() , e.getY() );
      }
   }
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         switch( e.getKeyCode() )
         {
            case KeyEvent.VK_UP:    display.up();    
               break;
            case KeyEvent.VK_DOWN:  display.down();  
               break;
            case KeyEvent.VK_LEFT:  display.left();  
               break;
            case KeyEvent.VK_RIGHT: display.right(); 
               break;
         }
      //
         update( display.getXval() , display.getYval() );
      }
   }     
   private void update(int x, int y)
   {
      int rgb = display.getRGB(x,y);
   //
      scoreboard.update(x,y,rgb);
   //
      display.update(x,y);
      display.repaint();
   //
      display.requestFocus();
   }
}
//
// end of file
//