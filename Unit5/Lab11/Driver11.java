//Name______________________________ Date_____________
 
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Driver11
{
   public static int y;
   public static int power(int base, int exp)
   {
      if(exp==1)
      {
         return (int)Math.pow(base, exp);
      }
      else 
      
         return base*(int)Math.pow(base, exp-1);
      
   }
   public static int factorial(int n)
   {
      if(n==1) 
      
         return 1;
      
      else 
      
         return n * factorial(n-1);
                                        
     
   }
   public static int fib(int n)
   {
      if(n == 1 || n == 2){
         return 1;
      }
   
      return fib(n-1) + fib(n -2); 
   }   
   public static int gcd(int a, int b)
   {
      
      if (b == 0){
         return a;
      }
      else 
      {
         return gcd(b, a % b);
      }
   }  
 
   public static String isPal(String s)
   {       
    
      if(s.length() == 0 || s.length() == 1)
         return "Yes" ; 
      if(s.charAt(0) == s.charAt(s.length()-1))
      
         return isPal(s.substring(1, s.length()-1));
      else
         return "Nope";
   }
   public static boolean isSuperPrime(int h)
   {
      int[]primes=new int[2];
      for(int x = 2;x <=h;x++)
      {
         if(isPrime(x))
         {
            primes[primes.length-1]=x;
            primes=Arrays.copyOf(primes, primes.length+1);
         }
      }
      for(int x=0;x<primes.length;x++)
      {
         if(primes[x]==h)
         {
            y = x;
         }
      }
      if(isPrime(y))
      {
         return true;
      }
      return false;
   }
   public static boolean isPrime(int n)
   {
      for(int i=2;i<=Math.sqrt(n);i++) {
         if(n%i==0)
            return false;
      }
      return true;
   }
   public static void main(String[] args)
   {
      int choice = 0, a, b;
      while(choice != 6)
      {
         String message = "";
         message = message + "\n1. Find powers.";
         message = message + "\n2. Find factorials.";
         message = message + "\n3. Find Fibonacci numbers.";
         message = message + "\n4. Find a greatest common divisor (GCD).";
         message = message + "\n5. Check if a word is a palindrome";
         message = message + "\n6. Check if a number is a superprime";
         message = message + "\n7. Quit.";
         choice = Integer.parseInt(JOptionPane.showInputDialog(message));
         switch(choice)
         {
            case 1: 
               a = Integer.parseInt(JOptionPane.showInputDialog("Enter base:"));
               b = Integer.parseInt(JOptionPane.showInputDialog("Enter exponent:"));
               JOptionPane.showMessageDialog(null, 
                                    a + "^" + b + " = " + power(a, b));
               break;
            case 2: 
               a = Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
               JOptionPane.showMessageDialog(null, 
                                    "factorial(" + a + ") = " + factorial(a) );
               break;
            case 3: 
               a = Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
               JOptionPane.showMessageDialog(null, 
                                    "fib(" + a + ") = " + fib(a) );
               break;
            case 4: 
               a = Integer.parseInt(JOptionPane.showInputDialog("First number:"));
               b = Integer.parseInt(JOptionPane.showInputDialog("Second number:"));
               JOptionPane.showMessageDialog(null, 
                                    "gcd(" + a + ", " + b + ") = " + gcd(a, b));
               break;
            case 5: 
               String s  = JOptionPane.showInputDialog("Word:");
               JOptionPane.showMessageDialog(null, ("Is "+ s + " a palindrome? "+ isPal(s)) );
               break;
            case 6: 
               int d  = Integer.parseInt(JOptionPane.showInputDialog("Number:"));
               if(isSuperPrime(d)==true)
               {
               JOptionPane.showMessageDialog(null, d+" is a superprime" );
               }
                 if(isSuperPrime(d)==false)
               {
               JOptionPane.showMessageDialog(null, d+" is not a superprime" );
               }
               break;
         
            case 7: 
               JOptionPane.showMessageDialog(null, "Bye-bye!");
               System.exit(0);
            default: 
               JOptionPane.showMessageDialog(null, "Not a valid selection.");
               break;
         }
      }
      System.exit(0);
   }
 
}