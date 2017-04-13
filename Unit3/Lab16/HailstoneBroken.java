//Name______________________________ 
public class HailstoneBroken
{
 // Uses the Hailstone Sequence from Lab03.
   public static void main(String[] args)
   {
      int longestchain = 0;
      long numwithlongchain = 0;
      
      // Generate the hailstone sequence for
      // numbers between 1 and 100.  Count the
      // sequence (the chain length) until the 
      // sequence reaches 1.
      for (int hs = 1; hs <= 100; hs++)
      {
         int chain = (int)calcchain(hs);
      
         System.out.print("Hailstone number " + hs);  
         System.out.println(" chain " + chain);
      }
   }
   	 // calculates the chain length of the 
       // hailstone number (beginval)
   private static long calcchain (int beginval)
   {
      int chainlength = 1;
      long hailstoneValue = beginval;
      while (hailstoneValue != 1)
      {
         chainlength++;
         
         if((hailstoneValue % 2) == 0)
            hailstoneValue = hailstoneValue / 2;
         else hailstoneValue = 3 * hailstoneValue + 1;
      }
      return chainlength;   
   }   
}