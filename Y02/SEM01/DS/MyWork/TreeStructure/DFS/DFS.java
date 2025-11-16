package DFS;
import java.util.Stack;

public class DFS{
public void depthFirst(Node root){
	Stack<Node> stack = new Stack<>();
	stack.push(root);
	while(stack.size() > 0){
		Node current = stack.pop();
		System.out.println(current.toString());

		if(current.left != null){
			stack.push(current.left);
		}

		if(current.right != null){
			stack.push(current.right);
		}
	}
}


	public static void main(String args[]){
		Node node = new Node(25);
		node.left = new Node(15);
		node.right = new Node(25);
		node.right.right = new Node(70);
		node.right.left = new Node(35);
		node.right.right.right = new Node(90);
		node.right.right.left = new Node(66);
		node.right.left.right = new Node(44);
		node.right.left.left = new Node(31);
		node.left.right = new Node(22);
		node.left.left = new Node(10);
		node.left.right.right = new Node(24);
		node.left.right.left = new Node(18);
		node.left.left.right = new Node(12);
		node.left.left.left = new Node(4);

		new DFS().depthFirst(node);
	}
}