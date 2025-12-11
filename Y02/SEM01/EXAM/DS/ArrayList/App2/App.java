class ArrayList{
	Object [] arrayList;
	int size;
	
	public ArrayList(){
		this.arrayList = new Object[10];
		this.size = 0;
	}
	
	public ArrayList(int size){
		this.arrayList = new Object[size];
		this.size = 0;
	}
	
	public void add(int index,Object element){
		if(index < 0 || index > size){
			throw new ArrayIndexOutOfBoundsException(index);
		} else {
			for(int i  = size; i > index;i--){
				arrayList[i] = arrayList[i + 1];
			}
		}
		size++;
	}
	
	public void remove(int index){
		for(int i = index;i < size;i++){
			arrayList[i] = arrayList[i - 1];
		}
		
		size--;
	}
	
	public int indexOf(Object element){
		for(int i = 0;i < size;i++){
			if(arrayList[i] == element){
				return i;
			}
		}
		return -1;
	}
	
	public void print(){
		for(int i = 0;i < size;i++){
			System.out.print(arrayList[i].toString());
		}
	}
	
}

class App{
	public static void main(String args[]){
		ArrayList arrayList = new ArrayList(10);
		
		arrayList.print();
		
		arrayList.add(0,Integer.valueOf(17));
		arrayList.add(0,Integer.valueOf(17));
		arrayList.add(0,Integer.valueOf(5));
		arrayList.add(0,Integer.valueOf(17));
		arrayList.add(0,Integer.valueOf(17));
		
		arrayList.remove(2);
		
		arrayList.print();

	}
}