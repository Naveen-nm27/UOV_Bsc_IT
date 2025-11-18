// import java.util.*;

// class GraphMatrix {
    // int[][] graph;
    // int V;

    // GraphMatrix(int V) {
        // this.V = V;
        // graph = new int[V][V];
    // }

    // void addEdge(int u, int v) {
        // graph[u][v] = 1;
        // graph[v][u] = 1;
    // }

    Interactive DFS
    // void dfsInteractive(int start) throws Exception {
        // boolean[] visited = new boolean[V];
        // Stack<Integer> st = new Stack<>();
        // Scanner sc = new Scanner(System.in);

        // st.push(start);

        // System.out.println("Interactive DFS Starting at node: " + start);
        // System.out.println("Press ENTER for next step or type 'exit' to stop.");
        // System.out.println("---------------------------------------------------");

        // while (!st.isEmpty()) {

            // System.out.print("[Input] Press ENTER to continue: ");
            // String input = sc.nextLine();
            // if (input.equalsIgnoreCase("exit")) {
                // System.out.println("Exiting DFS...");
                // return;
            // }

            // System.out.println("Stack: " + st);
            // Thread.sleep(300);

            // int node = st.pop();
            // System.out.println("Popped: " + node);
            // Thread.sleep(300);

            // if (!visited[node]) {
                // visited[node] = true;
                // System.out.println("Visited: " + node);
            // } else {
                // System.out.println("Already Visited: " + node);
            // }

            // Thread.sleep(300);
            // System.out.println("Checking neighbors of " + node);

            // for (int i = V - 1; i >= 0; i--) {
                // if (graph[node][i] == 1 && !visited[i]) {
                    // st.push(i);
                    // System.out.println("  → Pushed neighbor " + i);
                    // Thread.sleep(300);
                // }
            // }

            // System.out.println("---------------------------------------------------");
        // }

        // System.out.println("DFS Complete!");
    // }

    Main Test
    // public static void main(String[] args) throws Exception {
        // GraphMatrix g = new GraphMatrix(5);

        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(1, 3);
        // g.addEdge(2, 4);

        // g.dfsInteractive(0);
    // }
// }


import java.util.*


class GraphMatrix{
	int[][] graph;
	int V;
	
	GraphMatrix(int V){
		this.V = V;
		graph = new int[V][V]
	}
	
	void addEdge(int u,int v){
		graph[u][v] = 1;
		graph[v][u] = 1;
	}
	
	void printMatrix(){
		for(int i = 0;i < C;i++){
			for(int j = 0;j < 0;j++){
				System.out.println(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void dfs(int s){
		boolean[] visited = new boolean[V];
		start<Integer> st = new Stack<>();
		
		st.push(s);
		while(!st.isEmpty()){
			int node = st.pop();
			
			if(!visited[node]){
				visited[node] = true;
				System.out.println(node + " ");
			}
			
			for(int i = V - 1;i >=0;i--){
				if(graph[node][i] == 1 && !visited[i]){
					st.push(i);
				}
			}
		}
	}
}