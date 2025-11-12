class BaseLevelException extends Exception {
    public BaseLevelException(String message) {
        super(message);
    }
}

class LevelTwoException extends BaseLevelException {
    public LevelTwoException(String message) {
        super(message);
    }
}

class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}

class A {
    public void show() throws BaseLevelException {
        throw new BaseLevelException("Exception from A: BaseLevelException thrown.");
    }
}

class B extends A {
    public void show() throws LevelTwoException {
        throw new LevelTwoException("Exception from B: LevelTwoException thrown.");
    }
}

class C extends B {
    @Override
    public void show() throws LevelThreeException {
        throw new LevelThreeException("Exception from C: LevelThreeException thrown.");
    }
}

public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.show();
        } catch (LevelThreeException e) {
            System.out.println("Caught LevelThreeException: " + e.getMessage());
        } catch (LevelTwoException e) {
            System.out.println("Caught LevelTwoException: " + e.getMessage());
        } catch (BaseLevelException e) {
            System.out.println("Caught BaseLevelException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed cleanup final message.");
            System.out.println("Rishika Sharma (24csu173)");
        }
    }
}
