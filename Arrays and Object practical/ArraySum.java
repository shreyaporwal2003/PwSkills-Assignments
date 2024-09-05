public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
