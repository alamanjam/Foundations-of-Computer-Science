	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
    public class Odometer extends JPanel
   {
     private JLabel label1,label2,label3;
     private int count,count1,count2,count3;
   
       public Odometer()
      {
         setLayout(new FlowLayout());
         setBackground(Color.black);
         label1 = new JLabel("0");
         label1.setFont(new Font("Serif", Font.BOLD, 25));
         label1.setForeground(Color.white);
         label1.setBackground(Color.black);
         label1.setOpaque(true);
         add(label1);
        
         label2 = new JLabel("0");
         label2.setFont(new Font("Serif", Font.BOLD, 25));
         label2.setForeground(Color.white);
         label2.setBackground(Color.black);
         label2.setOpaque(true);
         add(label2); 
         
         label3 = new JLabel("0");
         label3.setFont(new Font("Serif", Font.BOLD, 25));
         label3.setForeground(Color.black);
         label3.setBackground(Color.white);
         label3.setOpaque(true);
         add(label3);
         	/*******************************/
         	/* This is the constructor.    */
         	/* Set the layout.				 */
				/* Set the background.         */
         	/* Instantiate all objects and */
      		/* set their properties.       */
      		/*	                            */ 
         	/*******************************/
      }
       public void update()
      {
         	count++;
            label3.setText(""+count%10);
            label2.setText(""+(count/10)%10);
            label1.setText(""+count/100);
      }
   }