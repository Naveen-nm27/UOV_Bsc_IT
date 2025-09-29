interface LinearList {
    public boolean isEmpty();
    public Object get(int index);
    // public int indexOf(Object element);
    // public Object remove(int index);
    // public void add(int index, Object obj);
    // public String toString();
    public int size();
}

class CircularNode {
    Object element;
    CircularNode next;
    
    CircularNode(Object element, CircularNode next) {
        this.element = element;
        this.next = next;
    }
    
    public void displayNode() {
        System.out.println("{" + element + "}");
    }
}

class CircularLinkedList implements LinearList {
    private CircularNode lastNode;
    private int size;

    public CircularLinkedList() {
        lastNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error in Index");
            return null;
        }
        
        CircularNode p = lastNode.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.element;
    }
	
}


// public void add(int index,Object element){
    // if (index < 0 || index > size) {
        // System.out.println("Error in Index");
        // }
		
	// if(index == 0){
		// CircularNode newNode = new CircularNode(element,null);
		// newNode.next = newNode;
		// lastNode = 
	// } else if (index == size) {
		// CircularNode newNode = new CircularNode(theElement, );
	// }
// }

class Demo{
	public static void main(String[] args){
		
	}
}