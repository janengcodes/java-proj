import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    LaunchPage() {
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false); // sometimes buttons are highlighted
        myButton.addActionListener(this);
        
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose(); // close out of our frame 
            NewWindow myWindow = new NewWindow();

        }
    }
}
