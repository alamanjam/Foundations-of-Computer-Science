import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel12
  extends JPanel
{
  private Scoreboard12 scoreboard;
  private Display12 display;
  private JLabel label;
  private JButton reset;
  private int guess;
  private int target;
  private int tries;
  
  public Panel12()
  {
    tries = 4;
    target = ((int)(Math.random() * 25.0D + 1.0D));
    
    setLayout(new BorderLayout());
    
    scoreboard = new Scoreboard12();
    add(scoreboard, "North");
    
    display = new Display12(new Panel12.Listener1());
    add(display, "Center");
    
    JPanel south = new JPanel();
    south.setLayout(new FlowLayout());
    add(south, "South");
    label = new JLabel("You have 4 tries to guess the number.");
    south.add(label);
    reset = new JButton("Reset");
    reset.setEnabled(false);
    reset.addActionListener(new Panel12.Listener2());
    south.add(reset);
  }
  
  private class Listener1
    implements ActionListener
  {
    private Listener1() {}
    
    public void actionPerformed(ActionEvent e)
    {
      JButton source = (JButton)e.getSource();
      Panel12.guess = Integer.parseInt(source.getText());
      Panel12.tries = (Panel12.tries - 1);
      if (Panel12.guess == Panel12.target) {
        Panel12.displayWinner();
      } else if (Panel12.tries == 0) {
        Panel12.displayLoser();
      } else if (Panel12.guess > Panel12.target) {
        Panel12.displayTooHigh();
      } else {
        Panel12.displayTooLow();
      }
    }
  }
  
  private class Listener2
    implements ActionListener
  {
    private Listener2() {}
    
    public void actionPerformed(ActionEvent e)
    {
      Panel12.display.reset();
      Panel12.tries = 4;
      Panel12.target = ((int)(Math.random() * 25.0D + 1.0D));
      Panel12.label.setText("You have 4 tries to guess the number.");
      Panel12.reset.setEnabled(false);
    }
  }
  
  private void displayWinner()
  {
    scoreboard.displayWinner();
    display.displayWinner(target);
    label.setText("You got it!");
    reset.setEnabled(true);
  }
  
  private void displayLoser()
  {
    scoreboard.displayLoser();
    display.displayLoser(target);
    label.setText("You lose.");
    reset.setEnabled(true);
  }
  
  private void displayTooHigh()
  {
    display.displayTooHigh(guess);
    String message = "Too high -- ";
    switch (tries)
    {
    case 3: 
      message = message + "3 tries remaining.";
      break;
    case 2: 
      message = message + "only two tries left.";
      break;
    case 1: 
      message = message + "last try!";
      break;
    }
    label.setText(message);
  }
  
  private void displayTooLow()
  {
    display.displayTooLow(guess);
    String message = "Too low -- ";
    switch (tries)
    {
    case 3: 
      message = message + "3 tries remaining.";
      break;
    case 2: 
      message = message + "only two tries left.";
      break;
    case 1: 
      message = message + "last try!";
      break;
    }
    label.setText(message);
  }
}
