import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class SquareDancer extends Dancer
{
   public SquareDancer()
   {
   super(1,1,Display.EAST,0);
   }
   public SquareDancer(int x, int y, int dir, int beep)
   {
   super(x,y,dir,beep);
   }
   public void danceStep()
   {
   move();
  
   turnRight();
   
   move();
   turnRight();
   move();
 
   turnRight();
   
   move();
   }
   }