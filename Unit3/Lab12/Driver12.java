   //Name______________________________ Date_____________
import javax.swing.JOptionPane;
public class Driver12
{
   public static void main(String[] args)
   {
      while(true)
      {
         int n = Integer.parseInt(
                       JOptionPane.showInputDialog(
                                    "How many rows? (-1 to quit)"));
         if(n == -1)
         {
            System.out.println("Bye-bye!");
            System.exit(0);
         }
         String message = "What type? (1-4)";
         message = message + "\n1. Standard";
         message = message + "\n2. Backward";
         message = message + "\n3. Pyramid";
         message = message + "\n4. Box with X";
         int type = Integer.parseInt(JOptionPane.showInputDialog(message));
         switch(type)
         {
            case 1: standard(n);
               break;
            case 2: backward(n);
               break;
            case 3: pyramid(n);
               break;
            case 4: box(n);
               break;
            default: System.out.println("Not a valid type.");
               break;
         }
         System.out.println();
      }
   }
   public static void standard(int n)
   {
      for(int x=1; x<=n;x++)
      {
         for (int c=1;c<=x;c++)
         {
            System.out.print("*");
         }
         System.out.println(); 
      }
   }
   public static void backward(int n)
   {
     for(int x=1; x<=n;x++)
      {
         for (int c=n-x;c>=0;c--)
         {
            System.out.print(" ");
         }
         for(int c=1;c<=x;c++)
         {
            System.out.print("*");
         
         } 
         System.out.print("\n");
      
      }
       
   }      
   public static void pyramid(int n)
   {
      for(int r=1;r<=n;r++)
      {
         for (int c=n-r;c>=0;c--)
         {
            System.out.print(" ");
         }
         for(int c=1;c<r*2-1;c++)
         {
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
       

   
   public static void box(int n)
   {
      for(int r = 1; r <= n; r++)
      {
         for (int c = 1; c <= n; c++) 
         {
            if ((r==1)||(r==n)||(c==1)||(c==n)||(r==c)||(r+c==n+1)) 
            {
               System.out.print("*");
            } 
            else 
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }   
         
   }
}