public class binarySearch{
	public static int binarySearch(int[] array,int element){
		int left = 0; 
		int right = array.length - 1;
		
		while(left <= right){
			int mid = left + (right - left) / 2;
			
			if(array[mid] == element) return mid;
			
			if(element > array[mid]){
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] num = {0,5,2,9,7,8,9};
		int x = 9/2;
		
		//System.out.println(binarySearch(num,9));
		System.out.println(x);
		
	}
}