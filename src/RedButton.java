import java.awt.*;

public class RedButton extends MyButtonDecorator {
    public RedButton (MyButton button) {
        super (button);
        button.setBackground (Color.RED);
    }

    @Override
    public MyButton get () {
        return this.button;
    }
}
