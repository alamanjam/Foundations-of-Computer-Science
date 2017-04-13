// Kevin Chaplin 7-21-14
// For Summer CompSci 2014
public class PrimeWorking
{
   public static void main(String[] args)
   {
   	// try out different numbers
      final int START = 0;
      final int END = 40;
      for(int k = START; k <= END; k++)
      {
         if(isPrime(k))
            System.out.println(k + " is prime.");
         else
            System.out.println(k + " isn't prime.");
      }
   }
   public static boolean isPrime(int x)
   {
      if(x == 1||x==0)
         return false;
      for(int j = 2; j < x; j++)
      {
         if(x % j == 0)
         {
            return false;
            }
            }
      return true;
   }
}