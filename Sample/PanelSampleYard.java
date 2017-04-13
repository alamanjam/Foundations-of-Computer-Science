import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelSampleYard extends JPanel
{
   public static JButton next, quit; 
   public DisplaySampleYard display;
   public JPanel panel;

   
   public PanelSampleYard()
   {
      setLayout(new BorderLayout());
      
      display = new DisplaySampleYard();
      add(display);
      
      Font font = new Font("Serif", Font.BOLD, 20);
       
      panel = new JPanel(new FlowLayout());
      add(panel, BorderLayout.SOUTH);
       
      next = new JButton("Next");
      next.addActionListener( new nextListener());
      panel.add(next);
      
      quit = new JButton("Quit");
      quit.addActionListener( new quitListener());
      panel.add(quit);

      
      
   }
   
   private class nextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.goNext();
         if(DisplaySampleYard.number>=DisplaySampleYard.numitems)
         next.setEnabled(false);
      }
   }
      private class quitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   
}