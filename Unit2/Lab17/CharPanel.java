import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CharPanel extends JPanel
{

   JFrame contentFrame, levelFrame, charFrame;
   private JPanel panel;
   private JLabel label;
   private JButton chicken, pigeon, fish, karel, confirm, back;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public CharPanel(JFrame f, JFrame l, JFrame ch)
   {
 
      contentFrame = f;
      levelFrame=l;          
      charFrame = ch;
      setLayout(new BorderLayout());
      
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Characters", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);         
               
      Font font = new Font("Monospaced", Font.BOLD, 20);
      
      JPanel panel = new JPanel(new GridLayout(1,4));
      add(panel, BorderLayout.CENTER);
      ImageIcon chicken1 = new ImageIcon("chicken2.png");
      chicken = new JButton(chicken1);
      panel.add(chicken);
      
      ImageIcon pigeon1 = new ImageIcon("pigeon1.png");
      pigeon = new JButton(pigeon1);
      panel.add(pigeon); 
      
      ImageIcon fish1 = new ImageIcon("fish1.png");
      fish = new JButton(fish1);
      panel.add(fish);
      
      ImageIcon karel1 = new ImageIcon("karel2.png");
      karel = new JButton(karel1);
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
          contentFrame.dispose();
         //show content frame, or make a new one if it doesn't exist yet
         if(levelFrame == null)
         {
            levelFrame = new JFrame("Levels");
            levelFrame.setVisible(true);
            levelFrame.setLocation(700,200);
            levelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            levelFrame.setContentPane(new LevelPanel(charFrame, levelFrame));//content panel needs to know the frames!
            levelFrame.setSize(408,438);  
         }            
         else
            levelFrame.setVisible(true); 
      }

          
      }
 }