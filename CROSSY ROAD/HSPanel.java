/**
 * JFrame demo class
 *
 * Last update: July 17, 2015
 *
 * @author Nate Foss
 * @version 2.1
 */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class HSPanel extends JPanel
{

   JFrame menuFrame, contentFrame, hsFrame;
   private JPanel panel;
   private JLabel label;
   private JButton c, level, back, start, easy, medium, hard;
   public static JTextPane label2;
   public HSPanel(JFrame f, JFrame hs)
   {
      menuFrame = f;          
      hsFrame = hs;
         
      setLayout(new BorderLayout());
      
      Font fon = new Font("Monospaced", Font.BOLD, 40);
   
      JLabel label = new JLabel("High Scores", SwingConstants.CENTER);
      label.setFont(fon);
      add(label, BorderLayout.NORTH);
      
      
               
      SimpleAttributeSet aSet = new SimpleAttributeSet(); 
     
   
      SimpleAttributeSet bSet = new SimpleAttributeSet();
      StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_CENTER);
      StyleConstants.setUnderline(bSet, false);
      StyleConstants.setFontFamily(bSet, "monospaced");
      StyleConstants.setBold(bSet, true);
      StyleConstants.setFontSize(bSet, 24);
      
      label2 = new JTextPane();
      label2.setEditable(false);
      label2.setOpaque(false);
      
      StyledDocument doc = label2.getStyledDocument();
      doc.setCharacterAttributes(105, doc.getLength()-105, aSet, false);
      doc.setParagraphAttributes(0, 104, bSet, false);
      
    
      add(label2, BorderLayout.CENTER);
      Font font = new Font("Monospaced", Font.BOLD, 20);
      
      JPanel panel2 = new JPanel(new GridLayout(2,3));
      add(panel2, BorderLayout.SOUTH);
      
      easy = new JButton("Easy");
      easy.addActionListener(new easyListener());
      easy.setFont(font);
      panel2.add(easy);
      
      medium = new JButton("Medium");
      medium.addActionListener(new medListener());
      medium.setFont(font);
      panel2.add(medium);
      
      hard = new JButton("Hard");
      hard.addActionListener(new hardListener());
      hard.setFont(font);
      panel2.add(hard);
      
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      panel2.add(back);
   }      
         
      
   
   
   
   private class easyListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
      
         try{
            ArrayList<Player> list1 = input("easyprofiles.txt"); 
            sort(list1, new ByScore());
            label2.setText("");
            for(int x = 0; x < 10;x++)
            {
               label2.setText(label2.getText() + list1.get(x).toString()+ "\n");
            }    
         
         
         }
         catch(Exception j)
         {
            JOptionPane.showMessageDialog(null, "File could not be Found");
         }
      
      
      }
   }
   
   private class medListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         try{
            ArrayList<Player> list2 = input("medprofiles.txt"); 
            sort(list2, new ByScore());
            label2.setText("");
            for(int x = 0; x < 10;x++)
            {
               label2.setText(label2.getText() + list2.get(x).toString()+ "\n");
            }    
         
         
         }
         catch(Exception j)
         {
            JOptionPane.showMessageDialog(null, "File could not be Found");
         }
      
         
      }
   }

   private class hardListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         try{
            ArrayList<Player> list3 = input("hardprofiles.txt"); 
            sort(list3, new ByScore());
            label2.setText("");
            for(int x = 0; x < 10;x++)
            {
               label2.setText(label2.getText() + list3.get(x).toString()+ "\n");
            }    
         
         
         }
         catch(Exception j)
         {
            JOptionPane.showMessageDialog(null, "File could not be Found");
         }
      
      
      }
   }

      
   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         menuFrame.setVisible(true);
         hsFrame.dispose();  
      }
   }
   public static ArrayList<Player> input(String filename) throws Exception
   {
      Scanner infile = null;
      
      infile = new Scanner(new File(filename));
      
     
      ArrayList<Player>list=new ArrayList<Player>();
      while(infile.hasNext())
      {
         String s = infile.nextLine();
         String[] array= s.split(": ");
         list.add(new Player(array[0], Integer.parseInt(array[1])));
      }
      
      return list;     
   }
   public static int findMax(ArrayList<Player> list, int upper, Comparator c)
   {
      int max = 0;
      for(int x = 0; x<upper; x++)
      {
         if(c.compare(list.get(x),list.get(max))<0)
         {
            max=x;
         }
      }
      return max;
   
   }
   public static void swap(ArrayList<Player> list, int a, int b)
   {
      Player temp = list.get(b);
      list.set(list.indexOf(list.get(b)), list.get(a));
      list.set(list.indexOf(list.get(a)),temp);
   }
   public static void sort(ArrayList<Player> list, Comparator c)
   {
      for(int k=0;k<list.size();k++)
      {
         int maxPos = findMax(list, list.size()-k, c);
         swap(list, maxPos, list.size()-k-1);
      }
   }
}
