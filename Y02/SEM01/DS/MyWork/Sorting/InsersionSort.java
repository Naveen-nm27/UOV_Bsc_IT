import java.util.Random;

public class InsersionSort {
	public static void main(String args[]){
		int size = 11;
		int[] array = new int[size];
		Random rand =  new Random();
		for(int i = 0; i < size;i++){
			array[i] = rand.nextInt(size);
		}
		    
		System.out.println("Before:");
		printArrayList(array);
		
		insersionSort3(array);
		
		System.out.println("After:");
		printArrayList(array);
	}
	
	public static void insersionSort3(int[] inputArray){
		for(int i = 1; i < inputArray.length;i++){
			int cuurentValue  = inputArray[i];
			int j = i - 1;
			while(j >= 0 && inputArray[j] > cuurentValue){
				inputArray[j + 1] = inputArray[j];
				j--;
			}
			inputArray[j + 1] = cuurentValue;
		}
	}
	
	// public static void insersionSort(int[] inputArray){
		// for(int i = 1;i < inputArray.length;i++){
			// int cuurentValue = inputArray[i];
			
			// int j = i - 1;
			// while(j >= 0 && inputArray[j] > cuurentValue){
				// inputArray[j + 1] = inputArray[j];
				// j--;
			// }
			// inputArray[j + 1] = cuurentValue;
		// }
	// }
	
	
	public static void insersionSort4(int[] arr){
		
		for(int i = 1;i < arr.length;i++){
			int cuurentValue = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > cuurentValue){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = cuurentValue;
		}
	}
	
	private static void printArrayList(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
		  System.out.println(numbers[i]);
		}
  }
}
	