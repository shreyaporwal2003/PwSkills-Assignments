public class AlternateSignSum {

    // Method to calculate the sum of numbers with alternate signs
    public static int alternateSignSum(int n) {
        if (n == 0) {
            return 0;
        }
        // If n is odd, add n, if even, subtract n
        return (n % 2 == 0 ? -n : n) + alternateSignSum(n - 1);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        System.out.println("Sum with alternate signs for n = 10: " + alternateSignSum(n1)); // Output: -5
        System.out.println("Sum with alternate signs for n = 5: " + alternateSignSum(n2));  // Output: 3
    }
}
