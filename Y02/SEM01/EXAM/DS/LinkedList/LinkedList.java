class Node{
	Node next;
	Object element;
	
	Node(Object element,Node next){
		this.element = element;
		this.next = next;
	}
	
}

class LinkedList{
	private Node head;
	private int size;
	
	LinkedList(){
		head = new Node(null,null);
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public void addFirst(Object value){
			Node newNode = new Node(value,head.next);
			head.next = newNode;
			size++;
	}
	
	public void addLast(Object value){
			Node newNode = new Node(value,head.next);
			head.next = newNode;
			size++;
	}
	
	
	public void add(int index,Object value){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
		}
		
		//add Anywhere
			Node p = head;
			for(int i = 0;i < index;i++){
				p = p.next;
			}
			
			Node newNode = new Node(value,p.next);
			p.next = newNode;
			size++;
		}
	
	public void remove(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
		}
		
		Node p = head;
		for(int i = 0;i < index;i++){
			p = p.next;
		}
		
		Node target = p.next;
		Object rem = target.element;
		
		p.next = target.next;
		size--;
	}
	
	public Object get(int index){
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("Index: " + index + "size: " + size);
		}
		
		Node p = head.next;
		
		for(int i = 0;i < index;i++){
			p = p.next;
		}
		
		return p.element;
	}
	
    public int indexOf(Object element) {
        Node p = head.next;
        int i = 0;
        while (p != null) {
            if ((p.element == null && element == null) ||
                (p.element != null && p.element.equals(element))) {
                return i;
            }
            p = p.next;
            i++;
        }
        return -1;
    }
	
    public void printList() {
        Node p = head.next; // skip dummy head
        System.out.print("[ ");
        while (p != null) {
            System.out.print(p.element);
            if (p.next != null) System.out.print(" > ");
            p = p.next;
        }
        System.out.println(" ]");
    }
    // 🧪 Demo
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.printList(); // [ A → B → C ]

        list.addFirst("Start");
        list.printList(); // [ Start → A → B → C ]

        list.add(2,"Middle");
        list.printList(); // [ Start → A → Middle → B → C ]

        list.remove(3);
        list.printList(); // [ Start → A → Middle → C ]

        System.out.println("Index of 'Middle': " + list.indexOf("Middle"));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size: " + list.size());
    }
}

