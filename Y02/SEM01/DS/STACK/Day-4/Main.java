class Stack{
	// declare size of stack
	private int size;
	// create array as stack 
	int stack[]; 
	
	// initialize top value as -1
	private int top= -1;
	
	// create constructor for stack 
	public Stack(int size){
		this.size= size;
		stack= new int[this.size];
	}
	
	// display the stack 
	public void Display(){
		for(int i= 0; i <= top; i++){
			System.out.print(stack[i]+ " ");
		}
		System.out.println(" ");
	}
	
	// isFull(): top < size
	boolean isEmpty(){
		return top == -1;
	}
	
	// isEmpty(): top == -1
	boolean isFull(){
		return top == (size -1);
	}
	
	// return top element
	public int Peek(){
		return stack[top];
	}
	
	// create Push method 
	public void Push(int value){
		if(isFull()){
			System.out.println("Warning: Stack is full.");
		}else{
			top++; // increase top by 1
			stack[top]= value; // then push element to stack
		}
	}
	
	// create pop method 
	public int Pop(){
		int temp= -1;
		if(isEmpty()){
			System.out.println("Warning: Stack is empty.");
		}else{
			temp= stack[top];
			top= top-1;
		}
		return temp;
	} 
}

public class Main{
	public static void main(String args[]){
		Stack stack= new Stack(5);
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.Push(4); // top= 3
		
		stack.Display();
		
		int temp= stack.Pop(); // top= 2
		System.out.println(temp);
		
		stack.Display();
		
		//stack.Push(5); // top= 3
		
		//stack.Display();
		
		//System.out.println(stack.Peek());
		
		for(int i= 0; i<5; i++){
			System.out.print(stack.stack[i]+ " ");
		}
;	}
}
