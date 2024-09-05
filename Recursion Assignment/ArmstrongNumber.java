public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n1 = 153;
        int n2 = 134;
        System.out.println(n1 + " is an Armstrong number: " + (isArmstrong(n1) ? "Yes" : "No")); // Output: Yes
        System.out.println(n2 + " is an Armstrong number: " + (isArmstrong(n2) ? "Yes" : "No")); // Output: No
    }
}
