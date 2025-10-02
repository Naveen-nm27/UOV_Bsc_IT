import java.util.Stack;

class StackDemo{
	public static void main(String args[]){
		Stack<String> stack  = new Stack<String>();
		
		System.out.println(stack.empty());
		
		stack.push("Doom");
		stack.push("GTA V");
		stack.push("FFVII");
		
		System.out.println(stack.empty());
		
		System.out.println(stack);
		
		// stack.pop();
		
		// System.out.println(stack);
		
		// stack.pop();
		
		// System.out.println(stack);
		
		System.out.println(stack.search("GTA V"));
		
		
		
		
	}
}