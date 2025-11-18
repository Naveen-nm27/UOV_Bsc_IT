// class Node{
	// int element;
	// Node left,right;
	
	// Node(int element){
		// this.element = element;
	// }
// }

// class BinaryTree{
	// Node root;
	
	// BinaryTree(){
		// root=null;
	// }
	
	// void treverseInorder(Node root){
		// if(root != null){
			// treverseInorder(root.left);
			// System.out.print(root.element + " ");
			// treverseInorder(root.right);
		// }
	// }
	
	// void treversePostorder(Node root){
		// if(root != null){
			// treversePostorder(root.left);
			// treversePostorder(root.right);
			// System.out.print(root.element + " ");
		// }
	// }
	
	// void treversePreorder(Node root){
		// if(root != null){
			// System.out.print(root.element + " ");
			// treversePreorder(root.left);
			// treversePreorder(root.right);
		// }
	// }
	
	// public static void main(String[] args){
		// BinaryTree tree = new BinaryTree();
		// tree.root = new Node(280);
		// tree.root.left = new Node(180);
		// tree.root.left.left = new Node(156);
		// tree.root.left.left.left = new Node(12);
		// tree.root.left.right = new Node(255);
		// tree.root.left.right.right= new Node(275);
		// tree.root.right = new Node(308);
		// tree.root.right.right = new Node(416);
		// tree.root.right.right.left = new Node(350);
		// tree.root.right.right.right = new Node(580);
		// tree.root.right.left = new Node(298);
		
		// System.out.println("Preorder");
		// tree.treverseInorder(tree.root);
	// }
// }


public class BinaryTreeArray{
	int[] tree;
	int size;
	
	public BinaryTreeArray(int capasity){
		tree = new int[capasity];
		size = capasity;
		for(int i = 0;i < capasity;i++){
			tree[i] = value;
		}
	}
	
	public boolean isValidIndex(int index){
		return index >= 0 && index < size;
	}
	
	public void setRoot(int value){
		tree[0] = value;
	}
	
	public void setLeftChild(int param,int value){
		int leftIndex = 2 * parent + 1;
		if(isValidIndex(leftIndex)){
			tree[leftIndex] = value;
		} else {
			System.out.println("Left child index out of range");
		}
	}
	
	public void setRightChild

}
