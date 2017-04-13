import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class ProfPanel extends JPanel
{

   JFrame contentFrame, profileFrame;
   private JPanel panel, panel2;
   private JLabel label, label2, label3;
   private JButton confirm, back;
   private JTextField name;
   public static ArrayList<Player> list = new ArrayList<Player>();
      
   public ProfPanel(JFrame f, JFrame fr)
   {
      contentFrame = f;
      profileFrame = fr;
     
      setLayout(new BorderLayout());
     
      Font font = new Font("Monospaced", Font.BOLD, 40);
   
      label = new JLabel("Enter Name:", SwingConstants.CENTER);
      label.setFont(font);
      add(label, BorderLayout.NORTH);
     
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel, BorderLayout.CENTER);
      
       JPanel panel2 = new JPanel();
      panel2.setLayout(new GridLayout(3,1));
      add(panel2, BorderLayout.CENTER);
      
      label2 = new JLabel("");
      label2.setFont(font);
      panel2.add(label2);
      
           
      name = new JTextField("", 10);
      name.setColumns(10);
      name.setFont(font);
      name.setHorizontalAlignment(SwingConstants.CENTER);
      panel2.add(name);
      
       label3 = new JLabel("");
      label3.setFont(font);
      panel2.add(label3);
      
 
      confirm = new JButton("Confirm");
      confirm.addActionListener(new conListener());
      confirm.setFont(font);
      add(confirm, BorderLayout.SOUTH);
   }
   private class conListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
      
      String s = (name.getText());
      Player p = new Player(s, 0);
      list.add(p);
       PrintWriter pw = null;
       try      
       {
       pw = new PrintWriter("profiles.txt");
       for(int x = 0; x<list.size();x++)
       {
       pw.println(list.get(x).toString());
       }
       
       }
       catch (IOException d) {
      System.out.println(d);
     }
      finally{
      pw.close();
      }
      profileFrame.setVisible(false);
      contentFrame.setVisible(true);
   }
 }      
       private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
      
      }
   }

}
