  import javax.swing.JFrame;
    public class DriverPONG
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab11: Bouncing Pinball");
         frame.setSize(800, 600);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new BumperPanel());
         frame.setVisible(true);
      }
   }