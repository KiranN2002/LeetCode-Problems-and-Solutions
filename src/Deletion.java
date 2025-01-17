import java.util.*;

public class Deletion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int key, i, pos = -1, n;

        System.out.println("Enter the size of an array:");
        n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Array before deletion:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter element to delete:");
        key = s.nextInt();

        // Find the position of the element to delete
        for (i = 0; i < n; i++) {
            if (a[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            // Shift elements to the left to overwrite the deleted element
            for (i = pos; i < n - 1; i++) {
                a[i] = a[i + 1];
            }

            System.out.println("Array after deletion:");
            for (i = 0; i < n - 1; i++) { // Reduce the range to exclude the last element
                System.out.println(a[i]);
            }
        } else {
            System.out.println("Element not found");
        }

        s.close();
    }
}
