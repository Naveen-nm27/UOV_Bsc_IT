import java.util.Scanner;

class Stack{
	private int size;
	private int stack[];
	private int top= -1;
	
	Stack(int size){
		this.size=size;
		stack= new int[this.size];
	}
	public void Display(){
		for(int i= 0; i <= top; i++){
			System.out.print(stack[i]+ " ");
		}
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == (size -1);
	}
	
	public int Peek(){
		return stack[top];
	}
	
	public void Push(int value){
		if(isFull()){
			System.out.println("Warning: Stack is full.");
		}else{
			top++;
			stack[top]= value;
		}
	}
	
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

public class PrimeFactors{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		Stack stack= new Stack(60);
		
		// get number 
		System.out.print("Enter number: ");
		int number= sc.nextInt();
		
		for(int i= 2; i <= number; i++){	// start i by 2
			while(number % i ==0){			// check whether divisible
				stack.Push(i);				// then push i
				number= number/i;			// update number divided by i
			}
		}
		
		System.out.print("Prime Factors in Descending Order: ");
		while(!stack.isEmpty()){
			System.out.print(stack.Pop()+ " ");
		}
	}
}