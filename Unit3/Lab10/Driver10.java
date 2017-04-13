import javax.swing.JFrame;
public class Driver10
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("Subway Tokens");
      frame.setSize(300,400);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel10());
      frame.setVisible(true);
   }
   }