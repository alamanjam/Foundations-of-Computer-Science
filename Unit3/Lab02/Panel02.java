import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel
{
   private JLabel label;        //a private field
   public Panel02()
   {
      setLayout(new FlowLayout());
      label = new JLabel("0.0000000000000000");
      label.setFont(new Font("Serif", Font.BOLD, 50));
      label.setForeground(Color.blue);
      add(label);
   
      JButton randomNumber = new JButton("Random");
      randomNumber.addActionListener(new RandomListener());
      add(randomNumber);
      
      JButton cubeRootButton = new JButton("Cube Root");
      cubeRootButton.addActionListener(new CubeRootListener());
      add(cubeRootButton);

      JButton reciprocalButton = new JButton("Reciprocal");  
      reciprocalButton.addActionListener(new ReciprocalListener());
      add(reciprocalButton);
       
      JButton quitButton = new JButton("Quit");     
      quitButton.addActionListener(new QuitListener());
       add(quitButton);     
   }
   private class RandomListener implements ActionListener
   {    
      public void actionPerformed(ActionEvent e)
      {
         double x = Math.random();   //local variable
         label.setText("" + x);      
   }
}
   private class CubeRootListener implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
      double y = Double.parseDouble(label.getText());
            if(y > 0)
            {
               double d = Math.pow(y, 1.0/3.0); 
               label.setText(""+d);
            }
            else
            {
               double d = Math.pow(Math.abs(y), 1.0/3.0);
               label.setText(d+"i");
            }      
    }
    }
   private class ReciprocalListener implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
      {
         double z = Double.parseDouble(label.getText());  
         double d=Math.pow(z,-1);    
         label.setText(""+d);
   }
   }
   
   private class QuitListener implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
      {
      System.exit(0);
        }
        }
        }      
   

