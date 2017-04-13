import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel17 extends JPanel
{
   private BumperPanel panel1;
   private JPanel panel;
   private JLabel label;
   private Timer timer;
   private JSlider speedSlider;
   private int delay;
   private JButton button, button1, button2;
   public Panel17()
   {
      
      setLayout(new FlowLayout());
      
      panel1 = new BumperPanel();
      panel1.setPreferredSize(new Dimension(350,350));
      add(panel1, BorderLayout.CENTER);
      panel = new JPanel();
      panel.setLayout(new GridLayout(1,3,10,0));
      add(panel, BorderLayout.SOUTH);
      button=new JButton("Randomize");
      button.addActionListener(new Listener1());
      panel.add(button);
      button1=new JButton("Step");
      button1.addActionListener(new Listener2());
      panel.add(button1);
      button2=new JButton("Run Animation");
      button2.addActionListener(new Listener3());
      panel.add(button2);
      
      
      add(new JLabel("Change the slider below to adjust the delay."));
      speedSlider = new JSlider();
      add(speedSlider);
      timer = new Timer(50, new Listener2());
       
   }
    
   private class Listener1 implements ActionListener
   {  
      public void actionPerformed(ActionEvent e)
      {
         panel1.jumpAll();
      }
   }
   private class Listener2 implements ActionListener
   {  
      public void actionPerformed(ActionEvent e)
      {
         delay = speedSlider.getValue();
         timer.setDelay(delay);
      
         panel1.stepAnimation();
      }
   }
   private class Listener3 implements ActionListener
   {  
      public void actionPerformed(ActionEvent e)
      {
         if (timer.isRunning())
         {
            timer.stop();
            button2.setText("Start Again");
            button1.setEnabled(true);
         }
         else
         {
            timer.start();
            button2.setText("Pause Animation");
            button1.setEnabled(false);
         } 
      }
   }
}
