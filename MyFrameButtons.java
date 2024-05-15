import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameButtons extends JFrame implements ActionListener{ 
    // MyFrame frame = new MyFrame();
    JButton button;
    JLabel label;

    MyFrameButtons() {
        ImageIcon originalIcon = new ImageIcon("logo.png");

        
        // Get the original image from the ImageIcon
        Image originalImage = originalIcon.getImage();

        // Resize the image to the desired dimensions
        int width = 30; // New width
        int height = 30; // New height
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the resized image
        ImageIcon icon = new ImageIcon(resizedImage);
        // ImageIcon icon2 = new ImageIcon("flower.png");

        label = new JLabel();
        label.setIcon(icon); // set an icon for the label
        label.setBounds(150, 250, 150, 150); // where you're placing the label
        label.setVisible(false);


        button = new JButton("Click Me");
        button.setBounds(200, 100, 250, 75);
        button.addActionListener(this);
        /*
        button.addActionListener(e -> System.out.println("Button Clicked!") );
         */
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(5);
        button.setForeground(Color.pink);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button Clicked!");
            label.setVisible(true);
        }
    }
    
}
