import java.util.*;

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
		Stack stack = new Stack(100);
		
		stack.baseConverter(256,2);
		
		stack.print();
		
		// stack.converter(15);
	}
}

//import java.util.*;
// public class BaseCovo{
	
// }

// public void converter(){
	// ArrayStack ab = new ArrayStack(10);
	

	// while(num > 0){
		// ab.push(num % base);
		// num = num / base;
	// }
	
	// while (!ab.isEmpty())
		// System.out.println(ab.pop())
// }


// public void converterb16(){
	// ArrayStack ab = new ArrayStack(10);
	

	// while(num > 0){
		// ab.push(num % base);
		// num = num / base;
	// }
	
	// char arr[] = {'A','B','C','D','E','F'};
	// String base16 = "";
	// while(!ab.isEmpty()){
		// int degit = ab.pop();
		
		// if(degit >= && drgit <10)
			// base16 = base16 + degit;
		// else
			// base16 = base16 + arr[degit%10];
	// }
	// System.out.println(base16)

// }
