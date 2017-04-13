import java.util.Scanner;
public class Driver01
{
   public static final int NUMITEMS = 10;
   public static void main(String[] args)
   {
      double[] array = new double[NUMITEMS];
      Scanner keyboard = new Scanner(System.in);
      for(int x = 0; x < NUMITEMS; x++)
      {
         System.out.print("#" + (x+1) + ":  ");
         array[x] = keyboard.nextDouble();
      }
      
     
      
      double min = array[0];
      double max = array[0];
      double sum = 0.0;
      for(int x = 0; x < array.length; x++)
      {
      sum += array[x];

      min = Math.min(min, array[x]);
      max = Math.max(max, array[x]);
      }
      double avg = sum/array.length;
       System.out.println("Sum :"+sum);  
       System.out.println("Avg :"+avg);
       System.out.println("Min :"+min);  
       System.out.println("Max :"+max);
   }
   
}
