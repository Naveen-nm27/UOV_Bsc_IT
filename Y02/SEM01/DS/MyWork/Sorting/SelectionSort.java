import java.util.Random;


class Car{
	
}

public class SelectionSort{
	public Car getCar(){
		return Car;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
		  numbers[i] = rand.nextInt(10);
		}
	}
	
	public static void selectionSort(int[] num){
		int len = num.length;
		
		for (int i = 0; i < len - 1;i++){
			int min = num[i];
			int index = i;
			
			for(int j = i + 1; j < len;j++){
				if(num[j] < min){
					min = num[j];
					index = j;
				}
			}
			swap(num, index, min);
		}
	}
	
	public static void swap(int[] num, int a, int b){
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}

}