public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0}; // Input array

        // Selection sort algorithm for sorting in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the first element of the unsorted part is the largest
            int maxIndex = i;

            // Find the index of the largest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element of the unsorted part
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        // Display the sorted array
        System.out.print("Sorted Array in Descending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
