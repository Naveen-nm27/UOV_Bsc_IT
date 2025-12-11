public class ArrayList{
	int size;
	Object[] arrList;
	
	public ArrayList(){
		this.arrList = new Object[10];
		size = 0;
	}
	
	public ArrayList(int size){
		this.arrList = new Object[size];
	}
	
	public void add(Object element,int index){
		if(index < 0 || index > size){
			throw new ArrayIndexOutOfBoundsException(index);
		} else {
			for(int i = size; i > index;i--){
				arrList[i] = arrList[i - 1];
				
			}
		}
		arrList[index] = element;
		size++;
	}
	
	public void remove(int index){
		arrList[index] = null;	
		Object value = arrList[index];
		for(int i = index;i <= size;i++){
			arrList[index] = arrList[i + 1];
		}
	}
	
	public int indexOf(Object element){
		for(int i = 0; i <= size; i++){
			if(arrList[i] == element){
				return i;
			}
		}
		return -1;
	}
	
	public void print(){
		for(int i = 0;i < size;i++){
			System.out.print(arrList[i].toString());
		}
	}
	
}

class App{
	public static void main(String[] args){
		ArrayList arrList = new ArrayList(10);
		arrList.add(Integer.valueOf(1),0);
		arrList.add(Integer.valueOf(1),0);
		arrList.add(Integer.valueOf(1),0);
		arrList.add(Integer.valueOf(1),0);

		
		arrList.print();
	}
}