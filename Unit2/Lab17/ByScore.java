
import java.util.Comparator;

public class ByScore implements Comparator<Player> {
       public int compare(Player p1, Player p2) {
        return p1.getScore()-p2.getScore();
    }
}