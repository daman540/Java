import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI_Example  implements ActionListener {
    private int count = 0;
    private JLabel label = new JLabel("Number of clicks: 0");
    private JFrame frame = new JFrame();

    public GUI_Example(){
        // Creates a button and "listens" for clicks
        JButton button = new JButton("Click me!");
        button.addActionListener(this);

        // Creates a panel with a button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,10,30,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        // Sets up the frame and displays it
        frame.add(panel, BorderLayout.CENTER); // Add panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when frame is closed
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }
    
    // Process button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }

    public static void main(String []args){
        new GUI_Example();
    }
    
}
