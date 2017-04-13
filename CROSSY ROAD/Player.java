public class Player 
{
   	//data fields
   private String myName;
   private int myScore;
   
   	//constructors
   public Player()
   {
      
      myName=("Bob");
      myScore=0;
   }
   public Player(String n, int s)
   {
      myName=n;
      myScore=s;
   }
   	//accessors and modifiers
   public String getName()
   {
      return myName;
   }
   public int getScore()
   {
      return myScore;
   }
   public void setName(String x)
   {
      myName=x;
   }
   public void setScore(int x)
   {
      myScore=x;
   }
    	//other methods: toString
   public String toString()
   {
      return myName + ": " +myScore;
   }
  
}