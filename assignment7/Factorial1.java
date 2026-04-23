public class Factorial1 {
    public static int factorial(int n) {
        if (n<0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        if (result == -1) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
}
