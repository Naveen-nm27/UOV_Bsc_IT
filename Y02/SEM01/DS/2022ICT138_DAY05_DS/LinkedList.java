import java.util*;

class MylinkedList<E>{
	E data;
	Node next;
	
	class Node<E>{
		Node(){
			
		}
		
		Node(E dataItem){
			data  = dataItem;
			next = null;
		}
		
		Node(E dataItem,Node<E> ref){
			data = dataItem;
			next = ref;
		}
	}
}