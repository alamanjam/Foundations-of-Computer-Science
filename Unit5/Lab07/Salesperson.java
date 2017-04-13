	//Name______________________________ Date_____________
public class Salesperson 
{
   	//data fields
   private String myName;
   private int myCars, myTrucks;
   
   	//constructors
   public Salesperson()
   {
      myName=("Bob");
      myCars=myTrucks=0;
   }
   public Salesperson(String n, int c, int t)
   {
      myName=n;
      myCars=c;
      myTrucks=t;
   }
   	//accessors and modifiers
   public int getCars()
   {
      return myCars;
   }
   public int getTrucks()
   {
      return myTrucks;
   }
   public String getName()
   {
      return myName;
   }
   public int getTotalSales()
   {
      return myTrucks+myCars;
   }
   public void setName(String x)
   {
      myName=x;
   }
   public void setCars(int x)
   {
      myCars=x;
   }
   public void setTrucks(int x)
   {
      myTrucks=x;
   }
   	//other methods: toString
   public String toString()
   {
      return myName + " (" + myCars + ", " + myTrucks + ")";
   }
  
}