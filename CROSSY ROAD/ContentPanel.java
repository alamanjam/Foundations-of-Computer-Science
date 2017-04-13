import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class ContentPanel extends JPanel
{

   JFrame menuFrame, contentFrame, hsFrame, levelFrame, charFrame, profFrame;
   private JPanel panel;
   private int FRAME = 400;
   private int FRAME1 = 450;
   private Graphics myBuffer;
   private JLabel label;
   private static Color BACKGROUND = new Color(105, 206, 236);
   private BufferedImage myImage;
   private JButton addp,c, level, back, start;
   private int clickCount;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public ContentPanel(JFrame f, JFrame fr)
   {
      menuFrame = f;
      contentFrame = fr;
      
      
      
                 
      setLayout(new BorderLayout());
      setBackground(BACKGROUND);
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Game Options", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);
         
     
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.SOUTH);
      panel.setBackground(BACKGROUND);
      Font font = new Font("Monospaced", Font.BOLD, 30);
                 
      
         
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      gbc.gridx=0;
      gbc.gridy=3;
      panel.add(back,gbc);
         
      start = new JButton("Start");
      start.addActionListener(new startListener());
      start.setFont(font);
      start.setForeground(Color.GREEN.darker());
      gbc.gridx=0;
      gbc.gridy=4;
      panel.add(start,gbc);
         
      
      
   
   
     
   }
   
    
   private class startListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         contentFrame.setVisible(false);
         //show level frame, or make a new one if it doesn't exist yet
         if(charFrame == null)
         {
            charFrame = new JFrame("Game Options");
            charFrame.setVisible(true);
            charFrame.setLocation(700,200);
            charFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            charFrame.setContentPane(new CharPanel(contentFrame, menuFrame,levelFrame, charFrame));//char panel needs to know the frames!
            charFrame.setSize(408,438);  
         }            
         else
            charFrame.setVisible(true); 
      }
   
   }
   

   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         menuFrame.setVisible(true);
         contentFrame.setVisible(false);  
      }
   }
}