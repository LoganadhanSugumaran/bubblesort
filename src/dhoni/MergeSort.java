package dhoni;


public class MergeSort {

    // Merge two sorted arrays into a single sorted array
    public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;

        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightLength) {
            arr[k++] = rightArr[j++];
        }
    }

    // Merge sort function
    public static void mergeSort(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            return;
        }

        int mid = length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        // Divide the array into two subarrays
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = mid; i < length; i++) {
            rightArr[i - mid] = arr[i];
        }

        // Recursively sort the subarrays
        mergeSort(leftArr);
        mergeSort(rightArr);

        // Merge the two sorted subarrays
        merge(arr, leftArr, rightArr);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 7, 1, 4};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}









