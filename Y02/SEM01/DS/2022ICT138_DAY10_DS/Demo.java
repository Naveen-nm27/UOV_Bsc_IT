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
	
 public boolean isPalindrom(String string){
		 int left = 0;
		 int right = string.length() - 1;
		 
		 String str = string.toLowerCase();
		 
	 while (left < right) {
		if(str.charAt(left) != str.charAt(right)){
			return false;
		}
		left ++;
		right --;
	}
	return true;
 }
 
 //Answer
 
 piublic boolean check_phrase(){
	 // ArrayStackChar asc = new ArrayStackChar(50);
// public void isPalindrom(){
	 // str = str.toLowerCase();
 // int len = str.length();
 // String fil="";
 // for(int i = 0; i < len; i++){
	 // char ch = str.charAt(i);
	 // if(Character.isLetter(ch) || Character.isDegit(ch)){
		// asc.push(ch);
		// fill = fill + ch;
	 // }		 
 // }
 
 // String reverse ="";
 // while(!asc.isEmpty()){
	 // reverse = reverse + asc.pop();
 // }
 // if(filtered.equals(reverse))
	 // return true;
 // return false;
 // }
 }
 
}

class App{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(5);

		
		stack.push("lime");
		stack.push("Spider");
		stack.push("Eat");
		stack.push("Sophie");
	
		
		stack.print();
		System.out.println();
		System.out.println(stack.isPalindrom("madam"));
	}
}