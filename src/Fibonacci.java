public class Fibonacci {
    public static void fibo(int n) {
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " "); // Print Fibonacci number in the same line
            int n3 = n1 + n2; // Calculate the next Fibonacci number
            n1 = n2; // Update n1 to the next value
            n2 = n3; // Update n2 to the next value
        }
        System.out.println(); // Print a newline after the sequence
    }

    public static void main(String[] args) {
        int n = 3;// Number of Fibonacci numbers to print
        fibo(n);
    }
}
