class ArrayDemo{
	public static void main(String args[]){
		int[] array1 = {2,5,4,7,10,12,1,4,8,50};
		int[] array2 = new int[10];
		int temp = array1[0];
		
		for(int i = 0; i < 10;i++){
			if(array1[i]<temp){
				temp = array1[i];
			}
		}
		
		System.out.println("Minimum: " + temp);
		
		for(int i = 0; i < 10;i++){
			if(array1[i]>temp){
				temp = array1[i];
			}
		}
		
		System.out.println("Maximum: " + temp);
		
		temp = 0;
		
		for(int i = 0; i < 10; i++){
			temp+= array1[i];
		}
		
		System.out.println("Total: " + temp);
		
		// for(int i = 0; i < 10; i++){
			// for(int k = 0;k < 10; k++){
				// if(array1[i] > array1[k]){
				// array2[i] = array1[k];
				// }
			// }
		// }
		
		for(int i = 3; i < 6 ; i++){
			if(i == 3){
				array1[i+1] = array1[i];
				array1[3] = 88;
				break;
			}
			for(int j = 3; j < 6 ; j++){
				array1[j+1] = array1[j];
			}
			
		}
		
		
		
		for(int i = 0;i < array1.length;i++){
			System.out.println(array1[i]);	
		}
		
	}
}