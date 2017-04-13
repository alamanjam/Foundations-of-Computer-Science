/**
 * JFrame demo class
 *
 * Last update: July 16, 2015
 *
 * @author Nate Foss
 * @version 2.1
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPanel extends JPanel{

   static JFrame menuFrame, contentFrame, hsFrame, settingsFrame;
   
   public MenuPanel()
   {
      
      setLayout(new BorderLayout());
      JPanel panel = new JPanel(new BorderLayout(0,-200));
      add(panel, BorderLayout.CENTER);
      
      JLabel w = new JLabel("Crossy Road", SwingConstants.CENTER);
      w.setFont(new Font("Monospaced",Font.BOLD, 20));
      panel.add(w, BorderLayout.NORTH);
      
      JLabel v= new JLabel("Version 2.0", SwingConstants.CENTER);
      v.setFont(new Font("Monospaced",Font.BOLD, 20));
      panel.add(v, BorderLayout.CENTER);
      
      JPanel panel1= new JPanel(new GridLayout(2,2));
      add(panel1, BorderLayout.SOUTH);
      
      JButton play = new JButton("Play");
      Font f = new Font("Monospaced", Font.BOLD, 20);
      play.setFont(f);
      play.setFocusPainted(false);
      play.setForeground(Color.GREEN.darker());
      play.addActionListener(new playListener());
      panel1.add(play); 
   
      
      JButton hs = new JButton("High Scores");
      hs.addActionListener(new hsListener());
      hs.setFont(f);
      hs.setFocusPainted(false);
      panel1.add(hs);
      
      JButton settings = new JButton("Settings");
      settings.setFont(f);
      settings.setFocusPainted(false);
      settings.addActionListener(new settingsListener());
      panel1.add(settings); 
      
      JButton quit = new JButton("Quit");
      quit.setFont(f);
      quit.setFocusPainted(false);
      quit.addActionListener(new quitListener());
      panel1.add(quit);
       
   }
   
   private class playListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //hide menu frame
         menuFrame.setVisible(false);
         
         //show content frame, or make a new one if it doesn't exist yet
         if(contentFrame == null)
         {
            contentFrame = new JFrame("Game Options");
            contentFrame.setVisible(true);
            contentFrame.setLocation(700,200);
            contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            contentFrame.setContentPane(new ContentPanel(menuFrame, contentFrame));//content panel needs to know the frames!
            contentFrame.setSize(408,438);  
         }            
         else
            contentFrame.setVisible(true); 
      }
   }
   private class hsListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //hide menu frame
         menuFrame.setVisible(false);
         
         //show content frame, or make a new one if it doesn't exist yet
         if(hsFrame == null)
         {
            hsFrame = new JFrame("High Scores");
            hsFrame.setVisible(true);
            hsFrame.setLocation(700,200);
            hsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            hsFrame.setContentPane(new HSPanel(menuFrame, hsFrame));//content panel needs to know the frames!
            hsFrame.setSize(408,438);  
         }            
         else
         {
            ((HSPanel)(hsFrame.getContentPane())).input("profiles.txt");
            hsFrame.setVisible(true);
         } 
      }
   }
   private class settingsListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //hide menu frame
         menuFrame.setVisible(false);
         //show content frame, or make a new one if it doesn't exist yet
         if(settingsFrame == null)
         {
            settingsFrame = new JFrame("Settings");
            settingsFrame.setVisible(true);
            settingsFrame.setLocation(700,200);
            settingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            settingsFrame.setContentPane(new SettingsPanel(menuFrame, settingsFrame));//content panel needs to know the frames!
            settingsFrame.setSize(408,438);  
         }            
         else
            settingsFrame.setVisible(true); 
      }
   }

   private class quitListener implements ActionListener
   
   {
      public void actionPerformed(ActionEvent e)
      {
         menuFrame.setVisible(false);
        
         int reply = JOptionPane.showConfirmDialog(null, "Are you sure you would like to quit?", "Really Nigga?" , JOptionPane.YES_NO_OPTION);
      
         if (reply == JOptionPane.YES_OPTION) 
         {
            System.exit(0);
         }
         else {
            menuFrame.setVisible(true);
         }
      }
   
   }
   public static void main(String[] args){//begins everything
      menuFrame = new JFrame("Crossy Road");
      menuFrame.setSize(400, 400);
      menuFrame.setLocation(700, 200);
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      menuFrame.setContentPane(new MenuPanel());
      menuFrame.setVisible(true);
   }
  }