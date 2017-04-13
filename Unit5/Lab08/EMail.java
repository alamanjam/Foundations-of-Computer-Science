	//Name______________________________ Date_____________
   public class EMail
   {
      private String myUserName;
      private String myHostName;
      private String myExtension;
      private String myAddress;
      public EMail(String address)
      {
         int k = address.indexOf("@");
         myUserName = address.substring(0, k);
         int g = address.indexOf(".");
         myHostName= address.substring(k, g);
         myExtension=address.substring(g, address.length());
         myAddress=myUserName+myHostName+myExtension;
      }
       public String getAddress()
      {
         return myAddress;
      }

      public String getUserName()
      {
         return myUserName;
      }
      public String getHostName()
      {
         return myHostName;
      }
      public String getExtension()
      {
         return myExtension;
      }
      public void setUserName(String s)
      {
         myUserName=s;
      }
      public void setHostName(String s)
      {
         myHostName=s;
      }
      public void setExtension(String s)
      {
         myExtension=s;
      }

      
      public String toString()
      {
         	return myUserName+myHostName+myExtension;
      }
   }