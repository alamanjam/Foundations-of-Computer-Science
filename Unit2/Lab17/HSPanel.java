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
   private JLabel label, label2;
   private JButton c, level, back, start;
   private int clickCount;
   private static Color BACKGROUND = new Color(105, 206, 236);
   private ArrayList<String>listOfStrings;
   private String[]stri;
   public HSPanel(JFrame f, JFrame hs)
   {
      menuFrame = f;          
      hsFrame = hs;
      ArrayList<Player> list1 = input("profiles.txt"); 
      sort(list1, new ByScore());
   
      setLayout(new BorderLayout());
      setBackground(BACKGROUND);
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
   
      JTextPane label2 = new JTextPane();
      label2.setBackground(BACKGROUND);
      label2.setEditable(false);
   
      StyledDocument doc = label2.getStyledDocument();
      doc.setCharacterAttributes(105, doc.getLength()-105, aSet, false);
      doc.setParagraphAttributes(0, 104, bSet, false);
      
      for(int x = 0; x<9;x++)
      {
      
         label2.setText(label2.getText() + list1.get(x).toString()+ "\n");
      
      }
      add(label2, BorderLayout.CENTER);
      Font font = new Font("Monospaced", Font.BOLD, 20);
      
               
      back = new JButton("Back");
      back.addActionListener(new backListener());
      back.setFont(font);
      add(back, BorderLayout.SOUTH);
   }      
         
      
   
   
    
   private class backListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         menuFrame.setVisible(true);
         hsFrame.setVisible(false);  
      }
   }
   public static ArrayList<Player> input(String filename)
   {
      Scanner infile = null;
      try
      {
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, "The file could be found");
         System.exit(0);
      }
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
   }}
