//Name______________________________ Date_____________

public class Song implements Comparable<Song>
{
   	//data fields
   private String myTitle,myTime;
   private int myMinutes, mySeconds;
   
   	//constructors
      
  public Song()
  {
    this.myTitle = "";
    this.myMinutes = (this.mySeconds = 0);
  }
  
   public Song(String toBeParsed)
   {
      int x =toBeParsed.indexOf(":");
      myMinutes=Integer.parseInt(toBeParsed.substring(0,x));
      mySeconds=Integer.parseInt(toBeParsed.substring(x+1,x+3));
           
      myTitle=toBeParsed.substring(x+4,toBeParsed.length());
           
          
   }
        
   public Song(Song arg)
   {
      myTitle = arg.getTitle();
      myMinutes = arg.getMinutes();
      mySeconds = arg.getSeconds();
   }
  
     
   	//accessors and modifiers
   public int getMinutes()
   {
      return myMinutes;
   }
   public int getSeconds()
   {
      return mySeconds;
   }
   public String getTitle()
   {
      return myTitle;
   } 
   public int getTotalTime()
   {
      return myMinutes * 60 + mySeconds;
   }
   public void setTitle(String s)
   {
      myTitle=s;
   }
   public void setMinutes(int x)
   {
      myMinutes=x;
   }
   public void setSeconds(int x)
   {
      mySeconds=x;
   }
   	
       
      //other methods:  compareTo(), equals(), toString()
   
      
   public String toString()
   {
      return myTitle+" ("+myMinutes+"' "+mySeconds+"\""+")";	
   }
   public int compareTo(Song s)
   {
      if (getTotalTime() < s.getTotalTime()) {
         return -1;
      }
      if (getTotalTime() > s.getTotalTime()) {
         return 1;
      }
      return 0;
   }   
   public boolean equals(Song arg)
   {
      return compareTo(arg)==0;
   }
}