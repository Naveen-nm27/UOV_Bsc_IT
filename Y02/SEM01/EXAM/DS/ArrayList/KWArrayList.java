public class KWArrayList<E>{
	private final int INITIAL_CAPACITY = 10;
	private E[] data;
	private int size = 0;
	private int capacity = 0;
	
	
	@SuppressWarnings("unchecked")

	public KWArrayList(){
		capacity = INITIAL_CAPACITY;
		data =(E[]) new Object[capacity];
	}
	
	public boolean add(E element){
		if(capacity == size){
			realocate();
		}
		
		data[size] = element;
		size++;
		return true;
	}
	
	public E remove(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException(index);
		}
		
		E temp = data[index];
		
		for(int i = index; i < size - 1;i++){
			data[i] = data[i + 1];
		}
		
		size--;
		data[size] = null;
		return temp;
	}		
	
	@SuppressWarnings("unchecked")
	
	public void realocate(){


		//capacity = capacity * 2;
		capacity *= 2;
		
		E[] newData = (E[]) new Object[capacity];
		
		for(int i = 0; i < size;i++){
			newData[i] = data[i];
		}
		
		data = newData;
	}
	
	public E get(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException(index);
		}
		
		return data[index];
	}
	
	public E set(int index,E value){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException(index);
		}
		
		E temp = data[index];
		
		data[index] = value;
		
		return temp;
	}
	
	public static void main(String[] args){
		KWArrayList<Integer> arrList = new KWArrayList<>();
		arrList.add(50);
	}
}