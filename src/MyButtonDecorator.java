public abstract class MyButtonDecorator implements ButtonInterface {

    protected MyButton button;

    public MyButtonDecorator (MyButton button) {
        this.button = button;
    }

}
