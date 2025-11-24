import java.util.Random;

public class MergeSort {
	public static void main(String args[]){
		int size = 1000000;
		int[] array = new int[size];
		Random rand =  new Random();
		for(int i = 0; i < size;i++){
			array[i] = rand.nextInt(1000000);
		}
		    
		System.out.println("Before:");
		printArrayList(array);
		
		mergeSort(array);
		
		System.out.println("After:");
		printArrayList(array);
	}
	
	
	// public static void mergeSort(int[] inputArray) {
		
		// int inputLength = inputArray.length;

		// if (inputLength < 2) {
			// return;
		// }

		// int midIndex = inputLength / 2;
		// int leftHalf[] = new int[midIndex];
		// int rightHalf[] = new int[inputLength - midIndex];

		// for (int i = 0; i < midIndex; i++) {
			// leftHalf[i] = inputArray[i];
		// }

		// for (int i = midIndex; i < inputLength; i++) {
			// rightHalf[i - midIndex] = inputArray[i];
		// }

		// mergeSort(leftHalf);
		// mergeSort(rightHalf);

		// merge(inputArray,leftHalf,rightHalf);
	// }

	// public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		// int leftSize = leftHalf.length;
		// int rightSize = rightHalf.length;

		// int i = 0, j = 0, k = 0;

		// while (i < leftSize && j < rightSize) {
			// if (leftHalf[i] <= rightHalf[j]) {
				// inputArray[k] = leftHalf[i];
				// i++;
			// } else {
				// inputArray[k] = rightHalf[j];
				// j++;
			// }
			// k++;
		// }

		// while (i < leftSize) {
			// inputArray[k] = leftHalf[i];
			// i++;
			// k++;
		// }

		// while (j < rightSize) {
			// inputArray[k] = rightHalf[j];
			// j++;
			// k++;
		// }
	// }
	
	
	public static void mergeSort(int[] inputArray){
		int inputLength = inputArray.length;
		
		if(inputLength < 2){
			return;
		}
		
		int mid_index = inputLength / 2;
		int leftArr[] = new int[mid_index];
		int rigtArr[] = new int[inputLength- mid_index];
		
		for(int i = 0;i < mid_index;i++){
			leftArr[i] = inputArray[i];
		}
		
		for(int i = mid_index;i < inputLength;i++){
			rigtArr[i - mid_index] = inputArray[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rigtArr);
		
		merge(inputArray,leftArr,rigtArr);

	}
	
	public static void merge(int[] input,int[] left,int[] right){
		int leftlen = left.length;
		int rightlen = right.length;
		
		int i = 0,j = 0,k = 0;
		
		
		while(i < leftlen && j < rightlen){
			if(left[i] < right[j]){
				input[k] = left[i];
				i++;
			} else {
				input[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < leftlen){
			input[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightlen){
			input[k] = right[j];
			j++;
			k++; 
		}
		
		
	}
	

	public static void printArray(int[] input) {
		StringBuilder sb = new StringBuilder("[ ");
		
		for(int i = 0;i < input.length;i++){
			sb.append(input[i]);
			if(i < input.length - 1){
				sb.append(", ");
			}
		}
		sb.append(" ]");
		System.out.println(sb.toString());
	}
	
	private static void printArrayList(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
		  System.out.println(numbers[i]);
		}
  }
}