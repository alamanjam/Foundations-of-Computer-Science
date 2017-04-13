
   import java.util.Comparator;
    public class ByExtension implements Comparator<EMail>
   {
       public int compare(EMail arg1, EMail arg2)
      {
         return -arg1.getExtension().compareTo(arg2.getExtension());
      }
   }