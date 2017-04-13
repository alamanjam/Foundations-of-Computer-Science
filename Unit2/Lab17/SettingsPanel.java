import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel
{

   JFrame menuFrame, contentFrame, hsFrame, settingsFrame;
   private JPanel panel;
   private JLabel label;
   private JButton c, level, back, start, mute;
   private int count;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public SettingsPanel(JFrame f, JFrame settings)
   {
      menuFrame = f;          
      settingsFrame = settings;
               
      setLayout(new BorderLayout());
      
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Settings", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);
         
      Font font = new Font("Monospaced", Font.BOLD, 20);
               
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.CENTER);
      
     
         
      mute = new JButton("Music: ON");
      mute.addActionListener(new muteListener());
      mute.setFont(font);
      mute.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=0;
      panel.add(mute, gbc);
             
         
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      add(back, BorderLayout.SOUTH);
             
         
      
   
   }
   
   private class muteListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         count++;
         if(count%2==0)
         {
            mute.setText("Music: ON");
         }
         else
         {
            mute.setText("Music: OFF");
         
         }
      
      }
   }
      
   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         menuFrame.setVisible(true);
         settingsFrame.setVisible(false);  
      }
   }
}