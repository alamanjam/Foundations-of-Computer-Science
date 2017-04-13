import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LevelPanel extends JPanel
{

   JFrame charFrame, gameFrame, menuFrame, levelFrame, eogFrame, settingsFrame;
   private JPanel panel;
   private JLabel label;
   public static int theLevel = 0;
   private static Color BACKGROUND = new Color(105, 206, 236);
   public static JButton easy, med, hard, back;
   public static JButton confirm;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public LevelPanel(JFrame f, JFrame m, JFrame g,JFrame l)
   {
   
      charFrame = f;
      menuFrame = m; 
      gameFrame = g;         
      levelFrame = l;
      
      setLayout(new BorderLayout());
      setBackground(BACKGROUND);
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Levels", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);         
               
      
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.CENTER);
      panel.setBackground(BACKGROUND);
      Font font = new Font("Monospaced", Font.BOLD, 30);
      easy = new JButton("Easy");
      easy.addActionListener(new easyListener());
      easy.setFont(font);
      easy.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=0;
      panel.add(easy,gbc);
   
      med = new JButton("Medium");
      med.addActionListener(new medListener());
      med.setFont(font);
      med.setFocusPainted(false);
      gbc.gridx=0;
      gbc.gridy=1;
      panel.add(med,gbc);
         
      hard = new JButton("Hard");
      hard.addActionListener(new hardListener());
      hard.setFont(font);
      gbc.gridx=0;
      gbc.gridy=2;
      panel.add(hard,gbc);         
      
      JPanel panel2 = new JPanel(new GridLayout(1,2));
      add(panel2, BorderLayout.SOUTH);      
      
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      panel2.add(back);
   
      confirm = new JButton("Confirm");
      confirm.addActionListener(new conListener());
      confirm.setFont(font);
      confirm.setForeground(Color.GREEN.darker());
      confirm.setEnabled(false);
      panel2.add(confirm);
   
   
   }
   
        
   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         charFrame.setVisible(true);
         levelFrame.setVisible(false);  
      }
      
   }
   private class conListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         levelFrame.setVisible(false);
      
         //show content frame, or make a new one if it doesn't exist yet
         if(gameFrame == null)
         {
            gameFrame = new JFrame("GAMER");
            gameFrame.setVisible(true);
            gameFrame.setLocation(700,200);
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setContentPane(new GamePanel(settingsFrame, levelFrame,eogFrame,menuFrame, gameFrame));//content panel needs to know the frames!
            gameFrame.setSize(400,450); 
            
         }            
         else
         {
            gameFrame.setContentPane(new GamePanel(settingsFrame, levelFrame,eogFrame,menuFrame, gameFrame));
            gameFrame.setVisible(true);
         } 
      }
   
          
   }

   private class easyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theLevel = 1;
         easy.setForeground(Color.blue);
         med.setForeground(Color.black);
         hard.setForeground(Color.black);
         confirm.setEnabled(true);
      
      }
   }
   private class medListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theLevel = 2;
         easy.setForeground(Color.black);
         med.setForeground(Color.blue);
         hard.setForeground(Color.black);
      
         confirm.setEnabled(true);
      }
   }
   private class hardListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theLevel=3;
         easy.setForeground(Color.black);
         med.setForeground(Color.black);
         hard.setForeground(Color.blue);
         confirm.setEnabled(true);   
      }
   }
}