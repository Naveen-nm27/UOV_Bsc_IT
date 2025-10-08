// packages here 
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

public class Main{
	public static void main(String[] args){
		Scanner o1= new Scanner(System.in);
		
		// get the number
		System.out.print("Enter number: ");
		int number= o1.nextInt();
		
		// stack object
		Stack stack= new Stack(32);
		
		while(number > 0){
			int remainder;				// declare variable for remainder
			remainder= number % 2;		// remainder is modulus of number
			stack.Push(remainder);		// store remainder in stack
			number= number / 2;			// number is number divided by 2;
		}
		
		// get elements from stack till empty
		while(!stack.isEmpty()){
			System.out.println(stack.Pop());
		}
	}
}