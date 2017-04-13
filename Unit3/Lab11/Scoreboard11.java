   import javax.swing.*;
   import java.awt.*;
   public class Scoreboard11 extends JPanel
   {
      private JLabel label1, label2, label3;
      private int one, two;
      public int count;
      public Scoreboard11()
      {
         setLayout(new GridLayout(1, 3));
         one = two = 0;
      
         
         label1 = new JLabel("One: "+one);
         label1.setBackground(Color.WHITE);
         label1.setOpaque(true);
         label1.setHorizontalAlignment(SwingConstants.CENTER);
         add(label1);
         label2 = new JLabel("Nim");
          label2.setOpaque(true);
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
         add(label2);
         label3 = new JLabel("Two: "+two);
         label3.setBackground(Color.WHITE);
         label3.setOpaque(false);
         label3.setHorizontalAlignment(SwingConstants.CENTER);
         add(label3);
         count=1;
         }
 public void update()       
 {
 
      count++;
      if(count%2==0)
       {
       label1.setOpaque(false);
       label3.setOpaque(true);
       }
       else
       {
       label3.setOpaque(false);
       label1.setOpaque(true);       
       }
       repaint();
}
public void score()       
 {
 
     if(count%2==0)
       {
       one++;
       label1.setText("One: "+one);
       }
       else
       {
       two++;
       label3.setText("Two: "+two);
       }
}
}