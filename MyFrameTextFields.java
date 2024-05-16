import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField; 
import javax.swing.*;
import java.awt.*;

public class MyFrameTextFields extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;

    MyFrameTextFields() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(220, 100, 0));

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());

        }
    }
}
