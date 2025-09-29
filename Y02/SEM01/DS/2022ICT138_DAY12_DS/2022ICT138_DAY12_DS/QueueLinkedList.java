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
        System.out.println("{" + element + "}");
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        ChainNode p = firstNode;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.element;
    }

    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error in index");
        }
        if (index == 0) {
            firstNode = new ChainNode(theElement, firstNode);
        } else {
            ChainNode p = firstNode;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            ChainNode newNode = new ChainNode(theElement, p.next);
            p.next = newNode;
        }
        size++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Error in index");
        }
        Object removedElement;
        if (index == 0) {
            removedElement = firstNode.element;
            firstNode = firstNode.next;
        } else {
            ChainNode p = firstNode;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            removedElement = p.next.element;
            p.next = p.next.next;
        }
        size--;
        return removedElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ChainNode p = firstNode;
        while (p != null) {
            sb.append(p.element);
            if (p.next != null) {
                sb.append(", ");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class LinkedListQueue{
	
	private Chain chain;
	
	public LinkedListQueue(){
		chain = new Chain();
	}
	
	public boolean isEmpty(){
		return chain.isEmpty();
	}
	
	public void enQueue(Object obj){
		chain.add(chain.size(),obj);
	}
	
	public Object deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		return chain.remove(0);
	}
	    @Override
    public String toString() {
        return "Queue " + chain.toString();
    }
}

class Stack {
    private Chain chain;

    public Stack() {
        chain = new Chain();
    }

    public boolean isEmpty() {
        return chain.isEmpty();
    }

    public void push(Object obj) {
        chain.add(0, obj);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return chain.remove(0);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return chain.get(0);
    }

    @Override
    public String toString() {
        return "Stack " + chain.toString();
    }
}

class Demo {
    public static void main(String args[]) {

        LinkedListQueue queue = new LinkedListQueue();

     
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

  
        System.out.println(queue);


        System.out.println("Dequeued: " + queue.deQueue());


        System.out.println(queue);


        Stack stack = new Stack();


        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack);

       
        System.out.println("Popped: " + stack.pop());

        
        System.out.println("Peek: " + stack.peek());

       
        System.out.println(stack);
    }
}
