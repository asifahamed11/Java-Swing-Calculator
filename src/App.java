import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public Container c;

    App() {
        c = getContentPane();
        c.setLayout(null);
        Color color = new Color(35, 35, 35);
        c.setBackground(color);
        ImageIcon i = new ImageIcon("D:\\CSE 213(JAVA)\\LAB\\Calculator\\src\\image.png");
        setIconImage(i.getImage());
    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setBounds(500, 150, 350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
