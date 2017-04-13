import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard12
  extends JPanel
{
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private int wins;
  private int total;
  private int streak;
  private int max;
  
  public Scoreboard12()
  {
    setLayout(new FlowLayout());
    
    this.wins = (this.total = this.streak = this.max = 0);
    
    add(new JLabel("Wins:"));
    this.label1 = new JLabel();
    this.label1.setText("0/0 (-.--%)");
    add(this.label1);
    
    add(new JLabel("  Current Streak:"));
    this.label2 = new JLabel();
    this.label2.setText("0");
    add(this.label2);
    
    add(new JLabel("  Longest Streak:"));
    this.label3 = new JLabel();
    this.label3.setText("0");
    add(this.label3);
  }
  
  public void displayWinner()
  {
    this.total += 1;
    this.wins += 1;
    this.streak += 1;
    if (this.streak > this.max) {
      this.max = this.streak;
    }
    String s = new DecimalFormat("0.00%").format(1.0D * this.wins / this.total);
    this.label1.setText("" + this.wins + "/" + this.total + " (" + s + ")");
    this.label2.setText("" + this.streak);
    this.label3.setText("" + this.max);
  }
  
  public void displayLoser()
  {
    this.total += 1;
    this.streak = 0;
    String s = new DecimalFormat("0.00%").format(1.0D * this.wins / this.total);
    this.label1.setText("" + this.wins + "/" + this.total + " (" + s + ")");
    this.label2.setText("" + this.streak);
  }
}
