import javax.swing.JFrame;
public class DriverSampleYard
{
   public static void main(String[]args)
   {
      JFrame frame= new JFrame("Sample Final Exam");
      frame.setSize(350,250);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }
}