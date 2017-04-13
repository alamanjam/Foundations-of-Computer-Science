import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab05
{
     
   public static void main(String[] args) 
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
      Racer rose=new Racer(1);
      Racer bob=new Racer(4);
      Racer dad=new Racer(7);
      Thread t1 = new Thread(rose);
      Thread t2 = new Thread(bob);
      Thread t3 = new Thread(dad);
      t1.start();
      t2.start();
      t3.start();
   }
}