import javax.swing.JFrame;
   import edu.fcps.Bucket;
public class Driver04b
{
public static void main(String[]args)
{

JFrame frame=new JFrame("Lab04");
frame.setSize(600,400);
frame.setLocation(100,100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new BucketPanel());
frame.setVisible(true);
Bucket.setSpeed(10);
Bucket.useTotal(true);
Bucket five=new Bucket(5);
Bucket three=new Bucket(3);
Bucket four=new Bucket(4);
five.fill();
five.pourInto(three);
three.spill();
five.pourInto(three);
five.fill();
five.pourInto(three);
three.spill();
five.pourInto(three);
three.spill();
five.pourInto(three);
five.fill();
five.pourInto(three);
five.spill();
five.fill();
four.fill();
three.spill();
five.pourInto(three);
three.spill();
five.pourInto(three);
five.fill();
five.pourInto(three);
five.spill();
three.pourInto(five);
three.fill();
}
}