import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int eCount = 0, oCount = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even[eCount++] = arr[i];
            else odd[oCount++] = arr[i];
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println("\nLength: " + n);
        System.out.print("Even Array: ");
        for (int i = 0; i < eCount; i++) System.out.print(even[i] + " ");
        System.out.println("\nLength: " + eCount);
        System.out.print("Odd Array: ");
        for (int i = 0; i < oCount; i++) System.out.print(odd[i] + " ");
        System.out.println("\nLength: " + oCount);
        System.out.println("Rishika Sharma 24csu173");
        sc.close();
    }
}
