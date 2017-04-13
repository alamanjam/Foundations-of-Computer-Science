import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel
{

   JFrame menuFrame, contentFrame, hsFrame, gameFrame, settingsFrame;
   private JPanel panel;
   private JLabel label;
   private JButton c, level, back, start, mute, song, col;
   public static int count = 0;
   private static Color BACKGROUND = new Color(105, 206, 236);
   public static int mute1=0;
   public static final String[] songs = { "Super Mario", "Legend of Zelda"};
   public static final String[] colors = { "Green", "Red", "Yellow", "Orange","Purple", "Pink"};
   public static String s = "Super Mario";
   public String so;
   public String co;
   public static Color color = Color.GREEN;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public SettingsPanel(JFrame f, JFrame g, JFrame settings)
   {
      
      menuFrame = f;
      gameFrame = g;           
      settingsFrame = settings;
          
               
      setLayout(new BorderLayout());
      setBackground(BACKGROUND);
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Settings", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);
         
      Font font = new Font("Monospaced", Font.BOLD, 20);
               
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.CENTER);
      panel.setBackground(BACKGROUND);
      col = new JButton("Change Color of Game Background");
      col.addActionListener(new colorListener());
      col.setFont(font);
      col.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=0;
      panel.add(col, gbc);
      song = new JButton("Change Music");
      song.addActionListener(new songListener());
      song.setFont(font);
      song.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=1;
      panel.add(song, gbc);
      
      mute = new JButton("Music: ON");
      mute.addActionListener(new muteListener());
      mute.setFont(font);
      mute.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=2;
      panel.add(mute, gbc);
      
         
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      add(back, BorderLayout.SOUTH);
             
         
      
   
   }
   private class colorListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         co = (String)JOptionPane.showInputDialog(null, "What color?", "Colors", JOptionPane.QUESTION_MESSAGE, null, colors, colors[0]);
         if(co==(null))
            color = Color.GREEN;
         if(co!=(null))
         {
            if(co.equals("Green"))
               color = Color.GREEN;
            if(co.equals("Red"))
               color = Color.RED;
            if(co.equals("Yellow"))
               color = Color.YELLOW;
            if(co.equals("Orange"))
               color = Color.ORANGE;
            if(co.equals("Purple"))
               color = Color.MAGENTA;
            if(co.equals("Pink"))
               color = Color.PINK;
         }
            
      
      }
   }

   private class muteListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         count++;
         if(count%2==0)
         {
            mute.setText("Music: ON");
            mute1=0;
         }
         else
         {
            mute.setText("Music: OFF");
            mute1=1;
         }
      
      }
   }
   private class songListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         so = (String)JOptionPane.showInputDialog(null, "What song would you like?", "Song", JOptionPane.QUESTION_MESSAGE, null, songs, songs[0]);
         if(so==(null))
            s="Super Mario";
         else
            s=so;
         
      }
   }
   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         menuFrame.setVisible(true);
         settingsFrame.setVisible(false);  
      }
   }
}