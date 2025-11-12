import java.util.Scanner;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CommandLineSum {
    public static void main(String[] args) {
        try {
            int sum = 0;

            if (args.length < 5) {
                throw new CheckArgumentException("Error: Less than 5 arguments passed!");
            }

            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum of all five numbers: " + sum);
            System.out.println("Rishika Sharma (24csu173)");

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter 5 integer values correctly:");

            Scanner sc = new Scanner(System.in);
            int sum = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter number " + i + ": ");
                sum += sc.nextInt();
            }

            System.out.println("Sum of all five numbers: " + sum);
            System.out.println("Program executed by: Rishika Sharma (24csu173)");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}
