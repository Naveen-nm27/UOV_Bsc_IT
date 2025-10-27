class Node {
	int data;
	Node right;
	Node left;
	
	Node(int element){
		this.data = element;
	}
}

class BinaryTree{
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	boolean isEqual = true;
		
	public boolean equals(Node root,BinaryTree tree1,BinaryTree tree2){
		if(root != null){
			if(tree1.root.data != tree2.root.data){
				isEqual = false;
			}
			equals(root.left,tree1,tree2);
			equals(root.right,tree1,tree2);
		}
		
		return isEqual;
	}
	
	public static void main(String[] args){
		BinaryTree tree1 = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();
		
		tree1.root = new Node(5);
		tree1.root.left = new Node(7);
		tree1.root.right = new Node(1);
		tree1.root.left.left = new Node(10);
		tree1.root.left.right = new Node(15);
		tree1.root.right.left = new Node(8);
		tree1.root.right.right = new Node(50);

		
		tree2.root = new Node(5);
		tree2.root.left = new Node(7);
		tree2.root.right = new Node(1);
		tree2.root.left.left = new Node(10);
		tree2.root.left.right = new Node(15);
		tree2.root.right.left = new Node(8);
		tree2.root.right.right = new Node(50);
		
		System.out.println(tree1.equals(tree1.root,tree1,tree2));
		
	}
}