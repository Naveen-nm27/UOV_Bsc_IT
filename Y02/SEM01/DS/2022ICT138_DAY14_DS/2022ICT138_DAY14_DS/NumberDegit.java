class NumberDegit{
	int k = 0;
	public int numOfDegit(int num){
		if(num <= 0){
			return k;
		} else {
			num = num / 10;
			k++;
			numOfDegit(num);
			return k;
		}
	
	}
	
	public static void main(String[] args){
		NumberDegit num =  new NumberDegit();
		System.out.println(num.numOfDegit(45258));
		
	}
}