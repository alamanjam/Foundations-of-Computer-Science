 //name:    date:  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Driver04
{
   
   public static void main(String[] args) 
   {
   Scanner infile = null;
   
   try
   {
      String filename = JOptionPane.showInputDialog("Enter filename");
      infile = new Scanner( new File(filename) );
   }
   catch(FileNotFoundException e)
   {
     JOptionPane.showMessageDialog(null, "Error: File not found.");                    
     System.exit(0);
   }
      
                               
      int first = infile.nextInt();
       double[] array = new double[first];
        for(int x = 0; x < first; x++)
      {
           array[x] = infile.nextDouble();
      }
      infile.close();
      double sum = 0.0;
      for(int x = 0; x < first; x++)
      {
      sum += array[x];
      }
      double avg = sum/first;
      
      double min = array[0];
      double max = array[0];
      
      for(int x = 1; x < first; x++)
      {
      min = Math.min(min, array[x]);
      max = Math.max(max, array[x]);
      }
       System.out.println("Sum :"+sum);  
       System.out.println("Avg :"+avg);
       System.out.println("Min :"+min);  
       System.out.println("Max :"+max);
   }

   }

/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477

*************************************/