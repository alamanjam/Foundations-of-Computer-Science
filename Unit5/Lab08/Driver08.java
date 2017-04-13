
         
         import java.io.*;      //the File class
         import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class Driver08
{ 
   public static void main(String[] args)
   {
      EMail[] array = input("data.txt");
      menu(array);
      System.exit(0);
   }
    
   public static EMail[] input(String filename)
   {    
      Scanner infile = null;
      try{
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be found.");
         System.exit(0);
      }
      int numitems = infile.nextInt();
      EMail[] array = new EMail[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k]=new EMail(infile.next());
      }
      infile.close();
      return array;
   }
   	
   public static void menu(EMail[]array)
   {
      int choice = 0;
      while(choice != 7)
      {
         String message = "";
         message = message + "\n1. List Alphabetically.";
         message = message + "\n2. List by Username.";
         message = message + "\n3. List by Hostname.";
         message = message + "\n4. List by Extension.";
         message = message + "\n5. Change EMail.";
         message = message + "\n6. Save data to file.";
         message = message + "\n7. Quit.";
         choice = Integer.parseInt(JOptionPane.showInputDialog(message));
         switch(choice)
         {
            case 1: display(array, new ByAddress());
               break;
            case 2: display(array, new ByUserName());
               break;
            case 3: display(array, new ByHostName());
               break;
            case 4: display(array, new ByExtension());
               break;
            case 5: add(array);
               break;
            case 6: save(array);
               break;
            case 7: 
               for(int k = 0; k < 25; k++) 
                  System.out.println();
               System.out.println("Bye-bye!");
               break;
            default: System.out.println("Not a valid selection.");
               break;
         }
         System.out.println();
      }
   }
    
   public static void save(EMail[] array)
   {
      PrintStream outfile = null;
      try{
         outfile = new PrintStream(new FileOutputStream("data.txt"));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be created.");
      }
      for(int k=0;k<array.length;k++)
      {
         outfile.println(array[k].getUserName() + "\n" + array[k].getHostName() + "\n" + array[k].getExtension());
      }
          	
      outfile.close();
      System.out.println("Saved.");
   }
   public static void add(EMail[] array)
   {	
      String name = JOptionPane.showInputDialog("Which email?");
      String type = JOptionPane.showInputDialog("Username, Hostname or Extension?\n1 for Username\n2 for Hostname\n3 for Extensiion");
      String amount= JOptionPane.showInputDialog("What is your new one?");
      int t=Integer.parseInt(type);
      if(t==1)
      {
      array[search(array,name)].setUserName(amount);
      }
      else if(t==2)
      {
      array[search(array,name)].setHostName(amount);
      }
      else if(t==3)
      {
      array[search(array,name)].setExtension(amount);
      }
      
      
    
      System.out.println("Email changed.");
   }
   public static int search(EMail[] array, String name)
   {
      for (int k = 0; k < array.length; k++) {
         if (name.equals(array[k].getAddress())) {
            return k;
         }
      }
      return -1;
   }
  
   public static void display(EMail[] array, Comparator c)
   {
      sort(array, c);
      System.out.println("EMails");
      System.out.println("-----------");
      for (int k = 0; k < array.length; k++) {
         System.out.println(array[k].toString());
      }
   }
   public static void sort(Object[] array, Comparator c)
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k, c);
         swap(array, minPos, array.length - k - 1);
      }
   }
   public static int findMin(Object[] array, int upper, Comparator c)
   {
      {
         int minPos = 0;
         for (int x = 1; x< upper; x++) {
            if (c.compare(array[x], array[minPos]) < 0) {
               minPos =x;
            }
         }
         return minPos;
      }
   }
   public static void swap(Object[] array, int a, int b)
   {
      Object temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}
   
    
 