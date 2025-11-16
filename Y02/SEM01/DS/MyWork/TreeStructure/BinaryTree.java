import DFS.Node;

class Node{
	Node left;
	int element;
	Node right;
	
	Node(int element){
		this.element = element;
	}
	
}

class BinaryTree{
		Node root = null;
		
		public void inOrder(Node root){
			if (root != null){
				inOrder(root.left);
				System.out.println(root.element + " ");
				inOrder(root.right);
			}
		}
		
		public void preOrder(Node root){
			if(root != null){
				System.out.println(root.element + " ");
				preOrder(root.left);
				preOrder(root.right);
			}
		}
		
		public void postOrder(Node root){
			if(root != null){
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.element + " ");
			}
		}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(10);
		tree.root.left = new Node(15);
		tree.root.right = new Node(50);
	}
}