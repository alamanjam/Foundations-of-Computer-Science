/**
 * JFrame demo class
 *
 * Last update: July 17, 2015
 *
 * @author Nate Foss
 * @version 2.1
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel
{

   JFrame menuFrame, contentFrame, hsFrame, levelFrame, charFrame, profFrame;
   private JPanel panel;
   private JLabel label;
   private JButton addp,c, level, back, start;
   private int clickCount;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public ContentPanel(JFrame f, JFrame fr)
   {
      menuFrame = f;
      contentFrame = fr;
                 
      setLayout(new BorderLayout());
      
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Game Options", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);
         
     
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.SOUTH);
      
      Font font = new Font("Monospaced", Font.BOLD, 30);
      addp = new JButton("Add Profile");
      addp.addActionListener(new addpListener());
      addp.setFont(font);
      addp.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=0;
      panel.add(addp,gbc);
            
      
         
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      gbc.gridx=0;
      gbc.gridy=3;
      panel.add(back,gbc);
         
      start = new JButton("Start");
      start.addActionListener(new startListener());
      start.setFont(font);
      gbc.gridx=0;
      gbc.gridy=4;
      panel.add(start,gbc);
         
         
      
   
   }
   
   private class addpListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         contentFrame.setVisible(false);
         //show level frame, or make a new one if it doesn't exist yet
         if(profFrame == null)
         {
            profFrame = new JFrame("Add Profile");
            profFrame.setVisible(true);
            profFrame.setLocation(700,200);
            profFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            profFrame.setContentPane(new ProfPanel(contentFrame, profFrame));//prof panel needs to know the frames!
            profFrame.setSize(408,438);  
         }            
         else
            profFrame.setVisible(true); 
      }

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
            charFrame.setContentPane(new CharPanel(contentFrame, levelFrame, charFrame));//char panel needs to know the frames!
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