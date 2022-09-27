package search.interpolationSearch;

public class InterpolationSearch {
    public static int interpolationSearch(int[] A, int target) {
        // base case
        if (A == null || A.length == 0) {
            return -1;
        }

        // search space is A[left…right]
        int left_index = 0;
        int right_index = A.length - 1;

        while (A[right_index] != A[left_index] && target >= A[left_index] && target <= A[right_index]) {
            // estimate mid
            int mid = left_index + ((target - A[left_index])
                    * (right_index - left_index)
                    / (A[right_index] - A[left_index]));

            // key is found
            if (target == A[mid]) {
                return mid;
            }
            // discard all elements in the right search space, including middle element
            else if (target < A[mid]) {
                right_index = mid - 1;
            }
            // discard all elements in the left search space, including middle element
            else {
                left_index = mid + 1;
            }
        }

        // if the key is found
        if (target == A[left_index]) {
            return left_index;
        }

        // target doesn't exist in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 6, 8, 9, 10};
        int key = 9;

        int index = interpolationSearch(A, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}