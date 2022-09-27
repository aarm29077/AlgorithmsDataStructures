package sorting.bubbleSort;

public class BubbleSortRecursion {
    public static void bubbleSort(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 2, 5, 1};
        bubbleSort(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
