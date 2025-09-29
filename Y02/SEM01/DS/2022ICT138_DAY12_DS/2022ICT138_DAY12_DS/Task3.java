class Queue{
	Object[] queueArray;
	int front,rear,maxSize;
	
	public Queue(int size){
		maxSize = size;
		queueArray = new Object[maxSize];
		front = 0;
		rear = -1;
		currentSize = 0;
	}
	
	public boolean isFull(){
		return currentSize == maxSize;
	}
	
	public boolean isEmpty(){
		return currentSize == 0;
	}
	
	public void enQueue(Object element){
		if(isFull()){
			System.out.println("Queue is full");
		} else {
			rear = (rear + 1) % rear;
			queueArray[rear] = element;
			currentSize++;
		}
	}
	
	public Object deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		} else {
			front = front;
		}
	}
	
    public void printElement() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            StringBuilder stringBuilder = new StringBuilder("[ ");
            for (int i = 0; i < currentSize; i++) {
                int index = (front + i) % maxSize;
                stringBuilder.append(String.valueOf(queueArray[index]) + " ");
            }
            stringBuilder.append("]");
            System.out.println(stringBuilder.toString());
        }
    }
	
}

class Task3{
	public static void main(String[] args){
		Queue queue = new Queue(4);
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.deQueue();
		queue.enQueue(70);

		
		queue.printElement();

	}
}