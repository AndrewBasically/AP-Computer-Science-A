import java.awt.*;
import java.awt.event.*;

public class Lab32ast
{
    public static void main(String args[])
    {
        Windows win = new Windows();
        win.setSize(1000,750);
        win.addWindowListener(new WindowAdapter() {public void
        windowClosing(WindowEvent e) {System.exit(0);}});
        win.show();
    }
}
class Windows extends Frame
    {
    public void paint(Graphics g)
    {
        drawSquare(g, 0, 100, 200);
        drawReverseSquare(g, 0, 100, 200);
    }
    public void drawSquare(Graphics g, int x, int y, int size)
    { 
        g.fillRect(x, y, size, size);
        if (1000 > x + size + 10 + (int) (size*.75)  && (int) (size*.75) > 4)
        {
            drawSquare(g, x+size+10, y+size - (int) (size*.75), (int) (size*.75));
        }
    }
    public void drawReverseSquare(Graphics g, int x, int y, int size)
    { 
        g.fillRect(1000 - x - size, 100+size+y, size, size);
        if (1000 > x + size + 10 + (int) (size*.75)  && (int) (size*.75) > 4)
        {
            drawReverseSquare(g, x+size+10, y+size - (int) (size*.75), (int) (size*.75));
        }
    }
}