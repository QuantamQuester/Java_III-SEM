class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double SquareArea(double side) {
        return side * side;
    }

    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}