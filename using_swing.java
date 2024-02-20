import javax.swing.*;
public class using_swing  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J frame");
        JButton button = new JButton("Submit");
        button.setSize(300, 270);
        frame.add(button);
        frame.setSize(1000, 800);
        frame.setVisible(true);
        frame.setLayout(null);
        // frame.addWindowListener(new myclass());
    }
}