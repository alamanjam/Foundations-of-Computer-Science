import javax.swing.JOptionPane;
import java.io.*;     import java.util.*;

public class Driver08
{
   private static Scanner infile;
   public static void main(String[] args)
    throws Exception
   {
      while(true)
      {
         String myWord = JOptionPane.showInputDialog("Word? (Type –1 to quit:)");
         if(myWord.equals("-1")){
            break;
            }
         infile = new Scanner( new File("words.txt") );
         int first = infile.nextInt();
         String[] wordlist = new String[first];
         for (int x = 0; x < first; x++) 
         {
            wordlist[x] = infile.next();
         }
         infile.close();
         int count=0;
         for (int x = 0; x < first; x++) {
         if(myWord.equalsIgnoreCase(wordlist[x]))
         {
         
         System.out.println("Yes, \"" + myWord + "\" is a word, #" + (x + 1) + ".");
         count=1;
         break;
         }
         }
         if(count==0)
         {
           System.out.println("Sorry, \"" + myWord + "\" is not a word.");
      }
    }
    System.out.println("Good-bye.");
    System.exit(0);
  }
}
  
