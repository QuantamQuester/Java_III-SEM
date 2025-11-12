public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message!");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed program ended successfully.");
            System.out.println("Rishika Sharma (24csu173)");
        }
    }
}
