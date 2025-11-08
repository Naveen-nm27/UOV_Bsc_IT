class BubbleSort {
	public static void main(String[] arg){
		int[] arr = {5,3,8,4,2};
		
		System.out.println("Befor Sorting: ");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.println("After Sorting: ");
		printArray(arr);
	}
	
	public static void bubbleSort(int[] arr){
		int n = arr.length;
		boolean swaped;
		
		for(int i = 0; i < n - 1;i++){
			swaped = false;
			
			for(int j = 0; j < n - 1;j++){
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;
				}
			}
			if(!swaped) break;
		}
		
		
	}

public static void printArray(int[] arr){
	for(int num: arr){
		System.out.println(num + " ");
	}
	System.out.println();
}

}