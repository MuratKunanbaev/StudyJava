package swingLibrary;

import javax.swing.*;

public class DisableLinker extends JFrame {
    public DisableLinker() {
        setBounds(500, 500, 300, 300);
        setTitle("Manual GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        add(field);
        JButton button = new JButton("Enter here");
        button.setBounds(20, 60, 120, 32);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisableLinker();
    }
}
