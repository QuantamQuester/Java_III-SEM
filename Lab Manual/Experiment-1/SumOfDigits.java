import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100;        // hundreds place
        int d2 = (num / 10) % 10;  // tens place
        int d3 = num % 10;         // ones place

        int sum = d1 + d2 + d3;

        System.out.println("Sum of digits: " + sum);
        System.out.println("Rishika Sharma 24csu173");

        sc.close();
    }
}
