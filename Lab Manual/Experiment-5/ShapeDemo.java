class Shape {
    void display() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void display() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void displaySquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.display();
        sq.displaySquare();
        ((Shape) sq).display();
        System.out.println("Rishika Sharma 24csu173");
    }
}
