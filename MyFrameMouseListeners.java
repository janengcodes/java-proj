import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrameMouseListeners extends JFrame implements MouseListener {
    JLabel label; 

    MyFrameMouseListeners() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);

        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) { // enters a component
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) { // enters a component
        System.out.println("Mouse Exited");
    }

}
