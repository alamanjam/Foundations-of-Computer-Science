	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Robot implements Runnable
   {
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      public void run() //not swim
      {
      int count=0;
      for(int x=0;x<10;x++)
      {
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      turnLeft();
      count++;  
      System.out.println("count is:"+count);
      }
      
      }
   }