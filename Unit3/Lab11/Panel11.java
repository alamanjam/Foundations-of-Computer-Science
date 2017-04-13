import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel11 extends JPanel
{
   public JLabel label;
   private int news;
   private Display11 display;
   private Scoreboard11 scoreboard;
   
   public Panel11()
   {
      
      setLayout(new BorderLayout());
      
         
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(2,3,10,0));
      add(panel, BorderLayout.SOUTH);
      addButton(panel, "One", 1);
      addButton(panel, "Two", 2);
      addButton(panel, "Three", 3);
         display = new Display11();
         add(display, BorderLayout.CENTER);
         scoreboard = new Scoreboard11();
         add(scoreboard, BorderLayout.NORTH);
      }
       private void addButton(JPanel panel, String s, int x)
   {
           JButton button=new JButton(s);
           button.addActionListener(new Listener(x));   
           panel.add(button);        
   }
    private class Listener implements ActionListener
   {
      private int myX;
      public Listener(int x)
      {
        myX=x;
      }
      public void actionPerformed(ActionEvent e)
      {
            
            news=display.stones-myX;
            display.stones=news;
            display.pickUp(display.label);
            scoreboard.update();
            if(display.stones==0)
            {
            scoreboard.score();
            display.reset();
            }
       }
   }
}
