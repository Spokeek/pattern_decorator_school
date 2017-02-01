import javax.swing.*;

public class MyButton extends JButton implements ButtonInterface {
    public MyButton (String texte) {
        super (texte);
    }

    @Override
    public MyButton get () {
        return this;
    }
}