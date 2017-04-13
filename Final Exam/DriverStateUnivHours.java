import javax.swing.JFrame;
public class DriverStateUnivHours
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("State University");
      frame.setSize(450,350);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelStateUnivHours());
      frame.setVisible(true);
   }
}