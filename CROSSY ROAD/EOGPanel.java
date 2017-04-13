import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;


public class EOGPanel extends JPanel
{

   JFrame menuFrame, gameFrame, eogFrame;
   private JPanel panel, panel2, panel3;
   private static Color BACKGROUND = new Color(105, 206, 236);
   private JLabel label, label2, label3;
   private JButton confirm, back, quit, play;
   private JTextField name;
   public static ArrayList<Player> list = new ArrayList<Player>();
   public static ArrayList<Player> mlist = new ArrayList<Player>();
   public static ArrayList<Player> hlist = new ArrayList<Player>();
   public EOGPanel(JFrame m, JFrame f, JFrame fr)
   {
      menuFrame=m;
      gameFrame=f;
      eogFrame=fr;
      setLayout(new BorderLayout());
      //setBackground(BACKGROUND);
      Font font = new Font("Monospaced", Font.BOLD, 25);
      
      label = new JLabel("\nYour Score was: " +GamePanel.score, SwingConstants.CENTER);
      label.setFont(font);
      add(label, BorderLayout.NORTH);
      
      panel2 = new JPanel();
      panel2.setLayout(new GridLayout(4,1));
      add(panel2, BorderLayout.CENTER);
      //panel2.setBackground(BACKGROUND);
      Font font2 = new Font("Monospaced", Font.BOLD, 30);
      label2 = new JLabel("Enter Name: ", SwingConstants.CENTER);
      label2.setFont(font2);
      panel2.add(label2);
      
     
      name = new JTextField();
      name.setDocument(new JTextFieldLimit(15));
      name.setForeground(Color.BLACK);
      name.setColumns(10);
      name.setFont(font);
      name.setHorizontalAlignment(SwingConstants.CENTER);
      panel2.add(name);
      
      
      label3 = new JLabel("");
      label3.setFont(font2);
      panel2.add(label3);
      
      
      panel3 = new JPanel(new FlowLayout());
      //panel3.setBackground(BACKGROUND);
      panel2.add(panel3);
      
      confirm = new JButton("Save Score");
      confirm.addActionListener(new conListener());
      confirm.setFont(font);
      panel3.add(confirm);
      
      
      Font font1 = new Font("Monospaced", Font.BOLD, 20);
    
      
      
      JPanel panel3 = new JPanel(new FlowLayout());
      //panel3.setBackground(BACKGROUND);
      add(panel3, BorderLayout.SOUTH);
      
      quit = new JButton("Quit");
      quit.addActionListener(new quitListener());
      quit.setFont(font1);
      panel3.add(quit);
      
      play = new JButton("Play Again");
      play.addActionListener(new playListener());
      play.setFont(font1);
      panel3.add(play);
      
     
      
   }
   private class conListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
         
         if(LevelPanel.theLevel==1)
         {
            list.clear();
            Scanner infile = null;
            try
            {
               infile = new Scanner(new File("easyprofiles.txt"));
            }
            catch(FileNotFoundException f)
            {
               JOptionPane.showMessageDialog(null, "The file could be found");
               System.exit(0);
            }
            while(infile.hasNext())
            {
               String s = infile.nextLine();
               String[] array= s.split(": ");
               list.add(new Player(array[0], Integer.parseInt(array[1])));
            }
         
            String s = (name.getText());
            if(!s.equals(""))
            {
            
               Player p = new Player(s, GamePanel.score);
               list.add(p);
               PrintWriter pw = null;
               try      
               {
                  pw = new PrintWriter("easyprofiles.txt");
                  for(int x = 0;x<list.size()-1;x++)
                  {
                     pw.println(list.get(x).toString());
                  }
                  pw.println(list.get(list.size()-1).toString());
               
               }
               catch (IOException d) {
                  System.out.println(d);
               }
               finally{
                  pw.close();
               }
               confirm.setEnabled(false);
            }
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter a valid name to save");
            }
         }
         if(LevelPanel.theLevel==2)
         { 
            mlist.clear();
            Scanner infile = null;
            try
            {
               infile = new Scanner(new File("medprofiles.txt"));
            }
            catch(FileNotFoundException f)
            {
               JOptionPane.showMessageDialog(null, "The file could be found");
               System.exit(0);
            }
            while(infile.hasNext())
            {
               String s = infile.nextLine();
               String[] array= s.split(": ");
               mlist.add(new Player(array[0], Integer.parseInt(array[1])));
            }
         
            String s = (name.getText());
            if(!s.equals(""))
            {
            
               Player p = new Player(s, GamePanel.score);
               mlist.add(p);
               PrintWriter pw = null;
               try      
               {
                  pw = new PrintWriter("medprofiles.txt");
               
                  for(int x = 0;x<mlist.size()-1;x++)
                  {
                     pw.println(mlist.get(x).toString());
                  }
                  pw.println(mlist.get(mlist.size()-1).toString());               
               
               }
               catch (IOException d) {
                  System.out.println(d);
               }
               finally{
                  pw.close();
               }
               confirm.setEnabled(false);
            }
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter a valid name to save");
            }
         
         } 
         
         if(LevelPanel.theLevel==3)
         {  
            hlist.clear();
            Scanner infile = null;
            try
            {
               infile = new Scanner(new File("hardprofiles.txt"));
            }
            catch(FileNotFoundException f)
            {
               JOptionPane.showMessageDialog(null, "The file could not be found");
               System.exit(0);
            }
            while(infile.hasNext())
            {
               String s = infile.nextLine();
               String[] array= s.split(": ");
               hlist.add(new Player(array[0], Integer.parseInt(array[1])));
            }
         
            String s = (name.getText());
            if(!s.equals(""))
            {
               Player p = new Player(s, GamePanel.score);
               hlist.add(p);
               PrintWriter pw = null;
               try      
               {
                  pw = new PrintWriter("hardprofiles.txt");
                  for(int x = 0;x<hlist.size()-1;x++)
                  {
                     pw.println(hlist.get(x).toString());
                  }
                  pw.println(hlist.get(hlist.size()-1).toString());
               
               
               }
               catch (IOException d) 
               {
                  System.out.println(d);
               }
               finally
               {
                  pw.close();
               
               }
               confirm.setEnabled(false);
            }
            else 
            {
               JOptionPane.showMessageDialog(null,"Enter a valid name to save");
            }
         
         
               
         }
         
      } 
   }
   
   private class quitListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
      
         eogFrame.setVisible(false);
        
         int reply = JOptionPane.showConfirmDialog(null, "Are you sure you would like to quit?", "Quit?" , JOptionPane.YES_NO_OPTION);
      
         if (reply == JOptionPane.YES_OPTION) 
         {
            System.exit(0);
         }
         else {
            eogFrame.setVisible(true);
         }
      
      }
   }
   private class playListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
         gameFrame.setVisible(false);
         eogFrame.setVisible(false);
         menuFrame.setVisible(false);
         if(menuFrame == null)
         {
            menuFrame = new JFrame("Game Options");
            menuFrame.setVisible(true);
            menuFrame.setLocation(700,200);
            menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menuFrame.setContentPane(new MenuPanel());//menu panel needs to know the frames!
            menuFrame.setSize(400,450);  
         }            
         else
         {
            GamePanel.score=0;
            LevelPanel.theLevel = 0;
            menuFrame.setVisible(true); 
         }
      
      
      }
   }
}