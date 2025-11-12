interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void stop();
}

class Sedan implements Car {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Sedan s = new Sedan();
        s.start();
        s.stop();
    }
}
