import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of array values: " + sum); // Output: 120
    }
}
