
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;
import javax.sound.sampled.*;
import java.io.File;

public class GamePanel extends JPanel
{  
   JFrame settingsFrame, levelFrame, eogFrame, gameFrame, menuFrame;
   private static final int FRAMEy = 450;
   private static final int FRAMEx = 400;
   private static final Color BACKGROUND = Color.GREEN;
   private BufferedImage myImage;
   private Graphics myBuffer;
   private ArrayList<VehicleC> cars;
   int numcars;
   private Road[] roads;
   private double shift = 30;
   private Timer t; 
   private Timer timer;
   private boolean direction;
   private Character character;
   private Pause pause;
   private double vehicledx;
   public static int score =0;
   public static int count = 0;
   public Clip clip;
		//constructor   
   public GamePanel(JFrame s, JFrame f, JFrame eog, JFrame m, JFrame g)
   { 
      settingsFrame = s;
      levelFrame = f;
      eogFrame = eog;
      menuFrame = m;
      gameFrame = g;
      
      
                  
   
      myImage =  new BufferedImage(FRAMEx, FRAMEy, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(SettingsPanel.color);
      myBuffer.fillRect(0, 0, FRAMEx,FRAMEy);//fills the backgorund with the green color
      
      roads = new Road[3];//creates an array of three roads that will show up on the screen
      for(int x = 0; x<roads.length; x++)//this loop will create three random road sizes and positiions
      {
         int loc = (int)(((Math.random()*4)+1)*shift+(120*x));//y position of the road
         int sswidth = 1;//if the roads can only be one wide
         int swidth = (int)((Math.random()*2)+1);//if the roads can only be two or one wide
         int width = (int)((Math.random()*3)+1);//if the roads can be either one two or three wide
         switch(loc)
         {
            case 300:
               roads[x] = new Road(0, loc, FRAMEx, swidth*shift);//if loc is 300 there can be one or two lanes
               break;
            case 330:
               roads[x] = new Road(0, loc, FRAMEx, sswidth*shift);//if loc is 330 there can only be one lane
               break;
            case 360:
               x--;//if loc = 360 there can be no lanes so redo the loop
               break;
            case 270:
               roads[x] = new Road(0, loc, FRAMEx, width*shift);//if loc is 270 there can be one two or three lanes                 break;
               break;
            case 240:
               x--;//if loc = 240 there can be no lanes so redo the loop
               break;
            case 210:
               roads[x] = new Road(0, loc, FRAMEx, sswidth*shift);//if loc is 210 there can only be one lane
               break;
            case 180:
               roads[x] = new Road(0, loc, FRAMEx, swidth*shift);//if loc is 180 there can be one or two lanes
               break;
            case 150:
               roads[x] = new Road(0, loc, FRAMEx, width*shift);//if loc is 150 there can be one two or three lanes
               break;
            case 120:
               x--;//if loc = 120 there can be no lanes so redo the loop
               break;
            case 90:
               roads[x] = new Road(0, loc, FRAMEx, sswidth*shift);//if loc is 90 there can only be one lane
               break;
            case 60:
               roads[x] = new Road(0, loc, FRAMEx, swidth*shift);//if loc is 60 there can be one or two lanes
               break;
            case 30:
               roads[x] = new Road(0, loc, FRAMEx, width*shift);//if loc is 30 there can be one two or three lanes
               break;
            case 0:
               x--;//if loc = 0 there can be no lanes so redo the loop
               break;      
            default:
               x--;
               break;  
         
         }
      }
      cars = new ArrayList<VehicleC>();//create an array list of cars
      
      for(int x= 0; x<roads.length; x++)//create an ammount of cars that are equal to the number of roads
      {
         for(int y = 0; y<roads[x].getLanes(); y++)//for each lane on the road creat a car
         {
            int dir = (int)(Math.random()*2);//randomly assigns a direction to the cars
            if(dir==0)
            {
               direction = true;
            }
            if(dir==1)
            {
               direction = false;
            }
            if(LevelPanel.theLevel==2&&direction==true)
            {
               vehicledx = ((Math.random()*.5)+.35);
            }
            if(LevelPanel.theLevel==2&&direction==false)
            {
               vehicledx = (-1*((Math.random()*.5)+.35));
            }
            if(LevelPanel.theLevel==3&&direction==true)
            {
               vehicledx = ((Math.random()*.5)+.7);
            }
            if(LevelPanel.theLevel==3&&direction==false)
            {
               vehicledx = (-1*((Math.random()*.5)+.7));
            }
            if(LevelPanel.theLevel==1&&direction==true)
            {
               vehicledx = ((Math.random()*.5)+.15);
            }
            if(LevelPanel.theLevel==1&&direction==false)
            {
               vehicledx = (-1*((Math.random()*.5)+.15));
            }
            int numcars = ((int)((Math.random()*3)+1));
            double position = 0;
            for(int h = 0; h < numcars; h++)
            {
               cars.add(new VehicleC(position, ((roads[x].getY())+(shift*y)), 40, shift-5, direction, (int)(Math.random()*6), vehicledx));
               position+=(FRAMEx/numcars);
            }
         }
      }
      
      if(CharPanel.theChar==1)
      {
         character = new Chicken();
      }  
      if(CharPanel.theChar==2)
      {
         character = new Pigeon();
      } 
      if(CharPanel.theChar==3)
      {
         character = new Fish();
      }
      else if(CharPanel.theChar==4)
      {
         character = new Karel();
      }
         
         
      t = new Timer(5, new Listener());
      t.start();
      addKeyListener(new Key());
      setFocusable(true);
   
      
      if(SettingsPanel.mute1==0||SettingsPanel.mute1==1)
      {
         try{
            File file = new File(SettingsPanel.s+".wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = stream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
         
            clip.open(stream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            if(SettingsPanel.mute1==1)
            {
               clip.stop();
            }
         
             
         }
         catch(Exception e)
         {
            JOptionPane.showMessageDialog(null, "File not found.");
         }
      }
        
   }
   private class Key extends KeyAdapter
   {
      public void keyReleased(KeyEvent e)
      {
         if(e.getKeyCode()==KeyEvent.VK_RIGHT)
         {
            character.moveRight();
         }
         if(e.getKeyCode()==KeyEvent.VK_LEFT)
         {
            character.moveLeft();
         }
         if(e.getKeyCode()==KeyEvent.VK_UP)
         {
            shift();
            score++;
         }
      }
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(SettingsPanel.color);
         myBuffer.fillRect(0, 0, FRAMEx, FRAMEy);
          
         for(int x = 0; x<cars.size(); x++)
         {
            cars.get(x).move(FRAMEx);
         }
         
         for(int x = 0; x<roads.length; x++)
         {
            if(roads[x].getCounter()>1)
            {
               roads[x].setLanes(roads[x].getLanes()+1);
               roads[x].setCounter(roads[x].getCounter()-1);
               if(roads[x].getCounter()==2)
               {
                  int type = (int)(Math.random()*6);
                  int dir = (int)(Math.random()*2);
                  if(dir==0)
                  {
                     direction = true;
                  }
                  if(dir==1)
                  {
                     direction = false;
                  }
                  if(LevelPanel.theLevel==2&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.35);
                  }
                  if(LevelPanel.theLevel==2&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.35));
                  }
                  if(LevelPanel.theLevel==3&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.7);
                  }
                  if(LevelPanel.theLevel==3&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.7));
                  }
                  if(LevelPanel.theLevel==1&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.15);
                  }
                  if(LevelPanel.theLevel==1&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.15));
                  }
                  int numcars = ((int)((Math.random()*3)+1));
                  double position = 0;
                  for(int h = 0; h < numcars; h++)
                  {
                     cars.add(new VehicleC(position, ((roads[x].getY())+(shift*2)), 40, shift-5, direction, (int)(Math.random()*6), vehicledx));
                     position+=(FRAMEx/numcars);
                  }
               }
               else if(roads[x].getCounter()==1)
               {
                  int type = (int)(Math.random()*6);
                  int dir = (int)(Math.random()*2);
                  if(dir==0)
                  {
                     direction = true;
                  }
                  if(dir==1)
                  {
                     direction = false;
                  }
                  if(LevelPanel.theLevel==2&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.35);
                  }
                  if(LevelPanel.theLevel==2&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.35));
                  }
                  if(LevelPanel.theLevel==3&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.7);
                  }
                  if(LevelPanel.theLevel==3&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.7));
                  }
                  if(LevelPanel.theLevel==1&&direction==true)
                  {
                     vehicledx = ((Math.random()*.5)+.15);
                  }
                  if(LevelPanel.theLevel==1&&direction==false)
                  {
                     vehicledx = (-1*((Math.random()*.5)+.15));
                  }
                  int numcars = ((int)((Math.random()*3)+1));
                  double position = 0;
                  for(int h = 0; h < numcars; h++)
                  {
                     cars.add(new VehicleC(position, ((roads[x].getY())+shift), 40, shift-5, direction, (int)(Math.random()*6), vehicledx));
                     position+=(FRAMEx/numcars);
                  }
               }
               
               
               
            }
            if(roads[x].getY()>FRAMEy)
            {
               roads[x].setY(0);
               roads[x].setLanes(1);
               int counterRoad = (int)((Math.random()*3)+1);
               roads[x].setCounter(counterRoad);
               
               int type = (int)(Math.random()*6);
               int dir = (int)(Math.random()*2);
               if(dir==0)
               {
                  direction = true;
               }
               if(dir==1)
               {
                  direction = false;
               }
               if(LevelPanel.theLevel==1&&direction==true)
               {
                  vehicledx = ((Math.random()*1)+.5);
               }
               if(LevelPanel.theLevel==1&&direction==false)
               {
                  vehicledx = (-1*((Math.random()*1)+.5));
               }
               if(LevelPanel.theLevel==2&&direction==true)
               {
                  vehicledx = ((Math.random()*1.5)+.75);
               }
               if(LevelPanel.theLevel==2&&direction==false)
               {
                  vehicledx = (-1*((Math.random()*1.5)+.75));
               }
               if(LevelPanel.theLevel==3&&direction==true)
               {
                  vehicledx = ((Math.random()*1)+2);
               }
               if(LevelPanel.theLevel==3&&direction==false)
               {
                  vehicledx = (-1*((Math.random()*1)+2));
               }
               int numcars = ((int)((Math.random()*3)+1));
               double position = 0;
               for(int h = 0; h < numcars; h++)
               {
                  cars.add(new VehicleC(position, ((roads[x].getY())), 40, shift-5, direction, (int)(Math.random()*6), vehicledx));
                  position+=(FRAMEx/numcars);
               }
            }
         }
         
         
       
         
         
         
         for(int x = 0; x<roads.length; x++)
         {
            roads[x].draw(myBuffer);
         }        
         
      
         
         
         for(int x = 0; x<cars.size(); x++)
         {
            cars.get(x).draw(myBuffer);
         }
         for(int x = 0; x<cars.size(); x++)
         {
            if(cars.get(x).getY()>(character.getY()-5)-7&& cars.get(x).getY()<(character.getY()-5)+7)
            {
               collide(character, cars.get(x));
            }
         }
         myBuffer.setFont(new Font("Sepia", Font.BOLD, 30));
         myBuffer.setColor(Color.black);
         for(int x = 0; x<roads.length; x++)
         {
            if(roads[x].getLanes()==2||roads[x].getLanes()==3)
            {
               if(roads[x].getY()<40)
               {
                  myBuffer.setColor(Color.white);
               }
            }
            if(roads[x].getLanes()==1)
            {
               if(roads[x].getY()<55&&roads[x].getY()>20)
               {
                  myBuffer.setColor(Color.white);
               }
            }
         }
         myBuffer.drawString("Score: " + score, 150, 50);
      
         character.draw(myBuffer);        
       
                            
         repaint(); 
      }
   } 
   public void shift()
   {
      for(int x = 0; x<cars.size(); x++)
      {
         cars.get(x).setY(cars.get(x).getY()+shift);
      }
      
         
         
         
      for(int x = 0; x<roads.length; x++)
      {
         roads[x].setY(roads[x].getY()+shift);
      }
     
      
   
   }
   private void collide(Character chara, VehicleC vehic)
   {
      double d = distance((chara.getX()+(chara.getWidth()/2.0)), (chara.getY()+(chara.getHeight()/2.0)), (vehic.getX()+(vehic.getWidth()/2.0)), (vehic.getY()+(vehic.getHeight()/2.0)));
      if( d <= ((chara.getWidth()/2.0) + (vehic.getWidth()/2.0))-5)
      { 
         if(SettingsPanel.mute1==0)
         {
            clip.stop();
         }
      
         t.stop();
         gameFrame.setVisible(false);
         //show content frame, or make a new one if it doesn't exist yet
         if(eogFrame == null)
         {
            eogFrame = new JFrame("End of Game");
            eogFrame.setVisible(true);
            eogFrame.setLocation(700,200);
            eogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            eogFrame.setContentPane(new EOGPanel(menuFrame, gameFrame, eogFrame));//content panel needs to know the frames!
            eogFrame.setSize(400,450);  
         }            
         else
            eogFrame.setVisible(true); 
      
        
      
      }
   }
   
  
 
   private double distance(double x1, double y1, double x2, double y2)
   {
      return(Math.sqrt ((Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2))));	 // enter the calculation here.
   }
}