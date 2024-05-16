import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;

public class MyFrameCheckBoxes extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon; 
    ImageIcon checkIcon;

    MyFrameCheckBoxes() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("x.png");
        checkIcon = new ImageIcon("check.png");

        button = new JButton("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35)); 
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);
        
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Welcome " + checkBox.isSelected());
        }
    }
}
