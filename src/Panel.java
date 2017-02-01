import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    public MyButton button;

    public Panel () {
        button = new MyButton ("mon Demo boutton");
        setLayout (new BorderLayout ());
        add (button, BorderLayout.NORTH);

        MyButton button1 = new MyButton ("White button");
        button1.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                button = new WhiteFontButton (button).get ();
            }
        });

        MyButton button2 = new MyButton ("Red background button");
        button2.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                button = new RedButton (button).get ();
            }
        });

        MyButton button3 = new MyButton ("Bold button");


        add (button1, BorderLayout.WEST);

        add (button2, BorderLayout.CENTER);

        add (button3, BorderLayout.EAST);

    }

    public void paintComponent (Graphics g) {
        add (button);
    }
}
