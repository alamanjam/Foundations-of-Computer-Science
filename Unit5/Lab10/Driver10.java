  //Name______________________________ Date_____________
  
import java.io.*;       		 //the File class
import java.util.*;     		 //the Scanner class
import javax.swing.JOptionPane;
public class Driver10
{
private static Scanner infile;
   public static void main(String[] args) 
   {
      Song[] songList = input();
      int totalTime = calcTime(songList);
      int longestSong = searchLongestSong(songList);
      display(songList, totalTime, longestSong);
      System.exit(0);
   }
   	
   public static Song[] input() 
   {
      Scanner infile = null;
    while (infile == null) {
               
      try{
      String filename=JOptionPane.showInputDialog("Enter filename");
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be found.");
      
      }
   }
   
      int numitems = Integer.parseInt(infile.nextLine());
      Song[] array = new Song[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k]=new Song(infile.nextLine());
      }
      infile.close();
      return array;
   }

   public static int calcTime(Song[] songs)
   {
      int total=0;
      for(int x=0;x<songs.length;x++)
      {
         total+=(songs[x].getSeconds()+songs[x].getMinutes()*60);
      }
      return total;
            
   }
      
   public static int searchLongestSong(Comparable[] songs)
   {
      int index=0;
      for(int x = 1;x<songs.length;x++)
      {
         if(songs[x].compareTo(songs[index])>0)
         {
            index=x;
         }
         
      }
      return index;
   }
      
   public static void display(Song[] array, int total, int longestSong)
   {
      total = calcTime(array);
   
      System.out.println("Total Time: " +(total/60)+"\' "+(total%60)+"\"");
      longestSong=searchLongestSong(array);
      System.out.println("Longest Song: "+array[longestSong].toString());
   }
}