   //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel08 extends JPanel
{
   private JButton button1,button2;

   private Display08 display;
   public Panel08()
   {
      setLayout(new BorderLayout());
      
      display = new Display08();
      add(display, BorderLayout.CENTER);
         
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(1,2));
      add(panel, BorderLayout.SOUTH);
         
      addButton(panel, "Finite",1);        
      addButton(panel, "Infinite",2);
        
      
   }
   private void addButton(JPanel panel, String s, double x)
   {
      JButton button=new JButton(s);
      button.addActionListener(new Listener(x));   
      panel.add(button);        
   }

   private class Listener implements ActionListener
   {
      private double myX;
      public Listener(double x)
      {
         myX = x;
      }
   
      public void actionPerformed(ActionEvent e)
      {
         
         if(myX==1)
         {
            display.sumFinite();
         }
         else if(myX==2)
         {
            display.sumInfinite();
         }
         
      }
   }
}