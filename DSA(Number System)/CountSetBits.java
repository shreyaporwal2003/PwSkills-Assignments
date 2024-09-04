public class CountSetBits {
    public static void main(String[] args) {
        int number = 29;
        System.out.println("Number of set bits in " + number + ": " + countSetBits(number)); // Example Output
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
