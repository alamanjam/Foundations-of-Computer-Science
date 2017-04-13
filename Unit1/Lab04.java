import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab04
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/arena.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      Athlete coach=new Athlete(2,7,Display.EAST,Display.INFINITY);
      Athlete bob=new Athlete();
      Athlete kyle=new Athlete();;
      Athlete phillip=new Athlete();
      Athlete brian=new Athlete();
      Athlete brendan=new Athlete();
      Athlete noah=new Athlete();
      takeTheField(bob);
      takeTheField(kyle);
      takeTheField(phillip);
      takeTheField(brian);
      takeTheField(brendan);
      takeTheField(noah);
      
      bob.move();
      bob.move();
      bob.turnLeft();
      bob.move();
      bob.move();
      bob.turnRight();
      bob.move();
      bob.turnRight();
      kyle.turnLeft();
      kyle.move();
      kyle.turnRight();
      kyle.move();
      kyle.move();
      kyle.move();
      kyle.move();
      kyle.move();
      kyle.turnRight();
      phillip.move();
      phillip.move();
      phillip.move();
      phillip.move();
      phillip.turnRight();
      brian.move();
      brian.move();
      brian.move();
      brian.turnRight();
      brendan.move();
      brendan.move();
      brendan.turnRight();
      noah.turnLeft();
      noah.move();
      noah.turnRight();
      noah.move();
      noah.turnRight();
      
   
      
      
      
      
      
      
      
   }
}