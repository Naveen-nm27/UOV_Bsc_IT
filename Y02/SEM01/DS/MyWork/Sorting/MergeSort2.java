import java.util.Random;

public class MergeSort2{
	public static void main(String arga[]){
		int size = 10;
		
		Random rand = new Random();
		int[] newArr = new int[size];
		
		
		for(int i = 0; i < size;i++){
			newArr[i] = rand.nextInt(1001);
		}
		
		System.out.println("Before");
		mergeSort(newArr);
		System.out.println("After");
	}
	
	public static void mergeSort(int[] inputArray){
		int inputSize = inputArray.length;
		
		if(inputSize < 2){
			return;
		}
		
		int midIndex = inputSize / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputSize - leftHalf.length] ;
		
		for(int i = 0;i < midIndex;i++){
			leftHalf[i] = inputArray[i];
		}
		
		for(int i = midIndex;i < inputSize;i++){
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(inputArray,leftHalf,rightHalf);
		
	}
	
	public static void merge(int[] input,int[] left,int[] right){
		int leftSize = left.length;
		int rightSize = right.length;
		
		int i = 0,j = 0,k = 0;
		
		while(i < leftSize && i < rightSize){
			if(left[i] <= right[j]){
				input[k] = left[i];
				i++;
			} else {
				input[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize){
			input[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightSize){
			input[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void print(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}