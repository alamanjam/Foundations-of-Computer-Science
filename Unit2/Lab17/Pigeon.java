import java.awt.*;
import javax.swing.*;
public class Pigeon extends Character
{
ImageIcon pigeon= new ImageIcon("pigeon.png");
public Pigeon()
{
super();
}
public void draw(Graphics myBuffer)
{
myBuffer.drawImage(pigeon.getImage(),(int)(getX()),(int)(getY()),(int)(getWidth()),(int)(getHeight()),null);
}
}