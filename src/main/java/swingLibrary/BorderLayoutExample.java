package swingLibrary;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setBounds(500, 500, 500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
