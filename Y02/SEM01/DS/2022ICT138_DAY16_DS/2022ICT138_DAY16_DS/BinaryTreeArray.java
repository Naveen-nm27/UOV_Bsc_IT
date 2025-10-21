class BinarytreeArray{
	int size;
	int[] tree;
	
	BinarytreeArray(int size){
		this.size = size;
		tree = new int[size];
		for(int i = 0;i < size;i++){
			tree[i] = -1;
		}
	}
	
	public void setroot(int value){
		tree[0] = value;
	}
	
	public void setLeft(int parentIndex,int value){
		int leftIndex = 2 * parentIndex + 1;
		if(leftIndex < size){
			tree[leftIndex] = value;
		} else {
			System.out.println("left child index out of range!");
		}
	}
	public void setRight(int parentIndex,int value){
		int rightIndex = 2 * parentIndex + 2;
		if(rightIndex < size){
			tree[rightIndex] = value;
		} else {
			System.out.println("Right child index out of Range!");
		}
	}

	public void inOrder(int index){
		if(tree[index]!=-1){
			inOrder(2 * index + 1);
			System.out.println(tree[index] + " ");		
			inOrder(2 * index + 2);
		}

 	}
	
	public void preOrder(int index){
		if(tree[index]!=-1){
			System.out.println(tree[index] + " ");
			preOrder(2 * index + 1);
			preOrder(2 * index + 2);
		}

 	}
	
	public void postOrder(int index){
		if(tree[index]!=-1){
			postOrder(2 * index + 1);
			postOrder(2 * index + 2);
			System.out.println(tree[index] + " ");
		}

 	}
	
	
	public static void main(String args[]) {
		BinarytreeArray bta = new BinarytreeArray(12);
		bta.setroot(50);
		bta.setLeft(0, 45);
		bta.setRight(0, 35);
		bta.setLeft(1, 12);
		bta.setRight(1, 12); 

		System.out.println("Preorder:");
		bta.preOrder(0);
		System.out.println("Inorder:");
		bta.inOrder(0);
		System.out.println("Postorder:");
		bta.postOrder(0);
	}
}