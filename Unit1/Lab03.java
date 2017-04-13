import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab03
{
   public static void main(String[] args) 
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(5);
      
      Climber kyle=new Climber(8);
      Climber ben=new Climber(8);
      kyle.putBeeper();
      kyle.turnRight();
      ben.turnRight();
      kyle.move();
      ben.move();
      kyle.climbUpRight();
      ben.climbUpRight();
      kyle.climbUpRight();
      ben.climbUpRight();
      kyle.climbUpRight();
      ben.climbUpRight();
      kyle.climbDownRight();
      ben.climbDownRight();
      kyle.climbDownRight();
      ben.climbDownRight();
      kyle.pickBeeper();
      kyle.turnAround();
      ben.turnAround();
      kyle.climbUpLeft();
      ben.climbUpLeft();
      kyle.climbUpLeft();
      ben.climbUpLeft();
      kyle.climbDownLeft();
      ben.climbDownLeft();
      kyle.climbDownLeft();
      ben.climbDownLeft();
      kyle.climbDownLeft();
      ben.climbDownLeft();
      kyle.move();
      ben.move();
      kyle.putBeeper();
      
   }
}
