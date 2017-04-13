 public class StudentHours12to21 implements Hours
 { 
    String myFirstName, myLastName, myRoomType, myGrad, myWarning, gr; 
   int myCredHours, myFees, n, g;
    
     
    public StudentHours12to21() 
    { 
      myFirstName = ""; 
      myLastName = ""; 
      myRoomType = "";
      myGrad="";
      myWarning="";
      myCredHours = 0; 
    } 
     
    public StudentHours12to21(String lastName, String firstName, int credHours, String roomType, String grad, String warning) 
    { 
       myFirstName = firstName; 
       myLastName = lastName; 
       myCredHours = credHours;
       myRoomType = roomType;
       myGrad = grad; 
       myWarning = warning;
    } 
     
    public double getFees() 
   { 
       if(myRoomType.equals("R"))
       n = 200;
       else
       n = 250;
       if(myGrad.equals("Y"))
       g = 35;
       else
       g = 0;
       return ((30)+(400)+(myCredHours * 90)+(n)+(g)); 
    } 
     
    public int getCreditHours() 
    { 
      return myCredHours; 
    } 
     
    public String getFirstName() 
   { 
       return myFirstName; 
    } 
     
    public String getLastName() 
    { 
       return myLastName; 
    } 
     public String getRoomType() 
    { 
       return myRoomType; 
    } 
    public String getGraduating() 
    { 
       return myGrad;
    } 
    public String getWarning() 
    {
       return "";  
    } 
    public int compareTo(Hours h) 
    { 
       return myLastName.compareTo(h.getLastName()); 
    } 
     
    public String toString() 
    { 
      return ""; 
    } 
 } 
