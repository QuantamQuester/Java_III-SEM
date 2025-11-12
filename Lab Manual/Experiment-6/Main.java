public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println();

        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println("Resizable Circle:");
        System.out.println("Initial Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Initial Area: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("\nAfter resizing to 50%:");
        System.out.println("New Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("New Area: " + resizableCircle.getArea());
    }
}