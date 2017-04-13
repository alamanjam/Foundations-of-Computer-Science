import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LevelPanel extends JPanel
{

   JFrame charFrame, levelFrame;
   private JPanel panel;
   private JLabel label;
   private JButton easy, med, hard, back, confirm;
   GridBagConstraints gbc = new GridBagConstraints();
   
   public LevelPanel(JFrame f, JFrame l)
   {
 
      charFrame = f;          
      levelFrame = l;
      setLayout(new BorderLayout());
      
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("Levels", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);         
               
      
      panel = new JPanel(new GridBagLayout());
      add(panel, BorderLayout.CENTER);
      
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
          
      }
}
    private class easyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
   }
     private class medListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
   }
  private class hardListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
   }

}