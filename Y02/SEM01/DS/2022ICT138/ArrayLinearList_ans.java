interface LinearList {
    public boolean isEmpty();
    public Object get(int index);
    public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index, Object obj);
    public String toString();
    public int size(); // Added missing method from interface
}

public class ArrayLinearList_ans implements LinearList {
    protected Object[] arrayList; // array of elements
    protected int size; // number of elements in array
    
    // Constructor with initial capacity
    public ArrayLinearList_ans(int initialCapacity) throws IllegalArgumentException {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Initial capacity should be greater than or equal to 1");
        } else {
            arrayList = new Object[initialCapacity];
            size = 0; // Initialize size
        }
    }
    
    // Default constructor
    public ArrayLinearList_ans() {
        arrayList = new Object[10];
        size = 0; // Initialize size
    }
    
    public boolean isEmpty() {
        return size == 0; // Simplified
    }
    
    public int size() {
        return size;
    }
    
    // Check if index is valid for existing elements
    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index = " + index + ", size = " + size);
    }
    
    // Check if index is valid for insertion (allows index == size)
    private void checkIndexForAdd(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index = " + index + ", size = " + size);
    }
    
    public Object get(int index) {
        checkIndex(index);
        return arrayList[index];
    }
    
    // CORRECTED: Fixed major logic error
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) { // Only search up to size, not array length
            if (element == null ? arrayList[i] == null : element.equals(arrayList[i])) {
                return i; // Return immediately when found
            }
        }
        return -1; // Return -1 if not found
    }
    
    // CORRECTED: Complete rewrite - original was completely wrong
    public Object remove(int index) {
        checkIndex(index);
        
        Object removedElement = arrayList[index]; // Store element to return
        
        // Shift elements left to fill the gap
        for (int i = index; i < size - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        
        arrayList[size - 1] = null; // Clear the last position
        size--; // Decrease size
        
        return removedElement; // Return the removed element
    }
    
    // CORRECTED: Implemented the missing method
    public void add(int index, Object obj) {
        checkIndexForAdd(index);
        
        // Check if we need to resize the array
        if (size == arrayList.length) {
            resize();
        }
        
        // Shift elements right to make space
        for (int i = size; i > index; i--) {
            arrayList[i] = arrayList[i - 1];
        }
        
        arrayList[index] = obj; // Insert the new element
        size++; // Increase size
    }
    
    // Helper method to resize array when full
    private void resize() {
        Object[] newArray = new Object[arrayList.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = arrayList[i];
        }
        arrayList = newArray;
    }
    
    // CORRECTED: Fixed string formatting issues
    public String toString() {
        if (size == 0) {
            return "[]"; // Handle empty list
        }
        
        StringBuilder s = new StringBuilder("[");
        
        for (int i = 0; i < size; i++) { // Only iterate up to size
            if (arrayList[i] == null) {
                s.append("null");
            } else {
                s.append(arrayList[i].toString());
            }
            
            if (i < size - 1) { // Add comma except for last element
                s.append(", ");
            }
        }
        
        s.append("]");
        return s.toString();
    }
}