public class PowerOfTwo {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 32;
        System.out.println(n1 + " is power of two: " + isPowerOfTwo(n1)); // Output: False
        System.out.println(n2 + " is power of two: " + isPowerOfTwo(n2)); // Output: True
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
