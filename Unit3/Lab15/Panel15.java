   //Name: ________________________  Date: __________________

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel15 extends JPanel
   {
    private JTextArea area;
    private JPanel panel;
    private StylePanel style;
    private SizePanel size;
    private NamePanel name;
      public Panel15()
      {
      setLayout(new BorderLayout());
      
      area = new JTextArea("The quick brown fox jumps over the lazy dog");
      area.setLineWrap(true);
      add(area, BorderLayout.CENTER);
      
      panel= new JPanel();
      panel.setLayout(new FlowLayout());
      
      name = new NamePanel(area);
      panel.add(name);
      style = new StylePanel(area);
      panel.add(style);
      size = new SizePanel(area);
      panel.add(size);
      
      add(panel, BorderLayout.SOUTH);
        /*****************************************************
		  Panel15 has a border layout.  The center has a textArea 
		  with lineWrap turned on.  The south is formatted in a 
		  flowLayout and has a NamePanel, a StylePanel, and a 
		  SizePanel.  
		*******************************************************/
      }
   }