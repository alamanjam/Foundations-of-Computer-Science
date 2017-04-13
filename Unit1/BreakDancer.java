import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class BreakDancer extends Dancer
{
   public BreakDancer()
   {
   super(1,1,Display.EAST,0);
   }
   public BreakDancer(int x, int y, int dir, int beep)
   {
   super(x,y,dir,beep);
   }
   public void danceStep()
   {
   move();
   move();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   move();
   move();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   move();
   move();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   turnRight();
   }
   }