class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

interface Domestic {
    void home();
}

class Dog extends Animal implements Pet, Domestic {
    public void play() {
        System.out.println("Dog is playing");
    }

    public void home() {
        System.out.println("Dog lives at home");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.home();
    }
}
