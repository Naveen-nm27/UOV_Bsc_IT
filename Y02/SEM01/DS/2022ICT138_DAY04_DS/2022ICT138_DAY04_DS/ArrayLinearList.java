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
	
    public ArrayLinearList(int initialCapacity) throws IllegalArgumentException {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Initial capacity should be greater than or equal to 1");
        } else {
            arrayList = new Object[initialCapacity];
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
	


	public void checkIndex(int index) throws IndexOutOfBoundsException{
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index = " + index + "size = " +size);
	}
	
	public Object get(int index){
		checkIndex(index);
		return arrayList[index];
	}
	
	@Override
	public int indexOf(Object element){
		for(int i = 0; i < size;i++){
			if(arrayList[i].equals(element)){
				return i;
			}
	}
	return -1;
}
	
	@Override
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
			}
			
			s.append(" ]");
		
		}
		
		return new String(s);
	}
	

public String toString(){
	StringBuilder s = new StringBuilder("[ ");
	
	for(int i = 0; i < size;i++){
		if(arrayList[i] == null){
			s.append("null");
		} else {
			s.append(arrayList[i].toString());
		}
		if(i  < size - 1){
			s.append(",")
		}
	}
	s.append(" ]");
	
}



























   @Override
   public Object remove(int index) {
        checkIndex(index);
        
        Object removedElement = arrayList[index];
        
        for (int i = index; i < size - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        
        arrayList[size - 1] = null;
        size--; 
        
        return removedElement;
    }
	
    public void add(int index, Object obj) {
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("Index = "+index+" size = "+size);
		} else {
				for(int k = size;k >= index;k--){
					arrayList[k] = arrayList[k - 1];
				}
			}
				arrayList[index]=obj;
				size++;
		}
		
	public void clear(){
		for(int i = 0;i<=size;i++){
			
		}
	}
	
 }

class Demo{
	public static void main(String[] args){
		ArrayLinearList aLL = new ArrayLinearList(20);
		aLL.add(0,Integer.valueOf(4));
		aLL.add(0,Integer.valueOf(5));
		aLL.add(0,Integer.valueOf(6));
		aLL.add(0,Integer.valueOf(7));
		aLL.add(0,Integer.valueOf(8));
		System.out.println(aLL.toString());
		
		
	}
}