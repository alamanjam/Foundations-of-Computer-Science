   import javax.swing.JFrame;
   public class Driver17
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Mixing Graphics and GUIs");
         frame.setSize(400, 500);
         frame.setLocation(100, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel17());
         frame.setVisible(true);
      }
   }