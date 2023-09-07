import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

    int counts = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;

    public GUI(){
        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click Counter");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String [] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counts++;
        label.setText("Number of clicks: " + counts);
    }

}
