	//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
   private JTextField[] input;
   private int aces;
   public ScoreCard09()
   {
      setLayout(new GridLayout(5, 18));
      
      for(int x = 1; x <= 18; x++)
      {
         add(new JLabel("" + x, SwingConstants.CENTER));
      }
      
      input = new JTextField[18];
      for(int x = 0; x < input.length; x++)
      {
         input[x] = new JTextField();
         add(input[x]);
      }
   }
   public void randomize()
   {
      for(int x = 0; x < input.length; x++)
      {
         int random=(int)(Math.random()*4+1);
         input[x].setText(""+random);
      }
   }
   public int findTotal()
   {
      int total=0;
      for(int x = 0; x<input.length;x++)
      {
         int y=Integer.parseInt(input[x].getText());
         total+=y;
      }
      return total;
   }
   public int findAces(int r)
   {
      aces=0;
      for(int x = 0; x < input[r].length; x++)
      {
         int y=Integer.parseInt(input[r][x].getText());
         if(y==1)
         {
            aces++;
         }
      }
      return aces;
   }
      
 
   public int findHardestHole()
   {
      
      int hard = 0;
      int last = 0;
      for(int x = 0; x < input.length; x++)
      {
         if(Integer.parseInt(input[x].getText()) > last)
         {
            hard = x+1;
            last = Integer.parseInt(input[x].getText());
         }
      }
      return hard;
   }
}