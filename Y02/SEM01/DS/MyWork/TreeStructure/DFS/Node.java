package DFS;

public class Node{
    int element;
    Node left;
    Node right;
    
    Node(){
        left = right = null;
    }
    
    Node(int val){
        left = right = null;
        element = val;
    }
    
    Node(int val,Node left,Node right){
        element = val;
        this.left = left;
        this.right = right;
    }

	@Override
	public String toString(){
		return String.valueOf(element);
	}
}