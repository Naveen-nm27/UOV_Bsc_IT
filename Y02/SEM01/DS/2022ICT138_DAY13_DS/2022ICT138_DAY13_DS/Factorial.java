class FactorialDemo{
	
	public int factorial(int n){
		if(n == 1 || n == 0){
				return 1;
		} else {
			return n * factorial(n - 1);
		}

	}
	
	public static void main(String args[]){
		FactorialDemo fac = new FactorialDemo();
		System.out.println(fac.factorial(4));
	}
}