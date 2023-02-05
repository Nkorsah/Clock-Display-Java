package ClockDisplayJava;

import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.BoxLayout;

public class Page {
        JFrame frame;
        JPanel panel;
        JPanel cpanel;
        JPanel p2;
        JLabel title;
        JLabel label;
        JLabel date; //scope so that all methods see this
        JLabel dlabel;

    public Page() { // setting up and customizing the GUI
        //-----------------Objects------------------/
        frame = new JFrame();
        panel = new JPanel();
        p2 = new JPanel();
        cpanel = new JPanel();
        label = new JLabel("4:00 AM");
        title = new JLabel("Live Time");
        date = new JLabel("\"Date Goes Here\"");
        dlabel = new JLabel();
        BoxLayout boxLayout = new BoxLayout(cpanel, BoxLayout.Y_AXIS);


        //--------------------Frame Settings------------------/
        frame.setVisible(true);
        frame.setSize(1200, 700);
        frame.setMinimumSize(new Dimension(1000,500));
        //frame.setResizable(false);

        //--------------------Main Panel Settings-------------------/
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1200, 500));

        //-----------------Text for Time----------------------//
        label.setFont(new Font("Courier", Font.PLAIN, 72)); // Font size and look 
        label.setBackground(Color.GREEN);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(200, 100));

        //-----------------Title Text----------------------//
        textDefaults(title);
        title.setFont(new Font("Courier", Font.PLAIN, 60));
        title.setVerticalAlignment(JLabel.TOP);
        title.setPreferredSize(new Dimension(200, 75));

        textDefaults(date);
        date.setVerticalAlignment(JLabel.CENTER);
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setPreferredSize(new Dimension(200, 100));

        dlabel.setPreferredSize(new Dimension(200, 0));

        cpanel.setLayout(boxLayout);
        cpanel.add(date);
        //cpanel.add(dlabel, BoxLayout.CENTER);
        cpanel.add(label);
        date.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        p2.setBackground(Color.BLUE);
        p2.setPreferredSize(new Dimension(200, 100));

        panel.add(title, BorderLayout.NORTH);
        panel.add(cpanel, BorderLayout.CENTER);
        //panel.add(p2, BorderLayout.SOUTH);
        

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Live Time");
        frame.pack();
    }

    public void textDefaults(JLabel page){
        page.setFont(new Font("Courier", Font.PLAIN, 72)); // Font size and look 
        page.setOpaque(true);
        page.setVerticalAlignment(JLabel.CENTER);
        page.setHorizontalAlignment(JLabel.CENTER);
        page.setPreferredSize(new Dimension(200, 200));
    }

    public void timeupdate(String text){ //Updates the text in the GUI
        label.setText(text);
    }

    public void dateupdate(String text){ //Updates the text in the GUI
        date.setText(text);
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
            myPage.timeupdate(y);
            Thread.sleep(1000);
        }
    }
}
