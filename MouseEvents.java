import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Applet implements MouseListener {
    String msg = " ";
    public void init() {
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent m)  {
        msg = "Mouse Cicked";
        repaint();
    }
    public void mousePressed(MouseEvent m)  {
        msg = "Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent m)  {
        msg = "Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent m)  {
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent m)  {
        msg = "Mouse Exited";
        repaint();
    }
    public void paint(Graphics g)   {
        g.drawString(msg, 30, 30);
    }
}
/*<applet code = "MouseEvents.class" width = 500 height = 500></applet>*/
