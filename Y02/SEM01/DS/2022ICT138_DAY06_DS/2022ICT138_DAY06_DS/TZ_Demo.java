interface LinearList {
	public boolean isEmpty();
	public Object get(int index);
	public Object remove(int index);
	public void add(int index, Object obj);
}

class ChainNode {
	Object element;
	ChainNode next;
	
	ChainNode(Object element, ChainNode next) {
		this.element = element;
		this.next = next;
	}
	
	public void displayNode() {
		
		System.out.print("{"+element+"}");
	}
}

class Chain implements LinearList {
	
	private ChainNode firstNode;
	private int size;
	
	public Chain() {
		firstNode = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		ChainNode p = firstNode;
		for(int i=0; i<index; i++) {
			p = p.next;
		}
		return p.element;
	}
	
	public void add(int index, Object element) {
		if(index < 0 || index > size) {
			System.out.println("Index Error");
		} else if (index == 0) {
			firstNode = new ChainNode(element, firstNode);
			size++;
		} else {
			ChainNode p = firstNode;
			for(int i=0; i<index -1; i++) {
				p = p.next;
			}
			ChainNode newNode = new ChainNode(element, p.next);
			p.next = newNode;
			size++;
		}
	}
	
	public Object remove(int index) {
		Object removedElement = null;
		if(index < 0 || index > size - 1) {
			System.out.println("Index Error");
		} else if(index == 0) {
			removedElement = firstNode;
			firstNode = firstNode.next;
			size--;
		} else {
			ChainNode p = firstNode;
			for(int i=0; i<index -1; i++) {
				p = p.next;
			}
			removedElement = p.next;
			p.next = p.next.next;
			size--;
		}
		return removedElement;
	}
	
}

class Demo {
	
	public static void main(String[] args) {
		Chain chain = new Chain();
		
		chain.add(0, Integer.valueOf(3));
		chain.add(1, Integer.valueOf(5));
		chain.add(2, Integer.valueOf(7));
		chain.add(3, Integer.valueOf(8));
		// chain.add(0, Integer.valueOf(10));
		chain.remove(0);
		
		System.out.println(chain.get(0));
		System.out.println(chain.get(1));
		System.out.println(chain.get(2));
		
		
		
	}
	
}
