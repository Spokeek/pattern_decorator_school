import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        JFrame f = new JFrame ();
        f.setTitle ("Decorator Pattern");
        f.setSize (500, 500);
        f.setContentPane (new Panel ());
        f.setResizable (false);
        f.setVisible (true);
    }
}
