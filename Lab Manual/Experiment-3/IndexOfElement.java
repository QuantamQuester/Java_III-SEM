import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
        int index = -1;
        for (int i = 0; i < n; i++) if (arr[i] == x) { index = i; break; }
        System.out.println("Index: " + index);
        System.out.println("Rishika Sharma 24csu173");
        sc.close();
    }
}
