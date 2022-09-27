package search.binarySearch;

public class RecursiveBinarySearch {

    int binarySearch(int array[], int findingValue, int low, int high) {

        if (high >= low) {
            int middleIndex = low + (high - low) / 2;

            if (array[middleIndex] == findingValue)
                return array[middleIndex];

            if (array[middleIndex] > findingValue)
                return binarySearch(array, findingValue, low, middleIndex - 1);

            return binarySearch(array, findingValue, middleIndex + 1, high);

        }
        return -1;
    }

    public static void main(String args[]) {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 4;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}