import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel07 extends JPanel
{
   private JButton button,button1;
   private Display07 display;
   public Panel07()
   {
      setLayout(new FlowLayout());
      display = new Display07();
      add(display); 
   
      button = new JButton("GCD");
      button.addActionListener(new Listener());
      add(button);
         
      button1 = new JButton("LCM");
      button1.addActionListener(new Listener1());
      add(button1);
   
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
            
         display.showGCD();
         
      }
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
            
         display.showLCM();
         
      }
   }
}
