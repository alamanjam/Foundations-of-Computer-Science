import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display; 

public abstract class Digit
{
private Robot myLED;
public Digit(int x, int y)
{
myLED = new Robot(x,y, Display.EAST,Display.INFINITY);
}
public abstract void display();

public void segment1_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment1_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment2_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
}
public void segment2_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
}
public void segment3_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment3_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment4_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment4_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.turnLeft();
}
public void segment5_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
}
public void segment5_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
}
public void segment6_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.turnLeft();
myLED.turnLeft();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();


}
public void segment6_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();
myLED.turnLeft();
myLED.move();
myLED.move();
myLED.move();
myLED.move();
myLED.turnLeft();




}
public void segment7_On()
{
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
myLED.putBeeper();
myLED.move();
}
public void segment7_Off()
{
myLED.move();
myLED.move();
myLED.move();
myLED.move();
}
}





