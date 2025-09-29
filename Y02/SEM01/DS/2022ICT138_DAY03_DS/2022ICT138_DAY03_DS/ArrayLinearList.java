interface Linearlist{
	public boolean isEmpty();
	public Object get(int index);
	public int indexOf(Object element);
	public Object remove(int index);
	public void add(int index,Object obj);
	public String toString();
}

public class ArrayLinearList implements Linearlist{
	protected Object [] arrayList; // array of elements
	protected int size; //number of elements in array
	
	public ArrayLinearList(int ini) throws IllegalArgumentException{
		if(ini < 1){
			throw new IllegalArgumentException("Initial Capasty should be grater than or equal to 1");
		} else{
			arrayList = new Object[ini];
		}

	}
	
	public ArrayLinearList(){
			arrayList =  new Object[10];
	}
	
	public boolean isEmpty(){
		if (size == 0){
			return true;
		} else{
			return false;
		}
	}
	
	public int size(){
		return size;
	}
	
	//
	public void checkIndex(int index) throws IndexOutOfBoundsException{
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index = " + index + "size = " +size);
	}
	
	public Object get(int index){
		checkIndex(index);
		return arrayList[index];
	}
	
	public int indexOf(Object element){
		int temp = 0;
		for(int i = 0; i < arrayList.length;i++){
			if(arrayList[i] == element){
				checkIndex(i);
				temp = i;
				break;
			} else{
				return -1;
			}
		}
		return temp;
	}
	
	// public int indexOf(Object element){
		// if(indexOf(element) != -1){
			// Object objTemp = element;
		// }
		
		// for(int i = indexOf(element);i < arrayList.length;i++){
			// arrayList[i] = arrayList[i + 1]; 
		// }
		
		// size = size - 1;
		
	// }

	public String toString(){
		StringBuffer s =  new  StringBuffer("[");
		
		for(int i = 0; i<size; i++){
			if(arrayList[i] == null){
				s.append("null, ");
			}	
			else {
				s.append(arrayList[i].toString() +", ");
			}
			if(size > 0){
					s.delete(s.length()-2, s.length());
					s.append("]");
			}
			

		}
		
		return new String(s);
	}
	
	public Object remove(int index){
		arrayList[index] = null;
		for(int i = index; i < arrayList.length;i++){
			arrayList[i] = arrayList[i + 1];
		}
		return arrayList;
	}
	
	public void add(int index,Object obj){
		
	}
	
}
