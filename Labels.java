import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.blue, 3);

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0, 0, 0)); // Font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(25); // set gap of text to image 
        // label.setBackground(Color.black);
        // label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        // label.setBounds(100, 100, 250, 250); // set x, y, width, height (x, y, width, height) to control size of label w frame.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null); // Set layout to null to use absolute positioning
        frame.getContentPane().setBackground(new Color(229, 208, 227)); // Set background color before adding components
        frame.add(label); // Add label to the frame
        frame.pack(); // Resize frame to fit all components
        frame.setVisible(true);

    }
}
