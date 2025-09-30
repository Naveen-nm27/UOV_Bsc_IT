class Fibonachi{
	public int fibonachi(int n){
		if(n == 0){
			return n;
		} else if(n == 1){
			return n;
		} else {
			return fibonachi(n - 1) + fibonachi(n - 2);
		}
	}
	
	public static void main(String args[]){
		Fibonachi fib  = new Fibonachi();
		System.out.println(fib.fibonachi(10));
	}
}