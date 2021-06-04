package swingLibrary;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setBounds(500, 500, 500, 300);
        setTitle("Flow Layout Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            add(new JButton("#" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
