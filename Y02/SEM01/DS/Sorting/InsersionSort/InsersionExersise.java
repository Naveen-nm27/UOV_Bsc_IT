class InsertionSortEX {

    public static void sort(char arr[]) {
        for (int i = 1; i < arr.length; i++) {
            char key = arr[i];
            int j = i - 1;


            while (j >= 0 && Character.toLowerCase(arr[j]) > Character.toLowerCase(key)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(char arr[]) {
        for (char ch : arr) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String input = "Mango";
        char[] ch1 = input.toCharArray();

        System.out.println("Before");
        printArray(ch1);

        sort(ch1);

        System.out.println("After");
        printArray(ch1);
    }
}
