package ClockDisplayJava;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;

public class Page {

    public Page() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 600, 300, 600));
        // panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Live Clock");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Page();
    }
}
