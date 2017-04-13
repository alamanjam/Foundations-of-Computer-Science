import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel
{
public void paintComponent(Graphics g)
{
g.setColor(Color.GREEN);
g.fillRect(75,50,1000,2000);
g.setFont(new Font("Serif", Font.BOLD,50));
g.setColor(Color.BLUE);
g.drawString("DANK MEMES",400,150);

g.setFont(new Font("SansSerif", Font.PLAIN,40));
g.setColor(Color.RED);
g.drawString("lmao",500,300);
g.setFont(new Font("Monospaced", Font.ITALIC,30));
g.setColor(Color.YELLOW);
g.drawString("If you can't do it, bs it.",350,450);
g.setFont(new Font("Monospaced", Font.BOLD|Font.ITALIC,20));
g.setColor(new Color(69,69,0));
g.drawString("Which one is you?",450,600);



}
}