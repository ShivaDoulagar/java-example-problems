import javax.swing.*;

public class jbutton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");
        JPanel panel = new JPanel();
        JLabel label= new JLabel("Example of j button");
        JButton button= new JButton("click here");
        panel.add(label);
        panel.add(button);
        f.add(panel);
        f.setSize(600, 550);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
