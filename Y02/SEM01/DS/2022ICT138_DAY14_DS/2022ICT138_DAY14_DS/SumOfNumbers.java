class SumOfNum{
	
	public int sumOfNum(int n){
		if(n <= 0){
				return 1;
		} else {
			return n + sumOfNum(n - 1);
		}

	}
	
	public static void main(String args[]){
		SumOfNum sum = new SumOfNum();
		System.out.println(sum.sumOfNum(10));
	}
}