import java.util.Scanner;

class Stack{
	int maxSize , top = -1;
	int[] stackArray;
	

	Stack(int size){
		maxSize = size;
		stackArray = new int[maxSize];	
	}
	
	public boolean isFull(){
		return top == maxSize - 1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(int d){
		if(isFull()){
			System.out.println("Stack Overflow");
		} else {
			top++;
			stackArray[top] = d;
		}
	}
	
	public int pop(){
		int topTemp = stackArray[top];
		
		stackArray[top] = 0;
		top--;
		
		return topTemp;
	}
	
	public int peek(){
			if(isEmpty()){
				System.out.println("Stack Underflow");
				return 0;
			} else {
				return stackArray[top];
		}
	}
	
	public void print(){
		System.out.print("[");
		for(int i = top;i >= 0;i--){
			System.out.print(stackArray[i]);
		}
		System.out.print("]");
	}
	
	public void baseConverter(int value,int base){
		while(value > 0){
			push(value % base);
			value = value / base;
		}
	}
		 
}

public class baseConcerstion{
	public static void main(String args[]){
		Stack stack = new Stack(50);
		
		stack.baseConverter(12,2);
		
		stack.print();
	}
}