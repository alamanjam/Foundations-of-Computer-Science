import javax.swing.*;
import java.awt.*;
public class Panel01 extends JPanel
{
public void paintComponent(Graphics g)
{
g.setColor(Color.LIGHT_GRAY);  		//set background color
g.fillRect(0,0, 400,400);
g.setColor(Color.GREEN.darker());		
g.drawLine(0, 350,400,350);		//draw the green ground
g.setColor(Color.RED);
g.drawRect(100, 200, 150, 150);		//draw a square for red walls
g.setColor(Color.BLACK);
g.fillRect(150, 275, 50, 75);		//draw a solid black door

//draw the triangle, which needs three points: (75, 200) and
int xPoints[] = {75,175,275};		//	(175, 150) and
int yPoints[] = {200, 150,200};		//	(275, 200)
g.drawPolygon(xPoints, yPoints, 3);		//draw the black roof

g.setColor(Color.YELLOW);
g.fillOval(300, 75, 50, 50);		//draw the yellow sun

g.setFont(new Font("Serif",Font.ITALIC,20));
g.setColor(Color.WHITE);
g.drawString("Welcome Home", 0, 40); //say "Welcome Home"
for(int x = 0; x <= 400; x += 10)
  g.drawLine(x, 300, x, 350);
for(int x = 0; x <= 400; x +=40)
  g.fillOval(x,75,40 , 20);


}
}