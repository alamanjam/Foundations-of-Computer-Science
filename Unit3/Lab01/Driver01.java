import javax.swing.JFrame;
public class Driver01
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("Hello Button");
      frame.setSize(200,200);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel01());
      frame.setVisible(true);
   }
}