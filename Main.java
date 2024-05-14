import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.pink);
        panel2.setBounds(250, 0, 250, 250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.ORANGE);
        panel3.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setVisible(true);


    }
}
