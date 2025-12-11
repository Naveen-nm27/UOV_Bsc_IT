public class KWArrayListObject{
	private final int INITIAL_CPACITY = 10;
	private int size = 0;
	private int capacity = 0;
	private Object[] data;
	
	KWArrayListObject(){
		capacity = INITIAL_CPACITY;
		data = new Object[capacity];	
	}
	
	public boolean add(Object value){
		if(size == capacity){
			expanArray();
		}
		
		data[size++] = value;
		
		return true;
	}
	
	public Object remove(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index: " + index + "size: " + size);
		}
		
		Object temp = data[index];
		
		
		for(int i = index; i < size - 1;i++){
			data[i] = data[i + 1];
		}
		
		data[size] = null;
		
		return temp;
	}
	
	public void expanArray(){
		capacity = capacity * 2;
		
		Object[] newData = new Object[capacity];
		
		for(int i = 0;i < size;i++){
			newData[i] = data[i];
		}
		
		data = newData;
	}
	
	public Object get(Object value){	
		for(int i = 0;i < size;i++){
			if(data[i].equals(value)){
				return data[i];
			}
		}
		return null;
	}
	
	public void set(int index,Object value){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index: " + index + "size: " + size);
		}
		
		for(int i = size;i <= index;i--){
			data[i + 1] = data[i];
		}
		data[index] =  value;
		
		size++;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size;i++){
			if(i > 0) sb.append(", ");
			sb.append(String.valueOf(data[i]));
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args){
		KWArrayListObject list = new KWArrayListObject();
		
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.remove(0);
		
		System.out.println(list.toString());
	}
	
}