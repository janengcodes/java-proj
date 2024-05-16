import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrameComboBoxes extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrameComboBoxes() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);

        String[] animals = {"dog", "cat", "bird"};
        // Can't do primitive types, only objects
        Integer[] numbers = {1, 2, 3, 4, 5}; // you can use wrapper classes 

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);


        comboBox.setEditable(true);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {

            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }   
}
