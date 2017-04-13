   //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Display10 extends JPanel
{
private double total;
private JLabel label;
   private JLabel[] bits;
   public Display10()
   {
      setLayout(new GridLayout(1, 9));
      bits = new JLabel[8];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }
      label = new JLabel(""+SwingConstants.RIGHT);
      label.setFont(new Font("Serif", Font.BOLD,25));
      label.setForeground(Color.black);
      add(label);
      randomize();
      convert();
   }
   public void randomize()
   {      
      for(int x = 0; x<bits.length;x++)
      {
         int random=(int)(Math.random()*2);
         bits[x].setText(""+random);
      }
   }
   public void reverse()
   {
      int []temp= new int[bits.length];
      for(int x = 0; x<bits.length;x++)
      {
         temp[x]=Integer.parseInt(bits[x].getText());
      }
      for(int x=0;x<temp.length;x++)
      {
      
         bits[x].setText(""+temp[temp.length-x-1]);      
      
      }
   }
   public void shift()
   {
      for (int x = 0; x < bits.length - 1; x++) {
         bits[x].setText(bits[(x + 1)].getText());
      }
      bits[(bits.length - 1)].setText("0");
   }      
   public void rotate()
   { 
   int v=Integer.parseInt(bits[0].getText());
      
      shift(); 
      
      bits[(bits.length - 1)].setText(""+v);
   }
   public void convert()
   {
    total=0;
     for(int x=bits.length-1;x>=0;x--)
   {
      int v=Integer.parseInt(bits[bits.length-1-x].getText());
      double c=v*Math.pow(2,x);
      total = total+c;
   }
   label.setText(""+total);
}
}