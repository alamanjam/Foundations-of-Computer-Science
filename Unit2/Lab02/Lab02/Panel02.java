import javax.swing.*;
import java.awt.*;
public class Panel02 extends JPanel
{
public void paintComponent(Graphics g)
{
g.setColor(Color.RED);
g.fillRect(0,0,400,400);
g.setColor(Color.YELLOW.darker());
g.fillRect(60,80,150,200);

ImageIcon thomas = new ImageIcon("tj.jpg");
g.drawImage(thomas.getImage(), 70, 100, null); 
g.setColor(Color.YELLOW.darker());
for(int x=60;x<=200;x+=20) 
{
g.fillOval(x,70,25 ,25);;
}
for(int x=40;x<=200;x+=20) 
{
g.fillOval(x,270,25 , 25);;
}
for(int y=70;y<=250;y+=20) 
{
g.fillOval(40,y,25 , 25);;
}
for(int y=70;y<=250;y+=20) 
{
g.fillOval(200,y,25 , 25);;
}
g.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,20));
g.setColor(Color.WHITE);
g.drawString("Our Fearless Leader", 50, 325);
}
}