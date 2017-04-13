import javax.swing.JFrame;
public class DriverChooChoo
{
public static void main(String[]args)
{
JFrame frame=new JFrame("Choo-Choo");
frame.setSize(400,300);
frame.setLocation(100,100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new PanelChooChoo());
frame.setVisible(true);
}
}
