public class MergeSort {


    public static void mergeSort(int[] arr) {

        if (arr.length <= 1) {
            return;
        }


        int mid = arr.length / 2;


        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

      
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }


        mergeSort(left);
        mergeSort(right);


        merge(arr, left, right);
    }


    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // index for left array
        int j = 0; // index for right array
        int k = 0; // index for merged array


        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
