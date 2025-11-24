import java.util.Random;

public class BubbleSort{
	public static void main(String[] args){
		int size = 1000000000;
		int[] array = new int[size];
		Random rand =  new Random();
		for(int i = 0; i < size;i++){
			array[i] = rand.nextInt(1000000000);
		}
		
		System.out.println("Before:");
		printArray(array);
		
		bubleSort(array);
		
		System.out.println("After:");
		printArray(array);
		
		
	}
	
	public static void bubleSort(int[] arr){
		
		boolean swapped = true;
		
		while(swapped){
			swapped = false;
			for(int i = 0;i < arr.length - 1;i++){
				if(arr[i] > arr[i + 1]){
					swapped = true;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
		  System.out.println(numbers[i]);
		}
	  }
}