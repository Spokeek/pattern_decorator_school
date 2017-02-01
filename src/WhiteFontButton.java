import java.awt.*;

public class WhiteFontButton extends MyButtonDecorator {
    public WhiteFontButton (MyButton button) {
        super (button);
        button.setForeground (Color.WHITE);
    }

    @Override
    public MyButton get () {
        return this.button;
    }
}
