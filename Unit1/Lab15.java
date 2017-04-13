  import edu.fcps.karel2.Display;  
    
   public class Lab15
   {
       public static void main(String[] args)
      {
         SquareDancer weismuller = new SquareDancer(5,9,Display.EAST,0);
         BreakDancer spitz = new BreakDancer(1,5,Display.EAST,0);
         LineDancer phelps = new LineDancer(1,3,Display.EAST,0);
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( spitz );
         Thread t3 = new Thread( phelps );
         t1.start();
         t2.start();
         t3.start();
      }
   }