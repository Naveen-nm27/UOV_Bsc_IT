import java.util.Scanner;

class Stack{
	int maxSize , top = -1;
	String[] stackArray;
	
	Stack(int size){
		maxSize = size;
		stackArray = new String[maxSize];
	}
	
	public boolean isFull(){
		return top == maxSize - 1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(String x){
		if(isFull()){
			System.out.println("Stack Overflow");

		} else {
			top++;
			stackArray[top] = x;
		}
	}
	
	
	public String pop(){
		String topTemp = stackArray[top];
		
		stackArray[top] = null;
		top--;
		
		return topTemp;
		
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("stack underflow");
			return null;
		} else {
			return stackArray[top];
		}
	}
	
	public void print(){
		System.out.print("[ ");
		for(int i = 0; i <= top;i++){
			System.out.print(stackArray[i]);
			System.out.print(", ");
		}
		System.out.print(" ]");
	}
	
	public boolean isPalindrom(){
		boolean pal = false;
			
		for(int i = 0; i <= top;i++){
			char[] charStack = new char[stackArray[i].length()];
			for(int k = stackArray[i].length();k >= 0;k--){
				charStack[i] = stackArray[i].charAt(k);
			}
			
			for(int j = 0;j <= stackArray[i].length();j++){
				if(charStack[j] == stackArray[i].charAt(j)){
					pal = true;
				}
			}
			pal = false;
		}
		
		return pal;
	}
}

class App{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(5);

		stack.push(sc.nextLine());
		// stack.push("lime");
		// stack.push("Spider");
		// stack.push("Eat");
		// stack.push("Sophie");
		stack.print();
		System.out.println(stack.peek());
		System.out.println(stack.isPalindrom());
	}
}