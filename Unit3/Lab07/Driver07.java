import javax.swing.JFrame;
public class Driver07
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("GCD and LCM");
      frame.setSize(250,250);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel07());
      frame.setVisible(true);
   }
   }