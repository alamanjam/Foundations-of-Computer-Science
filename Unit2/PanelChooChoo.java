import javax.swing.*;
import java.awt.*;
public class PanelChooChoo extends JPanel
{
public void paintComponent(Graphics g)
{
g.setColor(Color.YELLOW);  		//set background color
g.fillRect(0,0, 400,300);
g.setColor(Color.RED);
g.fillRect(185,90,140,75);
g.setColor(Color.BLUE);
g.fillOval(175,145,50,50);
g.fillOval(285,145,50,50);
g.setColor(Color.GRAY);
for(int x=5;x<=400;x+=15)
{
g.fillRect(x,195,5,55);
}
g.setColor(Color.BLACK);
g.fillRect(0,205,400,10);
g.fillRect(0,235,400,10);
g.fillRect(200,65,25,25);
g.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,30));
g.drawString("Choo-choo",40,50);
g.setColor(Color.WHITE);
for(int y=0;y<=5;y+=10)
{
g.fillOval(200+y,45-y,20,20);
}
}
}
