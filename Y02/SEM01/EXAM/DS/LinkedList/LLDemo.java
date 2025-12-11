// interface Linearlist{
	// public boolean isEmpty();
	// public Object get(int index);
	// public int indexOf(Object element);
	// public Object remove(int index);
	// public void add(int index,Object obj);
	// public String toString();
// }

class ChainNode{
	Object element;
	ChainNode next;
	
	ChainNode(Object element,ChainNode next){
		this.element = element;
		this.next = next;
	}
	
	public void displayName(){
		System.out.println("{"+ element +"}");
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
		return size == 0;
	}
	
	public Object ge(int index){
		if(index < 0 || index > size){
			System.out.println("Error in Index");
		} else {
			ChainNode p = firstNode;
			for(int i = 0; i < index;i++){
				p = p.next;
			}
			
			return p.element;
		}
	}
	
	public void add(int index,Object newElement){
		if(index < 0 || index > size){
			System.out.println("Error in index");
		} else if (index == 0){
			ChainNode newNode  = new ChainNode(newElement,null);
		} else {
			ChainNode p = firstNode;
			for(int i = 0; i < index - 1;i++){
				p = p.next;
			}
			
			ChainNode newNode = new ChainNode(newElement,p.next);
			p.next  =newNode;
		}
	}
	
	public Object remove(int index){
		Object removedElement;
		if(index < 0 || index > size){
			System.out.println("Error in index");
		} else if (index == 0) {
			firstNode = firstNode.next;
		} else {
			ChainNode p = firstNode;
			for(int i = 0; i < index - 1;i++){
				p = p.next;
			}
			
			p.next = p.next.next;
			size--;
		}
		
		return removedElement;
	}
}