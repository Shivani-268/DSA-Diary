import java.util.*l
public class Main {

    // Recursive function to calculate factorial of a number
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Define the number to compute factorial
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Call the factorial function and print the result
        System.out.println(factorial(n));
    }
}
