import java.io.FileOutputStream;
import java.io.PrintStream;

public class Driver07
{
  public static void main(String[] args)
    throws Exception
  {
    System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    
    Shape[] array = new Shape[(int)(Math.random() * 40.0 + 10.0)];
    for (int x = 0; x < array.length; x++)
    {
      double shape = Math.random() * 100.0;
      switch ((int)(Math.random() * 4.0))
      {
      case 0: 
        array[x] = new Circle(shape);
        break;
      case 1: 
        array[x] = new Square(shape);
        break;
      case 2: 
        array[x] = new Rectangle(shape, Math.random() * 100.0);
        break;
      case 3: 
        array[x] = new Triangle(shape);
        break;
  
      }
    }
    System.out.println("Shapes");
    System.out.println("------");
    for (int x = 0; x < array.length; x++) {
      System.out.println("area = " + array[x].findArea() + "\t\t" + array[x]);
    }
  }
}
