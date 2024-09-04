public class OddOrEven {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        System.out.println(num1 + " is " + (isEven(num1) ? "Even" : "Odd")); // Output: Even
        System.out.println(num2 + " is " + (isEven(num2) ? "Even" : "Odd")); // Output: Odd
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
