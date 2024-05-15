import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon image = new ImageIcon("logo.png");


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        // label.setVerticalAlignment(JLabel.BOTTOM); for border layout 
        // label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75);


        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(0, 0, 250, 250);
        panel1.setLayout(null);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.pink);
        panel2.setBounds(250, 0, 250, 250);
        panel2.setLayout(null);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.ORANGE);
        panel3.setBounds(0, 250, 500, 250);
        panel3.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        panel3.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setVisible(true);


    }
}
