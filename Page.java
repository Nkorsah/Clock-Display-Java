package ClockDisplayJava;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BorderFactory;

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
        label.setPreferredSize(new Dimension(300,200));
        // panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Live Clock");
        frame.pack();
        frame.setVisible(true);
    }

    public void update(){
        label.setText("Haha lol");
    }
    public static void main(String[] args) throws InterruptedException{
        new Page();
        Thread.sleep(6000);
        update();
    }
}
