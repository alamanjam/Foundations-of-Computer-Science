import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CharPanel extends JPanel
{

   JFrame contentFrame, levelFrame, gameFrame, charFrame, menuFrame;
   private JPanel panel;
   private JLabel label;
   public static int theChar;
   private static Color BACKGROUND = new Color(105, 206, 236);
   private JButton chicken, pigeon, fish, karel, confirm, back;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public CharPanel(JFrame f, JFrame m, JFrame l, JFrame ch)
   {
   
      contentFrame = f;
      menuFrame=m;
      levelFrame=l;          
      charFrame = ch;
      setLayout(new BorderLayout());
      setBackground(BACKGROUND);
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Characters", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);         
               
      Font font = new Font("Monospaced", Font.BOLD, 20);
      
      JPanel panel = new JPanel(new GridLayout(1,4));
      add(panel, BorderLayout.CENTER);
      ImageIcon chicken1 = new ImageIcon("chicken2.png");
      chicken = new JButton(chicken1);
      chicken.addActionListener(new chickenListener());
      panel.add(chicken);
      
      ImageIcon pigeon1 = new ImageIcon("pigeon1.png");
      pigeon = new JButton(pigeon1);
      pigeon.addActionListener(new pigeonListener());
      panel.add(pigeon); 
      
      ImageIcon fish1 = new ImageIcon("fish1.png");
      fish = new JButton(fish1);
      fish.addActionListener(new fishListener());
      panel.add(fish);
      
      ImageIcon karel1 = new ImageIcon("karel2.png");
      karel = new JButton(karel1);
      karel.addActionListener(new karelListener());
      panel.add(karel);
              
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
         contentFrame.setVisible(true);
         charFrame.setVisible(false);  
      }
      
   }
     
   private class conListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         charFrame.setVisible(false);
         //show content frame, or make a new one if it doesn't exist yet
         if(levelFrame == null)
         {
            levelFrame = new JFrame("Levels");
            levelFrame.setVisible(true);
            levelFrame.setLocation(700,200);
            levelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            levelFrame.setContentPane(new LevelPanel(charFrame, menuFrame,gameFrame, levelFrame));//content panel needs to know the frames!
            levelFrame.setSize(400,450);  
            
         }            
         else
            levelFrame.setVisible(true); 
         LevelPanel.confirm.setEnabled(false);
         LevelPanel.easy.setForeground(Color.black);
         LevelPanel.med.setForeground(Color.black);
         LevelPanel.hard.setForeground(Color.black);
      
      }
   
          
   }
   private class chickenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theChar = 1;
         chicken.setEnabled(false);
         pigeon.setEnabled(true);
         fish.setEnabled(true);
         karel.setEnabled(true);
         confirm.setEnabled(true);
      }
   }
   private class pigeonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theChar = 2;
         chicken.setEnabled(true);
         pigeon.setEnabled(false);
         fish.setEnabled(true);
         karel.setEnabled(true);
         confirm.setEnabled(true);
      }
   }
   private class fishListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theChar = 3;
         chicken.setEnabled(true);
         pigeon.setEnabled(true);
         fish.setEnabled(false);
         karel.setEnabled(true);
         confirm.setEnabled(true);
      }
   }
   private class karelListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         theChar = 4;
         chicken.setEnabled(true);
         pigeon.setEnabled(true);
         fish.setEnabled(true);
         karel.setEnabled(false);
         confirm.setEnabled(true);
      }
   }

}