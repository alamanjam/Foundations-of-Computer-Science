import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class DisplayStateUnivHours extends JPanel
{
   public static JLabel label, lname, fname, cred, room, grad, warn, fees, total;
   public JPanel panel, panel1;
   public Scanner infile;
   public static JButton next, quit;
   public  static int credit, number2, total2, numitems, number;
   public static JTextField lname1, fname1, cred1, room1, grad1, warn1, fees1, total1;
   private static String first, last, type, graduate, warning;
   public static Hours[] myArray; 
     
   public DisplayStateUnivHours()
   {
      setLayout(new BorderLayout());
      
      Font font = new Font("Serif", Font.BOLD, 20);
      label = new JLabel("State University", SwingConstants.CENTER);
      label.setFont(font);
      add(label, BorderLayout.NORTH);
      
      panel = new JPanel(new GridLayout(8, 2));
      add(panel, BorderLayout.CENTER);
      
      Font font1 = new Font("Serif", Font.PLAIN, 20);
      
      lname = new JLabel("Last Name: ", SwingConstants.LEFT);
      lname.setFont(font);
      panel.add(lname);
      
      lname1 = new JTextField(15);
      lname1.setFont(font1);
      lname1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(lname1);
   
      
      fname = new JLabel("First Name: ", SwingConstants.LEFT);
      fname.setFont(font);
      panel.add(fname);
      
      fname1 = new JTextField(15);
      fname1.setFont(font1);
      fname1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(fname1);
      
      cred = new JLabel("Credit Hours: ", SwingConstants.LEFT);
      cred.setFont(font);
      panel.add(cred);
      
      cred1 = new JTextField(15);
      cred1.setFont(font1);
      cred1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(cred1);
      
      room = new JLabel("Room Type: ", SwingConstants.LEFT);
      room.setFont(font);
      panel.add(room);
      
      room1 = new JTextField(15);
      room1.setFont(font1);
      room1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(room1);
      
      grad = new JLabel("Graduating: ", SwingConstants.LEFT);
      grad.setFont(font);
      panel.add(grad);
      
      grad1 = new JTextField(15);
      grad1.setFont(font1);
      grad1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(grad1);
      
      warn = new JLabel("Warning: ", SwingConstants.LEFT);
      warn.setFont(font);
      panel.add(warn);
      
      warn1 = new JTextField(15);
      warn1.setFont(font1);
      warn1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(warn1);
      
      fees = new JLabel("Fees: ", SwingConstants.LEFT);
      fees.setFont(font);
      panel.add(fees);
      
      fees1 = new JTextField(15);
      fees1.setFont(font1);
      fees1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(fees1);
      
      total = new JLabel("Total Fees: ", SwingConstants.LEFT);
      total.setFont(font);
      panel.add(total);
      
      total1 = new JTextField(15);
      total1.setFont(font1);
      total1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(total1);
             
      panel1 = new JPanel(new FlowLayout());
      add(panel1, BorderLayout.SOUTH);
       
      next = new JButton("Next");
      next.addActionListener( new nextListener());
      panel1.add(next);
      
      quit = new JButton("Quit");
      quit.addActionListener( new quitListener());
      panel1.add(quit);
     

 
   }   
     private class nextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         goNext();
         if(number>=PanelStateUnivHours.numitems)
         next.setEnabled(false);
      }
   }
      private class quitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }

   public static void goNext() 
   { 
      lname1.setText(PanelStateUnivHours.myArray[number].getLastName()); 
      fname1.setText(PanelStateUnivHours.myArray[number].getFirstName()); 
      cred1.setText("" + PanelStateUnivHours.myArray[number].getCreditHours()); 
      room1.setText("" + PanelStateUnivHours.myArray[number].getRoomType()); 
      grad1.setText("" + PanelStateUnivHours.myArray[number].getGraduating());
      warn1.setText("" + PanelStateUnivHours.myArray[number].getWarning());
      fees1.setText("$" + PanelStateUnivHours.myArray[number].getFees() + "0");
      total2 += PanelStateUnivHours.myArray[number].getFees(); 
      total1.setText("$" + total2 + ".00"); 
      number++; 
   }
}