import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
import javax.swing.JOptionPane;
public class Lab09
{
   public static void shift(Athlete arg)
   {
       int pile1=0;
       int pile2=0;
       int pile3=0;
       int pile4=0;
       int pile5=0;
       int pile6=0;
       int pile7=0;
       int pile8=0;
       
       while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile1++;
       }
       arg.move();
       while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile2++;
       }

       for(int x=pile1;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();
       while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile3++;
       }
       
       for(int x=pile2;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();
          while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile4++;
       }
      
       for(int x=pile3;x>0;x--)
       {
       arg.putBeeper();
       }
        arg.move();
          while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile5++;
       }
       
       for(int x=pile4;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();
          while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile6++;
       }
       
       for(int x=pile5;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();
           while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile7++;
       }
       
       for(int x=pile6;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();
          while(arg.nextToABeeper())
       {
       arg.pickBeeper();
       pile8++;
       }
        for(int x=pile7;x>0;x--)
       {
       arg.putBeeper();
       }
       arg.move();

       arg.turnAround();
       while(arg.facingWest()&&arg.frontIsClear())
       {
       arg.move();
       }

       }
             public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete bob = new Athlete(1,1,Display.EAST,0);
      shift(bob);
      }}