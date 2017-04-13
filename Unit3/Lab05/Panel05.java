	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel05 extends JPanel
   {
      private Display05 display;
      private Timer timer;
      private JButton button,button1;
      private int count;
      public Panel05()
      {
         setLayout(new FlowLayout());
      
         display = new Display05();
         add(display);
      
         button = new JButton("Press Your Luck");
         button.addActionListener(new Listener());
         add(button);
         timer= new Timer(500, new Listener());
         timer.start();
         button1 = new JButton("Pause Run");
         button1.addActionListener(new Listener1());
         add(button1);
         
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            
         	display.update();
         
         }
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {  
            count++;
            
     
            
            if(count%2==0)
            {
        
            button1.setText("Pause Run");
            timer.start();
          
            
            }
            else
            {
            button1.setText("Start Again");
            timer.stop();
            }
            
            

       }
            
         
      }
      }
      

   