public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0}; // Input array

        // Insertion sort algorithm for sorting in descending order
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are less than key to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        // Display the sorted array
        System.out.print("Sorted Array in Descending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
