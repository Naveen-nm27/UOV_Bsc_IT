class treeArray{
	int size;
	int [] tree;
	
	treeArray(int size){
		this.size = size;
		tree = new int[size];
		
		for(int i = 0; i < size;i++){
			tree[i] = -1;
		}
	}
	
	public void setRoot(int element){
		tree[0] = element;
	}
	
	public void setRight(int index,int element){
		int rightIndex  = 2 * index + 1;
		if(index <= size){
			if(index == -1){
				tree[rightIndex] = element;
			} else {
				System.out.println("Index is Alredy Filled");
			}
		} else {
			System.out.println("Index is out of bounds");
		}
	}
	
	public void setLeft(int index,int element){
		int leftIndex  = 2 * index + 2;
		if(index <= size){
			if(index == -1){
				tree[leftIndex] = element;
			} else {
				System.out.println("Index is Alredy Filled");
			}
		} else {
			System.out.println("Index is out of bounds");
		}
	}
	
	public void clear
}