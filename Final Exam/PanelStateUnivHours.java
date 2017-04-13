import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class PanelStateUnivHours extends JPanel
{
    
   public DisplayStateUnivHours display;
   public JPanel panel;
   public Scanner infile;
   public  static int credit, number2, total2, numitems, number;
   public static Hours[] myArray; 
   private static String first, last, type, graduate, warning;
   public PanelStateUnivHours()
   {
      number = total2 = 0;
      setLayout(new BorderLayout());
      
      display = new DisplayStateUnivHours();
      add(display);
         
     input("stateUniversity.txt"); 
     sort(myArray); 
      
      
   }
   
     public Hours[] input(String filename) 
   { 
      myArray = null; 
      try 
      {  
         infile = new Scanner(new File(filename)); 
         numitems = Integer.parseInt(infile.nextLine()); 
         myArray = new Hours[numitems]; 
         for(int x = 0; x < numitems; x++) 
         { 
            last = infile.nextLine(); 
            first = infile.nextLine(); 
            credit = Integer.parseInt(infile.nextLine()); 
            type = infile.nextLine();
            graduate = infile.nextLine();
            if(credit < 12) 
            {
               warning = "Need more credit hours";
               myArray[x] = new StudentHoursLessThan12(last, first, credit, type, graduate,warning); 
               }
            else if(credit <= 21 && credit >= 12) 
            {
               warning = "";
               myArray[x] = new StudentHours12to21(last, first, credit, type, graduate,warning); 
               }
            else 
            {
               warning = "Credit hours exceeded";
               myArray[x] = new StudentHoursGreaterThan21(last, first, credit, type, graduate,warning); 
               }
         } 
      } 
      catch(FileNotFoundException e) 
      { 
         System.out.println("Sorry, this file wasn't found"); 
      
      } 
      return myArray; 
   } 
    
   public static void sort(Hours[] array) 
   { 
      int maxPos; 
      for(int k = 0; k < array.length; k++) 
      { 
         maxPos = findMax(array, array.length - k); 
         swap(array, maxPos, array.length - k - 1); 
      } 
   } 
    
   public static int findMax(Hours[] array, int upper)  
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
     
   public static void swap(Hours[] array, int a, int b) 
   { 
      Hours temp = array[a]; 
      array[a] = array[b]; 
      array[b] = temp; 
   } 
  
   
}