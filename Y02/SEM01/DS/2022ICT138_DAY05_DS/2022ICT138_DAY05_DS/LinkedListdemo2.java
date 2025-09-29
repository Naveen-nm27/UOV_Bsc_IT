// interface Linearlist{
	// public boolean isEmpty();
	// public Object get(int index);
	// public int indexOf(Object element);
	// public Object remove(int index);
	// public void add(int index,Object obj);
	// public String toString();
// }

class ChainNode{
	//declare the variables
	Object element;
	ChainNode next;
	
	ChainNode(Object element, ChainNode next){
		this.element = element;
		this.next = next;
	}
	
	public void displayNode(){
		System.out.println("{" + element + "}");
	}
}

class Chain{
	
	private ChainNode firstNode;
	private int size;

	public Chain(){
		firstNode = new ChainNode(null,null);
		size = 0;
	}

	public boolean isEmpty(){
		if (size == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public int size(){
		return size;
	}

	public Object get(int index){
		ChainNode p = firstNode;
		for(int i = 0; i < index;i++){
			p = p.next;
			return p.element;
		}
	}
	
	// public int indexOf(Object element){
		
	// }
	
	// public Object remove(int index){
		
	// }
	
	// public Object add(int index,Object obj){
		
	// }
}

class Demo{
	public static void main(String[] args){
		
	}
}