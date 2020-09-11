package creational.factoryMethod.buttons;

import javax.swing.*;
import java.awt.*;

public class WindowsButton implements Button {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, Mariia!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 133, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 54));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(380, 300);
        frame.setVisible(true);
        onClick();

    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener((e) -> {
            frame.setVisible(false);
            System.exit(0);
        });

    }
}
