   //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard13 extends JPanel
{
   private JTextField[][] input;
   public ScoreCard13()
   {
      setLayout(new GridLayout(5, 18));
      
      for(int hole = 1; hole <= 18; hole++)
      {
         add(new JLabel("" + hole, SwingConstants.CENTER));
      }
      
      input = new JTextField[4][18];
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++)
         {
            input[r][c] = new JTextField();
            add(input[r][c]);
         }
   }
   public void randomize()
   {
      for(int x=0;x<input.length;x++)
      {
         for(int c=0;c<input[0].length;c++)
         {
            int random=(int)(Math.random()*4+1);
            input[x][c].setText(""+random);
         }
      }
   }
   public int findTotal(int r)
   {
      int answer = 0;
      for (int c = 0; c < this.input[0].length; c++) {
         answer += Integer.parseInt(this.input[r][c].getText());
      }
      return answer;
   }      
   public int findAces(int r)
   {
      int aces=0;
      for(int x = 0; x<input[r].length;x++)
      {
         int y=Integer.parseInt(input[r][x].getText());
         if(y==1)
         {
            aces++;
         }
      }
      return aces;
   }
   public int findHardestHole(int r)
   {
      int hard = 0;
      int last = 0;
      for(int x = 0; x < input.length; x++)
      {
         if(Integer.parseInt(input[r][x].getText()) > last)
         {
            hard = x+1;
            last = Integer.parseInt(input[r][x].getText());
         }
      }
      return hard;
   }
   public int findHardestHole()
   {
      int hole = 0;
      int maxSoFar = 0;
      for (int c = 0; c < this.input[0].length; c++)
      {
         int vertical = 0;
         for (int r = 0; r < this.input.length; r++) {
            vertical += Integer.parseInt(this.input[r][c].getText());
         }
         if (vertical > maxSoFar)
         {
            hole = c;
            maxSoFar = vertical;
         }
      }
      return hole + 1;
   }
}
