import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver06
{
   public static void main(String[] args) throws Exception
   {
      Comparable[] array = input("data.txt");
      sortMax(array);
      output(array, "output.txt");
   }
   	
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new String[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k]=new String(infile.next());
      }
      infile.close();
      return array;
   }
      
   public static void output(Object[]array, String filename) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int k = 0; k < array.length; k++)
         System.out.println(array[k].toString());
   }
      
   public static void sortMax(Comparable[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(Comparable[]array,int upper)
   {
      
      int index=0;
      for(int x=0 ;x<upper;x++)
      {
         if(array[index].compareTo(array[x])<0)
         {
            index=x;
         }
      }
      
      return index;
         
   }
   public static void swap(Comparable[]array,int a, int b)
   {
      Comparable temp= array[a];
      array[a]=array[b];
      array[b]=temp;
   }

}