import java.util.Scanner;

class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values in array");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int rev[] = new int[5];
        for (int i = 4; i >= 0; i--) {
            rev[5 - i - 1] = arr[i];
        }
        System.out.print("Original : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nReverse : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println("\nRishika Sharma 24csu173");
    }
}
