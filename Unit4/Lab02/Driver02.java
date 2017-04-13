   //Name______________________________ Date_____________
   import java.util.Scanner;
    public class Driver02
   {
      public static final int NUMITEMS = 15;
 
       public static void main(String[] args)
      {
        double[] farray = new double[NUMITEMS];
        Scanner keyboard = new Scanner(System.in);
        
         for(int x = 0; x <10;x++)
      {
         System.out.print("#" + (x+1) + " - Degrees Fahrenheit:  ");
         farray[x] = keyboard.nextDouble();
      }
      
      for(int x=10; x<15;x++)
      {
      farray[x] = ((int)(Math.random() * 10000.0) / 10.0);
      System.out.println("#" + (x + 1) + " - Degrees Fahrenheit: " + farray[x]);
      }
      double d = 0.00;
      double [] celsius = new double [15];

      for(int x = 0; x < NUMITEMS; x++)
      {
      celsius[x]=((farray[x] - 32.0) * (5.0 / 9.0)); 
      }
      System.out.println("\nFahrenheit\t| Celsius");
    System.out.println("----------------|----------------");
       for (int x = 0; x < 15; x++) {
      System.out.println(farray[x] + "\t\t| " + celsius[x]);
    }   }
   }