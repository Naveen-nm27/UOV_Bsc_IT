interface Linearlist{
	public boolean isEmpty();
	public Object get(int index);
	public int indexOf(Object element);
	public Object remove(int index);
	public void add(int index,Object obj);
	public String toString();
}

class ChainNode{
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

class Chain implements Linearlist{
	
	private ChainNode firstNode;
	private int size;

	public Chain(){
		firstNode = new ChainNode(null,null);
		size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}

	public Object get(int index){
		ChainNode p = firstNode;
		for(int i = 0; i < index;i++){
			p = p.next;
		}
		return p.element;
	}
	
	public void add(int index,Object theElement){
		if(index < 0 || index > size)
			System.out.println("Error in Index");
		else if(index == 0)
		{
			firstNode = new ChainNode(theElement,null);
			size++;
		} else
			
		{
			ChainNode p = firstNode;
			for(int i=0; i<index - 1; i++){
				p = p.next;
			}
			ChainNode newNode = new ChainNode(theElement,p.next);
			p.next = newNode;
			
			size++;
		}
	}
	
	//remove
	
	public Object remove(int index){
		
		Object removedElement = null;
		
		if(index < 0 || index > size){
			System.out.println("Error in index");
		} else if(index == 0) {
			firstNode = firstNode.next;
		} else {
			ChainNode p = firstNode;
			for(int i = 0; i < index - 1;i++){
				p = p.next;
			}
			removedElement  = p.element;
			p.next = p.next.next;
			size--;
		}
		
		return removedElement;

	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("[");
		ChainNode p = firstNode;

		for (int i = 0; i < size; i++) {
			s.append(p.element);
			if (i < size - 1) {
				s.append(", ");
			}
			p = p.next; 
		}

		s.append("]");
		return s.toString();
	}

	
	public int indexOf(Object element) {
		ChainNode p = firstNode;
		for (int i = 0; i < size; i++) {
			if (p.element.equals(element)) {
				return i;
			}
			p = p.next;
		}
		return -1;
	}

}

class Demo{
	public static void main(String[] args){
		Chain chain = new Chain();
		
		chain.add(0,Integer.valueOf(2));
		chain.add(1,Integer.valueOf(4));
		chain.add(2,Integer.valueOf(6));
		chain.add(3,Integer.valueOf(8));
		
		System.out.println(chain.get(1));
		
		chain.toString();
		
		System.out.println("Index Of");
		System.out.println(chain.indexOf(Integer.valueOf(8)));
		
		System.out.println("After Remove");
		chain.remove(1);
		System.out.println(chain.get(1));
	}
}