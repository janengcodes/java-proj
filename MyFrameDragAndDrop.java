import javax.swing.*;
import java.awt.*;
public class MyFrameDragAndDrop extends JFrame {

    DragPanel panel = new DragPanel();

    MyFrameDragAndDrop() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(panel);
        this.setTitle("Drag and Drop");  
        this.setLayout(null);

        DragPanel panel = new DragPanel();
        panel.setBounds(0, 0, 500, 500);

        this.add(panel);
        this.setVisible(true);
    }
    
}
