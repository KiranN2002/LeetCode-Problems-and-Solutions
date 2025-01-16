import java.util.Scanner;

public class Insertion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = s.nextInt();
        int[] a = new int[n + 1]; // Create an array with extra space for insertion
        int i, item, pos;

        System.out.println("Enter " + n + " elements");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Array before insertion:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter the element to be inserted:");
        item = s.nextInt();
        System.out.println("Enter the position (1-based index) to insert the element:");
        pos = s.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position! Please enter a position between 1 and " + (n + 1));
        } else {
            // Shift elements to the right to make space for the new element
            for (i = n; i >= pos; i--) {
                a[i] = a[i - 1];
            }
            a[pos - 1] = item; // Insert the new element
            n++; // Increment the size

            System.out.println("Array after insertion:");
            for (i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }
        s.close();
    }
}