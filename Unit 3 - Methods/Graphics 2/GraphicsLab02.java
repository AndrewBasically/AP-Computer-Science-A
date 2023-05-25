import java.awt.*;
import javax.swing.*;

public class GraphicsLab02
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel m = new MyPanel();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel extends JPanel 
{
	MyPanel()
	{
		setSize(800, 600);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{	
	  Three.night(g);
     One.roof(g);
     One.house(g);
     One.roofWindows(g);
     Two.windows(g);
     Two.door(g);
     Three.grass(g);
     Three.tree(g);
	}

}

class One   
{
	
	public static void house (Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(150,150,250,300);
	}
   
   public static void roof (Graphics g)
   {
      g.setColor(Color.GRAY);
      g.fillOval(150,75,250,150);
   }
   
   public static void roofWindows (Graphics g)
   {
      g.setColor(Color.CYAN);
      g.fillRect(235,85,25,50);
      g.fillRect(285,85,25,50);
   }
}

class Two
{
   public static void windows (Graphics g)
   {
      g.setColor(Color.CYAN);
      g.fillRect(185,200,75,100);
      g.fillRect(295,200,75,100);
   }
   
   public static void door (Graphics g)
   {
      g.setColor(Color.ORANGE);
      g.fillRect(250,350,50,100);
   }
}

class Three
{
   public static void night (Graphics g)
   {
      g.setColor(Color.BLACK);
      g.fillRect(0,0,800,800);
   }
   
   public static void grass (Graphics g)
   {
      g.setColor(Color.GREEN);
      g.fillRect(0,450,800,200);
   }
   public static void tree (Graphics g)
   {
      g.setColor(Color.YELLOW);
      g.fillRect(500,350,20,100);
      g.setColor(Color.GREEN);
      g.fillOval(460,300,100,100);
   }
}