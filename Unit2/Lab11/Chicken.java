import java.awt.*;
import javax.swing.*;
public class Chicken extends Character
{
ImageIcon chicken= new ImageIcon("chicken1.png");
public Chicken()
{
super();
}
public void draw(Graphics myBuffer)
{
myBuffer.drawImage(chicken.getImage(),(int)(getX()-getRadius()),(int)(getY()-getRadius()),(int)getDiameter(),(int)getDiameter(),null);
}
}