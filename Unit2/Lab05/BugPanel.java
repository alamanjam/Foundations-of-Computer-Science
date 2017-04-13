    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class BugPanel extends JPanel
   {  private Bug a;
       private Bug b;
        private Bug c;
         private Bug d;

      
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
               myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         a=new Bug(0,0);
         b=new Bug(0,400);
         c=new Bug(400,0);
         d=new Bug(400,400);
         while(!a.sameSpot(c)){
         a.walkTowards(c,.10);
         c.walkTowards(d,.10);
         d.walkTowards(b,.10);
         b.walkTowards(a,.10);
         buffer.drawLine(a.getX(),a.getY(),c.getX(),c.getY());
         buffer.drawLine(b.getX(),b.getY(),a.getX(),a.getY());
         buffer.drawLine(c.getX(),c.getY(),d.getX(),d.getY());
         buffer.drawLine(d.getX(),d.getY(),b.getX(),b.getY());
         }
         
         
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }