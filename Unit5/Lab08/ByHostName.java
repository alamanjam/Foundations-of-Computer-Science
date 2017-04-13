
   import java.util.Comparator;
    public class ByHostName implements Comparator<EMail>
   {
       public int compare(EMail arg1, EMail arg2)
      {
         return -arg1.getHostName().compareTo(arg2.getHostName());
      }
   }