import javax.swing.JFrame;
public class Driver06
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("Multiple Buttons");
      frame.setSize(250,200);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel06());
      frame.setVisible(true);
   }
   }