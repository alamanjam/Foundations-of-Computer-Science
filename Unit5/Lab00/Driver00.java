import java.io.*;        //the File class
import java.util.*;      //the Scanner class
public class Driver00
{
   public static void main(String[] args) throws Exception
   {
      Scanner infile = new Scanner(new File("data.txt"));
      int numitems = infile.nextInt();
      double[] array = new double[numitems];
      for(int k = 0; k < numitems; k++)
         array[k] = infile.nextDouble();
      infile.close();
      int minPos, maxPos;
      minPos = findMin(array);
      maxPos = findMax(array);
      System.out.println("Minimum value: " + array[minPos]);
      System.out.println("Maximum value: " + array[maxPos]);
   }


   private static int findMin(double[] apple)
   {
      int index = 0;
      for (int k = 1; k < apple.length; k++) {
         if (apple[index] > apple[k]) {
            index = k;
         }
      }
      return index;
   }
   private static int findMax(double[] banana)
   {
        int pos = 0;
      for (int k = 1; k < banana.length; k++) {
         if (banana[pos] < banana[k]) {
            pos = k;
         }
      }
      return pos;
   }   
   }
