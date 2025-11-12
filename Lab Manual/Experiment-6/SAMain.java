public class Main {
    public static void main(String[] args) {
        Area calculator = new Area();

        double rectArea = calculator.RectangleArea(4.0, 5.0);
        System.out.println("Area of Rectangle: " + rectArea);

        double squareArea = calculator.SquareArea(6.0);
        System.out.println("Area of Square: " + squareArea);

        double circleArea = calculator.CircleArea(3.0);
        System.out.println("Area of Circle: " + circleArea);
    }
}