	//Name______________________________ Date_____________
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver05
{
   public static void main(String[] args) throws Exception
   {
      Comparable[] array = input("data.txt");
      sortMin(array);
      output(array, "output.txt");
   }
   	
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new Distance[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k]=new Distance(infile.nextInt(),infile.nextInt());
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
   public static void sortMin(Comparable[] array)
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k);
         swap(array, minPos, array.length - k - 1);
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
   
   
   public static int findMin(Comparable[]array,int upper)
   
   {
      int index=0;
      for(int x=0 ;x<upper;x++)
      {
         if(array[index].compareTo(array[x])>0)
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