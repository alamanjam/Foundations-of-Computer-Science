import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class SteepleChaseRacer extends Racer
{
   public SteepleChaseRacer(int y)
   {
      super(y);
   }
   public void jumpRight()
   {
      while(frontIsClear())
      {
      move();
      }
      while(!frontIsClear())
      {
      turnLeft();
      }
   
        while(!rightIsClear()&&facingNorth())
        {
        move();
        }
        turnRight();
        move();

        while(rightIsClear()&&facingEast())
        {
        turnRight();
        move();
        }
        while(!rightIsClear()&&facingSouth()&&frontIsClear())
        {
        move();
        }
        while(!rightIsClear()&&facingSouth()&&!frontIsClear())
        {
        turnLeft();
        }
        
          }   
        
   public void jumpLeft()
   {
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();
   }
   public void sprint(int n)
   {
      for(int k=1; k <= n; k++) 
         move();
   }
   public void put(int n)
   {
      for(int j=1; j<=n; j++)
         putBeeper();
   }
   public void pick(int n)
   {
      for(int l=1; l<=n; l++)
         pickBeeper();
   }
   
}