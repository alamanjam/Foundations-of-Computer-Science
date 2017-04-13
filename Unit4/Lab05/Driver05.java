	//Name:    Date:
    public class Driver05
   {
      public static final int TRIALS = 100;
       public static void main(String[] args)
      {
         Dice d = new Dice();
         // Experiment  1
         int count = 0;
         do
         {
            d.roll();
            count = count + 1;
         }while(d.total() != 12);
         System.out.println("It took " + count + " rolls to get boxcars.");
         
         int count1=0;
         // Experiment  2
          do
         {
            d.roll();
            count1 = count1 + 1;
         }while(!d.doubles());
         System.out.println("It took " + count1 + " rolls to get doubles: "+ d.toString());
         
         // Experiment  3
         int[]array= new int[14];
         int count2=0;
         for(int x=0;x<100;x++)
         {
         d.roll();
         int total=d.total();
         array[total]++;
         
  
         if(d.doubles())
         {
         count2++;
         }
         }
         for (int x = 2; x <= 12; x++) {
           System.out.println(x + "'s:  " + array[x]);
           
           }
         
          System.out.println("Number of doubles in 100 rolls: "+count2);
          }
        
            }
   
	/******
	 It took 35 rolls to get boxcars.
    It took 4 rolls to get doubles: {1, 1}
    2's:  6
    3's:  6
    4's:  5
    5's:  10
    6's:  12
    7's:  20
    8's:  17
    9's:  6
    10's:  10
    11's:  4
    12's:  4
    Number of doubles in 100 rolls: 18
	 ********/