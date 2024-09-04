public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array in Descending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}