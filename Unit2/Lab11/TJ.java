import java.awt.*;
import javax.swing.*;
public class TJ extends Ball
{
ImageIcon thomas= new ImageIcon("tj.jpg");
public TJ(double x,double y,double dia)
{
super(x,y,dia,Color.BLACK);
setdx(Math.random());
setdy(Math.random());
}
public void draw(Graphics myBuffer)
{
myBuffer.drawImage(thomas.getImage(),(int)(getX()-getRadius()),(int)(getY()-getRadius()),(int)getDiameter(),(int)getDiameter(),null);
}
}