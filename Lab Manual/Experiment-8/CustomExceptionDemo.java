class MyCustomException extends Exception {
    private String message;

    public MyCustomException(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Exception Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a user-defined exception!");
        } 
        catch (MyCustomException e) {
            e.displayMessage();
        } 
        finally {
            System.out.println("Rishika Sharma (24csu173)");
        }
    }
}
