import java.awt.*;

public class BoldButton extends MyButtonDecorator {
    public BoldButton (MyButton button) {
        super (button);
        button.setFont(button.getFont().deriveFont(Font.BOLD));

    }

    @Override
    public MyButton get () {
        return this.button;
    }
}
