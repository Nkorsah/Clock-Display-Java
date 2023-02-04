package ClockDisplayJava;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.*;

public class Page {
        JFrame frame;
        JPanel panel;
        JLabel label; //scope so that all methods see this

    public Page() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("4:00 AM");

        panel.setBorder(BorderFactory.createEmptyBorder(300, 600, 300, 600));
        panel.add(label);
        label.setFont(new Font("Courier", Font.PLAIN, 72));
        label.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        
        // panel.setLayout(GridLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Live Clock");
        frame.pack();
        frame.setVisible(true);
    }

    public void update(String text){ //Updates the text in the GUI
        label.setText(text);
    }
    public static void main(String[] args) throws InterruptedException{
        Page myPage = new Page(); // The object of the GUI 
        Thread.sleep(6000);
        int x = 1;
        String y = "";
        System.out.println(y);
        for (int i = 0; i < 100; i++){ // Testing if I can make the text update
            x++;
            y = Integer.toString(x);
            myPage.update(y);
            Thread.sleep(1000);
        }
    }
}
