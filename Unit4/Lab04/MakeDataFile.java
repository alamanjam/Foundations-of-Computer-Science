   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import java.io.*;
   import javax.swing.JOptionPane;
   public class MakeDataFile
   {
      public static void main(String[] args) throws Exception
      {
         String filename = JOptionPane.showInputDialog("Enter filename");
         PrintStream outfile = new PrintStream(
                           new FileOutputStream(filename)
                           );
      
         int numitems = (int)(Math.random() * 5000 + 5000);
         outfile.println(numitems);
      
         for(int x = 0; x < numitems; x++)
            outfile.println(Math.random() * 1000);
      
         outfile.close();
      }
   }