import java.applet.*;
import java.awt.*;

public class PersonalInfo extends Applet {
    Font f;
    public void init() {
        setSize(500,500);
        f = new Font("Arial",Font.BOLD,50);
    }
    public void paint(Graphics g)   {
        g.drawString("********** Personal Info *********", 50, 40);
        g.drawString("Name : Ansh", 50, 60);
        g.drawString("USN : U19KU21S0141", 50, 80);
        g.drawString("Class : II SEM BCA A", 50, 100);
    }
}
/*<applet code = "PersonalInfo.class" width = 500 height = 500></applet>*/
