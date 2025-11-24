class MergeExercise {

    public static void mergeSort(char[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        char[] left = new char[mid];
        char[] right = new char[arr.length - mid];

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

    private static void merge(char[] arr, char[] left, char[] right) {
        int i = 0, j = 0, k = 0;

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

    public static void main(String[] args) {
        String input = "mango";

        System.out.println("Original string: " + input);

        char[] chars = input.toCharArray();

        mergeSort(chars);

        String sorted = new String(chars);

        System.out.println("Sorted string: " + sorted);
		
		
    }
}
