import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class LineDancer extends Dancer
{
   public LineDancer()
   {
   super(1,1,Display.EAST,0);
   }
   public LineDancer(int x, int y, int dir, int beep)
   {
   super(x,y,dir,beep);
   }
   public void danceStep()
   {
   move();
   move();
   move();
   turnAround();
   move();
   move();
   move();
   turnAround();
   }
   }