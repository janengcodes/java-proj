import javax.swing.JOptionPane; 

public class Main {
    public static void main(String[] args){
        // JOptionPane.showMessageDialog(null, "A message", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "A message", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "A message", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "A message", "title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "A message", "title", JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "hello", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?: ");
        // System.out.println(name);
        String[] responses = {"No, ur awesome", "Thank you!", "Blush"};
        JOptionPane.showOptionDialog(
            null, "You are awesome", 
            "secret message", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, // can replace with image icon
            responses, 
            0); // default selection 

    }
}
