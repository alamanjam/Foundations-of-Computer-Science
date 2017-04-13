import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/first.map");
      Display.setSize(10,10);
      Display.setSpeed(5);
   
      Robot karel=new Robot();
      Athlete maria=new Athlete();
      Climber lisa=new Climber(4);
      Racer pete=new Racer(1);
      Robot horatio = new Climber(8);
      
  
         }
}