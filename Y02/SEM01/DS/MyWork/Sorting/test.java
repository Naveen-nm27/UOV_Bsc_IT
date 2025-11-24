public class test{
	public static void selectionSort(int[] num){
		int arrayLength = num.length;

		for(int i = 0;i < arrayLength - 1;i++){
			int min = num[i];
			int index = i;

			for(int j = i + 1;j < arrayLength;j++){
				if(num[j] > min){
					min = num[j];
					index = j;
				}
			}
			swap(num,index,min);
		}
	}

	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}

	public static void mergeSort(int[] inputArray){
		int arrayLen = inputArray.length;
		
		if(arrayLen < 2){
			return;
		}

		int midIndex = arrayLen / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[arrayLen - midIndex];

		for(int i = 0;i < midIndex;i++){
			leftHalf[i] = inputArray[i];
		}

		for(int i = midIndex;i < arrayLen;i++){
			rightHalf[i - midIndex] = inputArray[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		//merge
	}

	public static void merge(int[] input,int[] left,int[] right){
		int leftLen = left.length;
		int rightLen = right.length;

		int i = 0,j = 0,k = 0;

		while(i < leftLen && j < rightLen){
			if(left[i] < right[j]){
				input[k] = left[i];
				i++;
			} else{
				input[k] = right[j];
				j++;
			}
			k++;
		}

		while(i < leftLen){
			input[k] = left[i];
			i++;
			k++;
		}

		while (j < rightLen) {
			input[k] = right[j];
			j++;
			k++;
		}
	}
}



