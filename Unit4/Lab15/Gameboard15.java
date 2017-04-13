//Name______________________________ Date_____________
  

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Gameboard15 extends JPanel
   {
      private JButton[][] board;
      private String gamepiece;
      private Color color;
      private int count;
       public Gameboard15(ActionListener a)
      {
         gamepiece = "X";
         color = Color.green;
         count = 0;
      
         setLayout(new GridLayout(3, 3));
         setBackground(Color.black);
      
         board = new JButton[3][3];
         for(int x = 0; x < 3; x++)
            for(int y = 0; y < 3; y++)
            {
               board[x][y] = new JButton("-");
               board[x][y].setFont(new Font("Monospaced", Font.PLAIN, 20));
               board[x][y].setBackground(Color.white);
               board[x][y].setFocusPainted(false);
               board[x][y].addActionListener(a); // <---Add this one first!!!!!
               board[x][y].addActionListener(new Listener(x, y));
               add(board[x][y]);
            }
      }
       private class Listener implements ActionListener
      {
         private int myX, myY;
          public Listener(int x, int y)
         {
            myX = x;
            myY = y;
         }
        public void actionPerformed(ActionEvent e)
    {
     
      board[myX][myY].setText(gamepiece);
      board[myX][myY].setBackground(color);
      board[myX][myY].setFont(new Font("Monospaced", 1, 60));
      board[myX][myY].setEnabled(false);
      if ("X".equals(gamepiece))
      {
        gamepiece = "O";
        color = Color.blue;
      }
      else
      {
        gamepiece = "X";
        color = Color.green;
      }
    }
  }
  
  public void freeze()
  {
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        board[x][y].setEnabled(false);
      }
    }
  }
  
  public void reset()
  {
    count = 0;
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++)
      {
        board[x][y].setText("-");
        board[x][y].setFont(new Font("Monospaced", 0, 20));
        board[x][y].setBackground(Color.white);
        board[x][y].setEnabled(true);
      }
    }
  }
  
  public boolean filled()
  {
    return count == 9;
  }
  
  public boolean winner()
  {
    char a = board[0][0].getText().charAt(0);
    char b = board[0][1].getText().charAt(0);
    char c = board[0][2].getText().charAt(0);
    char d = board[1][0].getText().charAt(0);
    char e = board[1][1].getText().charAt(0);
    char f = board[1][2].getText().charAt(0);
    char g = board[2][0].getText().charAt(0);
    char h = board[2][1].getText().charAt(0);
    char i = board[2][2].getText().charAt(0);
    return ((a == b) && (b == c) && (a != '-')) || ((d == e) && (e == f) && (d != '-')) || ((g == h) && (h == i) && (g != '-')) || ((a == d) && (d == g) && (a != '-')) || ((b == e) && (e == h) && (b != '-')) || ((c == f) && (f == i) && (c != '-')) || ((a == e) && (e == i) && (a != '-')) || ((g == e) && (e == c) && (g != '-'));
  }
}
