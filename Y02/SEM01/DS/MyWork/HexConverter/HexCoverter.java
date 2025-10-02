class Stack{
	int maxSize;int top = -1;
	Object [] stackArray;
	
	Stack(int size){
		maxSize = size;
		stackArray = new Object[maxSize];
	}
	
	public boolean isFull(){
		return top == maxSize - 1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(Object element){
		top++;
		stackArray[top] = element;
	}
	
	public void pop(){
		stackArray[top] = 0;
		top--;
	}
	
	public Object peek(){
		return stackArray[top];
	}
	
	public void print(){
		System.out.print("[");
		for(int i = 0; i <= top; i++){
			System.out.print(stackArray[i]);
		}
		System.out.print("]");
	}
	
	public void hexConverter(int element){
		char[] hexArr = {'A','B','C','D','E','F'};
		
		while(element > 0){
			
			int mod = element % 16;
			//System.out.println("1 "+ mod + " " + element);
			element = element / 16;
			//System.out.println("2 " + mod + " " + element);
			//System.out.println(mod + " " + element);
			
			
			if(mod < 10){
				push(mod);
				//System.out.println("3 "+ mod + " " + element);
			} else {
				for(int k = 10,i = 0;k <= 15;k++,i++){
					//System.out.println("4 " + mod + " " + element);
					if(mod == k){
						//System.out.println("5 " + mod + " " + element);
						push(hexArr[i]);
					}
					//System.out.println("6 " + mod + " " + element);
				}
			}
			//System.out.println("7 " + mod + " " + element);
		}													
	}
}

public class HexCoverter{
	public static void main(String args[]){
		Stack stack  = new Stack(20);
		
		stack.hexConverter(Integer.valueOf(255));

		stack.print();
	}
}
//isFull()
//isEmpty
//push
//pop
//peek
//print
//baseConverter
