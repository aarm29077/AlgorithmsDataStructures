package search.binarySearch;

public class IterativeBinarySearch {

    int binarySearch(int[] arr, int findingValue, int low, int high) {
        while (low <= high) {
            int middleIndex = low + (high - low) / 2;
            if (findingValue == arr[middleIndex]) {
                return arr[middleIndex];
            }
            if (findingValue > arr[middleIndex]) {
                low = middleIndex + 1;
            }
            if (findingValue < arr[middleIndex]) {
                high = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeBinarySearch ob = new IterativeBinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }

}