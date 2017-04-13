//name:    date:

import javax.swing.JOptionPane;
public class Driver13
{
   public static int first;
   public static int second;
   public static int a,b,c;
   private static int count;
   public static void main(String[] args)
   {
      while(true)
      {
         first = Integer.parseInt(JOptionPane.showInputDialog("First Digit? (-1 to quit)"));
         if(first == -1)
         {
            System.out.println("Bye-bye!");
            System.exit(0);
         }

         while(first<0||first>9)
         {
         System.out.println("That's not a digit.");
          first = Integer.parseInt(JOptionPane.showInputDialog("First Digit? (-1 to quit)"));
         }
         second = Integer.parseInt(JOptionPane.showInputDialog("Second Digit? (-1 to quit)"));
         if(second == -1)
         {
            System.out.println("Bye-bye!");
            System.exit(0);
         }
         while(second<0||second>9)
         {
         System.out.println("That's not a digit.");
         second = Integer.parseInt(JOptionPane.showInputDialog("Second Digit? (-1 to quit)"));
         }
         
         System.out.print(first);
         System.out.print(",");
         System.out.print(second);
         System.out.println();
         count=0;
         necklace(first, second);
         System.out.println();
         System.out.print("Iterations:"+count);
         System.out.println();
   
      }
   }
   public static void necklace(int a, int b)
   {
      do{
      c=a+b;
      a=b;
      b=c%10;
      System.out.print(b);  
      count++;    
      }
      while(a!=first||b!=second);
   }
}
