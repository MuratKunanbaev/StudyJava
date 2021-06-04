package swingLibrary;

import javax.swing.*;

public class BoxLayoutExample extends JFrame {

    public BoxLayoutExample() {
        setBounds(500, 500, 500, 300);
        setTitle("Box Layout Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        for (int i = 0; i <= 10; i++) {
            add(new JButton("#" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
