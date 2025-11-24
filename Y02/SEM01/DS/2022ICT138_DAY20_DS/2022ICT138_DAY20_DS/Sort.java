class Sort {
    int[] data;
    int size; 


    public Sort(int capacity) {
        data = new int[capacity];
        size = 0;
    }


    public void add(int value) {
        if (size < data.length) {
            data[size] = value;
            size++;
        } else {
            System.out.println("Array is full! Cannot add more elements.");
        }
    }


    public void BubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
	
	// public void SelectionSort(){
		// for(int i = 0;i < size - 1;i++){
			// for(int j = i; j < size - 1;j++){
				// if(data[j+1] < data[i]){
					// int temp = data[i];
					// data[i] = data[j+1];
					// data[j+1] = temp;
				// }
			// }
		// }
	// }
	
	public void SelectionSort() {
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i; 
        for (int j = i + 1; j < size; j++) {
            if (data[j] < data[minIndex]) { 
                minIndex = j;
            }
        }
   
        int temp = data[i];
        data[i] = data[minIndex];
        data[minIndex] = temp;
    }
}


    public void printData() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sort sort = new Sort(10);

        sort.add(50);
        sort.add(10);
        sort.add(30);
        sort.add(20);
		
		sort.printData();
		
		//bs.BubbleSort();
		sort.SelectionSort();
		
		sort.printData();
		
	}
}