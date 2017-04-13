   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display08 extends JPanel
   {
      private JLabel label;
      private JTextField box1, box2, box3;
      private double sum,terms,first,ratio,next;
      public Display08()
      {
         setLayout(new GridLayout(4, 2));
      
         add(new JLabel("Terms:", SwingConstants.RIGHT));
         box1 = new JTextField("", 5);
         box1.setHorizontalAlignment(SwingConstants.LEFT);
         add(box1);
      
         add(new JLabel("First:", SwingConstants.RIGHT));
         box2 = new JTextField("", 5);
         box2.setHorizontalAlignment(SwingConstants.LEFT);
         add(box2);
      
         add(new JLabel("Ratio:", SwingConstants.RIGHT));
         box3 = new JTextField("", 5);
         box3.setHorizontalAlignment(SwingConstants.LEFT);
         add(box3);
      
         add(new JLabel("Sum:", SwingConstants.RIGHT));
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD, 20));
         label.setForeground(Color.blue);
         add(label);
      }
      public void sumFinite()
      {
           first=Double.parseDouble(box2.getText());
           terms=Double.parseDouble(box1.getText());
           ratio=Double.parseDouble(box3.getText());
           
           sum= first*((1.0-Math.pow(ratio,terms))/(1.0-ratio));
           label.setText(""+sum);
      
      }
      public void sumInfinite()
      {
            
            if(ratio>=1)
            {
            label.setText("NONE");
            }
         	sum=((first)/(1-ratio));
            label.setText(""+sum);      
      }
   }