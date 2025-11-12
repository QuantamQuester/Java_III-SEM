interface Resizable {
    void resize(int percent);
}
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }
}