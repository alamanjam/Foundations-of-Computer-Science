
   import java.util.Comparator;
    public class ByAddress implements Comparator<EMail>
   {
       public int compare(EMail arg1, EMail arg2)
      {
         return -arg1.getAddress().compareTo(arg2.getAddress());
      }
   }