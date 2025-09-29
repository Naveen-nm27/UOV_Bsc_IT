interface LinearList {
    public boolean isEmpty();
    public Object get(int index);
    // public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index, Object obj);
    // public String toString();
    public int size();
}

class DoublyNode {
	Object element;
	DoublyNode next;
	DoublyNode previous;
	
	DoublyNode (Object element, DoublyNode next,DoublyNode previous){
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
	
	public void displayNode(){
		System.out.println("{"+ element +"}");
	}
}

class DoublyLinkedList implements LinearList {
	private DoublyNode firstNode;
	private DoublyNode lastNode;
	private int size;
	
	public DoublyLinkedList(){
		firstNode = null;
		lastNode = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public Object get(int index){
		DoublyNode p;
		if(index < 0 || index > size){
			System.out.println("Error in Index");
		}
		
		if (index < size / 2){
			p = firstNode;
			for(int i = 0; i < index; i++){
				p = p.next;
			} 
		} else {
			p = lastNode;
				for(int i = size - 1; i > index; i--){
					p = p.previous;
				}
			}
		
	
	return p.element;
	
	}
	
	public void add(int index,Object element){
		if(index < 0 || index > size){
			System.out.println("Error in index");
		} 
		if (index  == 0){
			DoublyNode newNode = new DoublyNode (element,firstNode,null);
			if(firstNode != null) {
				firstNode.previous = newNode;
			} else {
				lastNode = newNode;
			}
			firstNode = newNode;
		} else if (index == size) {
			DoublyNode newNode = new DoublyNode(element,null,lastNode);
			if(lastNode != null){
				lastNode.next = newNode;
			} else {
				firstNode = newNode;
			}
			lastNode = newNode;
		} else {
			DoublyNode p = firstNode;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
			DoublyNode newNode = new DoublyNode(element, p, p.previous);
            p.previous.next = newNode;
            p.previous = newNode;
		}
		size++;

	}
	
	public Object remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error in index");
            return null;
        }
        
        Object removedElement;
        
        if (index == 0) {
            removedElement = firstNode.element;
            firstNode = firstNode.next;
            if (firstNode != null) {
                firstNode.previous = null;
            } else {
                lastNode = null;
            }
        } else if (index == size - 1) {
            removedElement = lastNode.element;
            lastNode = lastNode.previous;
            if (lastNode != null) {
                lastNode.next = null;
            } else {
                firstNode = null;
            }
        } else {
            DoublyNode p = firstNode;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            removedElement = p.element;
            p.previous.next = p.next;
            p.next.previous = p.previous;
        }
        
        size--;
        return removedElement;
    }

}

class Demo{
	public static void main(String[] args){
		DoublyLinkedList doublyList = new DoublyLinkedList();
        
        doublyList.add(0, Integer.valueOf(100));
        doublyList.add(1, Integer.valueOf(200));
        doublyList.add(2, Integer.valueOf(300));
        doublyList.add(3, Integer.valueOf(400));
		
		System.out.println("Before Removing index 1: " + doublyList.get(1));
		
		doublyList.remove(1);
		
		System.out.println("After Removing index 1: " + doublyList.get(1));
	}
}