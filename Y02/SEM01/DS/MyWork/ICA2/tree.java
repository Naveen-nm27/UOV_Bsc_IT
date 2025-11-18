class Node{
	Node left,right;
	int value;
	
	Node(int value){
		this.value = value;
	}
}

class BinaryTree{
	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	public void treverseInorder(Node root){
		if(root != null){
			treverseInorder(root.left);
			System.out.print(root.value + " ");
			treverseInorder(root.right);
		}
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(280);
		tree.root.left = new Node(180);
		tree.root.left.left = new Node(156);
		tree.root.left.left.left = new Node(12);
		tree.root.left.right = new Node(255);
		tree.root.left.right.right= new Node(275);
		tree.root.right = new Node(308);
		tree.root.right.right = new Node(416);
		tree.root.right.right.left = new Node(350);
		tree.root.right.right.right = new Node(580);
		tree.root.right.left = new Node(298);
		
		System.out.println("Preorder");
		tree.treverseInorder(tree.root);
	}
}