class RecursionIncDemo{

	public void incPrint(int n){
			
		System.out.println(n);
			if(n <= 1){
				System.out.println("end");
			} else {
				incPrint(n - 1);
				
			}
	}
	
	public static void main(String args[]) {
		RecursionIncDemo rec = new RecursionIncDemo();
		
		rec.incPrint(20);
		
	}
}