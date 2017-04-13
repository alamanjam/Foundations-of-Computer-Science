import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver14
{
  private static Turtle smidge;
  private static int level;
  private static int choice;
  
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Tree Turtles");
    frame.setSize(400, 400);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(3);
    frame.setContentPane(new TurtlePanel());
    frame.setVisible(true);
    Turtle.clear(Color.white);
    smidge = new Turtle(300.0D, 500.0D, 90.0D)
    
    {
      public void drawShape() {}
    };
    choice = Integer.parseInt(JOptionPane.showInputDialog("1. Tree\n2. Extension"));
    if (choice == 1)
    {
      level = Integer.parseInt(JOptionPane.showInputDialog("How many levels? (1-7)"));
      Turtle.setCrawl(true);
      Turtle.setSpeed(1);
      tree(smidge, 70.0D, 30.0D, level);
    }
    else
    {
      Turtle.setCrawl(false);
      Turtle.setSpeed(10);
      treeExt(smidge, 70.0D, 25.0D);
    }
  }
  
  public static void tree(Turtle t, double size, double angle, int level)
  {
    if (level == 0) {
      return;
    }
    if (size < 0.0D) {
      return;
    }
    t.forward(size);
    t.turnLeft(angle);
    tree(t, size - 10.0D, angle, level - 1);
    t.turnRight(angle * 2.0D);
    tree(t, size - 10.0D, angle, level - 1);
    t.turnLeft(angle);
    t.back(size);
  }
  
  public static void treeExt(Turtle t, double size, double angle)
  {
    if (size < 5.0D) {
      return;
    }
    setColor(t, size);
    t.forward(size);
    double x = Math.random() * 15.0D;
    double y = Math.random() * 15.0D;
    double len1 = Math.random() * 10.0D + 5.0D;
    double len2 = Math.random() * 10.0D + 5.0D;
    t.turnLeft(angle + x);
    treeExt(t, size - len1, angle);
    t.turnRight(angle + x);
    t.turnRight(angle + y);
    treeExt(t, size - len2, angle);
    t.turnLeft(angle + y);
    setColor(t, size);
    t.back(size);
  }
  
  public static void setColor(Turtle t, double size)
  {
    if (size < 10.0D) {
      t.setColor(Color.red);
    } else if (size < 40.0D) {
      t.setColor(Color.green.darker());
    } else {
      t.setColor(new Color(160, 130, 100));
    }
  }
}
