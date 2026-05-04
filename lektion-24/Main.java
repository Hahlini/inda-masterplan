import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {


    public static void UI () {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        
        JPanel subPanel = new JPanel(new FlowLayout());

        JButton button = new JButton(" +5");
        JButton button1 = new JButton("Reset");
        JButton button2 = new JButton("-5");

        
        JLabel label = new JLabel("0");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        
        button.setAction(new AbstractAction(" +5") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(label.getText());
                value += 5;
                label.setText(String.valueOf(value));
            } 
        });

        button1.setAction(new AbstractAction("Reset") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("0");
            } 
        });

        button2.setAction(new AbstractAction("-5") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(label.getText());
                value -= 5;
                label.setText(String.valueOf(value));
            } 
        });
        
        subPanel.add(button);
        subPanel.add(button1);
        subPanel.add(button2);

        panel.add(subPanel, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(200, 100);
    }




    public static void main(String[] args) {
        UI();
    }
}