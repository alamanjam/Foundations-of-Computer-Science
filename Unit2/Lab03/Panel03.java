	//Name______________________________ Date_____________
   import java.awt.*;
   import javax.swing.JPanel;
   import javax.swing.JOptionPane;
   import java.awt.image.BufferedImage;
   public class Panel03 extends JPanel
   {
      private BufferedImage myImage;
      public Panel03()
      {
         String imagesize = JOptionPane.showInputDialog("N?");
         String lines = JOptionPane.showInputDialog("Number of lines");
         String rays = JOptionPane.showInputDialog("Number of rays");
         
         int N=Integer.parseInt(imagesize);
         int l=Integer.parseInt(lines);
         int F=Integer.parseInt(rays);

         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
      
      	//webbing
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= l; k++)
         {
            buffer.drawLine(N * k / l, 0, N, N * k / l);
            buffer.drawLine(N * k / l, N, 0, N * k / l);
            buffer.drawLine(400-N * k / l,N-N,0, N * k / l); 
            buffer.drawLine(N-N * k / l,N,N, N * k / l);        
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1;							//endpoint for each ray
         int size = 100;					//length of each ray
         int r1 = 60, r2 = 55;			//radius of the sun
      
         for(int n=0;n<=360;n+=360/F)
         {
         x1=(int)(x+size*Math.cos(n*Math.PI/180));
         y1=(int)(y+size*Math.sin(n*Math.PI/180));
         buffer.drawLine(x,y,x1,y1);
         }
         
      
         buffer.setColor(Color.BLUE.brighter());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }