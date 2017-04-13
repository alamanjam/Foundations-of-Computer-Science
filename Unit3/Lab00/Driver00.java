import javax.swing.JFrame;
public class Driver00
{
   public static void main(String[]args)
   {
public boolean isPrime(int a)
{
for(int k=a/2; k >= 2; k--)
   if(a % k == 0)
      return false;
return true;
}
System.out.println( isPrime(23) );
System.out.println( isPrime(25) );

}
}