import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class DisplaySampleYard extends JPanel
{
   public static JLabel label, lname, fname, size, cost, total;
   public JPanel panel;
   public Scanner infile;
   public  static int size2, number2, total2, numitems, number;
   public static JTextField lname1, fname1, size1, cost1, total1;
   private static String first, last;
   public static Yard[] myArray; 
     
   public DisplaySampleYard()
   {
      number = total2 = 0;
      setLayout(new BorderLayout());
      
      Font font = new Font("Serif", Font.BOLD, 20);
      label = new JLabel("Green Grow Mowing Company", SwingConstants.CENTER);
      label.setFont(font);
      add(label, BorderLayout.NORTH);
      
      panel = new JPanel(new GridLayout(5, 2));
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
      
      size = new JLabel("Lawn Size: ", SwingConstants.LEFT);
      size.setFont(font);
      panel.add(size);
      
      size1 = new JTextField(15);
      size1.setFont(font1);
      size1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(size1);
      
      cost = new JLabel("Total Cost: ", SwingConstants.LEFT);
      cost.setFont(font);
      panel.add(cost);
      
      cost1 = new JTextField(15);
      cost1.setFont(font1);
      cost1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(cost1);
      
      total = new JLabel("Running Total: ", SwingConstants.LEFT);
      total.setFont(font);
      panel.add(total);
      
      total1 = new JTextField(15);
      total1.setFont(font1);
      total1.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(total1);
      
      input("greenGrow.txt"); 
      sort(myArray); 
   }
   public Yard[] input(String filename) 
   { 
      myArray = null; 
      try 
      {  
         infile = new Scanner(new File(filename)); 
         numitems = Integer.parseInt(infile.nextLine()); 
         myArray = new Yard[numitems]; 
         for(int x = 0; x < numitems; x++) 
         { 
            last = infile.nextLine(); 
            first = infile.nextLine(); 
            size2 = Integer.parseInt(infile.nextLine()); 
            if(size2 <= 10000) 
               myArray[x] = new CustomerSmallYard(last, first, size2); 
            else if(size2 <= 20000) 
               myArray[x] = new CustomerMediumYard(last, first, size2); 
            else 
               myArray[x] = new CustomerLargeYard(last, first, size2); 
         } 
      } 
      catch(FileNotFoundException e) 
      { 
         System.out.println("Sorry, this file wasn't found"); 
      
      } 
      return myArray; 
   } 
    
   public static void sort(Yard[] array) 
   { 
      int maxPos; 
      for(int k = 0; k < array.length; k++) 
      { 
         maxPos = findMax(array, array.length - k); 
         swap(array, maxPos, array.length - k - 1); 
      } 
   } 
    
   public static int findMax(Yard[] array, int upper)  
   { 
      int index = 0; 
      for(int x = 0; x < upper; x++) 
      { 
         if(array[x].compareTo(array[index]) > 0) 
         { 
            index = x; 
         } 
      } 
      return index; 
   } 
     
   public static void swap(Yard[] array, int a, int b) 
   { 
      Yard temp = array[a]; 
      array[a] = array[b]; 
      array[b] = temp; 
   } 
     
   public static void goNext() 
   { 
      lname1.setText(myArray[number].getLastName()); 
      fname1.setText(myArray[number].getFirstName()); 
      size1.setText("" + myArray[number].getSize()); 
      cost1.setText("$" + myArray[number].getCost() + "0"); 
      total2 += myArray[number].getCost(); 
      total1.setText("$" + total2 + ".00"); 
      number++; 
   }
}