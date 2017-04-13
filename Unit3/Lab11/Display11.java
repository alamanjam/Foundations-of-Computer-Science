import javax.swing.*;
   import java.awt.*;
   public class Display11 extends JPanel
   {
      public JLabel label;
      private int last, next;
      public int stones;
      public Display11()
      {
      stones=12;
      label=new JLabel();
         ImageIcon stones12=new ImageIcon("stones12.jpg");
         label.setIcon(stones12);
         label.setHorizontalAlignment(SwingConstants.CENTER);

         add(label);
}
public int pickUp(JLabel label)

{
      
       if(stones==1)
       {
       ImageIcon one=new ImageIcon("stones1.jpg");
       label.setIcon(one);
       }
       else if(stones==2)
       {
       ImageIcon two=new ImageIcon("stones2.jpg");
       label.setIcon(two);
       }
       else if(stones==3)
       {
       ImageIcon three=new ImageIcon("stones3.jpg");
       label.setIcon(three);
       }
       else if(stones==4)
       {
       ImageIcon four=new ImageIcon("stones4.jpg");
       label.setIcon(four);
       }
       else if(stones==5)
       {
       ImageIcon five=new ImageIcon("stones5.jpg");
       label.setIcon(five);
       }
        else if(stones==6)
       {
       ImageIcon six=new ImageIcon("stones6.jpg");
       label.setIcon(six);
       }
       else if(stones==7)
       {
       ImageIcon seven=new ImageIcon("stones7.jpg");
       label.setIcon(seven);
       }
       else if(stones==8)
       {
       ImageIcon eight=new ImageIcon("stones8.jpg");
       label.setIcon(eight);
       }
       else if(stones==9)
       {
       ImageIcon nine=new ImageIcon("stones9.jpg");
       label.setIcon(nine);
       }
       else if(stones==10)
       {
       ImageIcon ten=new ImageIcon("stones10.jpg");
       label.setIcon(ten);
       }
     else if(stones==11)
       {
       ImageIcon eleven=new ImageIcon("stones11.jpg");
       label.setIcon(eleven);
       }
       else if(stones==12)
       {
       ImageIcon twelve=new ImageIcon("stones12.jpg");
       label.setIcon(twelve);
       }

       return stones;
      } 
      public void reset()
      {
      stones=12;
      label.setIcon(new ImageIcon("stones12.jpg"));
     }
}