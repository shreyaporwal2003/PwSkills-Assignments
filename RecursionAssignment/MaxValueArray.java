import java.util.Arrays;

public class MaxValueArray {

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int maxValue = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        System.out.println("Maximum value in the array: " + maxValue); // Output: 22
    }
}
