package exam;
import java.awt.*;
import java.awt.event.*;
public class frame {
    public static void main(String[] args) {
        Frame fr = new Frame("Frame");
        fr.setSize(300, 260);
        fr.setVisible(true);
        fr.addWindowListener(new myclass());
    }
}

class myclass extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
