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
	int max;
	int min;
	
	BinaryTree(){
		root = null;
	}
		
		public void maxMin(Node root){
			if (root == null) return;

			if (this.root == root) {
				max = root.data;
				min = root.data;
			}

			if(root.data > max){
				max = root.data;
			}
			
			if(root.data < min){
				min = root.data;
			}
		
			maxMin(root.left);
			maxMin(root.right);

	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(5);
		tree.root.left = new Node(7);
		tree.root.right = new Node(1);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(15);
		tree.root.right.left = new Node(8);
		tree.root.right.right = new Node(50);
		
		tree.maxMin(tree.root);
		System.out.println();
		
		System.out.println("Max: " + tree.max);
		System.out.println("Min: " + tree.min);

	}
}