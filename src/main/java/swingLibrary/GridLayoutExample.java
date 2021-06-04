package swingLibrary;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setBounds(500, 500, 500, 300);
        setTitle("Grid Layout Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            add(new JButton(String.valueOf(i)));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
