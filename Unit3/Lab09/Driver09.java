import javax.swing.JFrame;
public class Driver09
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("Subway Tokens");
      frame.setSize(525,200);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel09());
      frame.setVisible(true);
   }
   }