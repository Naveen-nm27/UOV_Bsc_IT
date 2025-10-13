class Node{
	String element;
	Node left;
	Node right;
	
	Node(String element){
		this.element = element;
	}
}
class BinaryTree{
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	public void trverseInorder(Node root){
		if(root != null){
			trverseInorder(root.left);
			System.out.print(root.element + "  ");
			trverseInorder(root.right);
		}
	}
	
	public void preOrder(Node root){
		if(root!=null){
			System.out.print(root.element + "  ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	// public void preOrder(Node root){
		// StringBuilder sb = new StringBuilder("[");
		// if(root!=null){
			// sb.append(root.element + " , ");
			// preOrder(root.left);
			// preOrder(root.right);
		// }
		// sb.append("\b]");	
		// sb.toString();

	// }
	
	public void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.element + "  ");
			
		}
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		
		
		tree.root = new Node("A");
		tree.root.left = new Node("B");
		tree.root.left.right = new Node("C");
		tree.root.right = new Node("D");
		tree.root.right.left = new Node("E");
		tree.root.right.right = new Node("G");
		tree.root.right.left.left = new Node("F");
		tree.root.right.right.left = new Node("H");
		tree.root.right.right.right = new Node("I");

	
		System.out.println("In Order");
		tree.trverseInorder(tree.root);
		System.out.println();
		System.out.println("Post Order");
		tree.postOrder(tree.root);
		System.out.println();
		System.out.println("Pre Order");
		tree.preOrder(tree.root);
	}
}