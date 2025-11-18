import java.util.*;

class GraphMatrix{
	int[][] graph;
	int V;
	
	GraphMatrix(int V){
		this.V = V;
		graph = new int[V][V];
	}
	
	void addEdge(int u,int v){
		graph[u][v] = 1;
		graph[v][u] = 1;
	}
	
	void printMatrix(){
		for(int i = 0;i < V; i++){
			for(int j = 0;j < V;j++){
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//dfs recursive--
	
	// void dfs(int s) {
		// boolean[] visited = new boolean[V];
		// Stack<Integer> st = new Stack<>();

		// st.push(s);

		// while (!st.isEmpty()) {
			// int node = st.pop();

			// if (!visited[node]) {
				// visited[node] = true;
				// System.out.print(node + " ");
			// }

			//Add neighbors (reverse order optional)
			// for (int i = V - 1; i >= 0; i--) {
				// if (graph[node][i] == 1 && !visited[i]) {
					// st.push(i);
				// }
			// }
		// }
	// }
	
		//dfs iterative--
	
	void dfs(int s){
		boolean[] visited = new boolean[V];
		Stack<Integer> st = new Stack<>();
		
		st.push(s);
		
		while(!st.isEmpty()){
			int node = st.pop();
			
			if(!visited[node]){
				visited[node] = true;
				System.out.print(node + " ");
			}
			
			for(int i = V - 1;i >= 0; i--){
				if(graph[node][i] == 1 && !visited[i]){
					st.push(i);
				}
			}
		}
	}
	
		void bfs(int start) {
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<>();

		visited[start] = true;
		q.add(start);

		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");

			for (int i = 0; i < V; i++) {
				if (graph[node][i] == 1 && !visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}


	// void dfsRecursive(int node, boolean[] visited) {
		// visited[node] = true;
		// System.out.print(node + " ");

		// for (int i = 0; i < V; i++) {
			// if (graph[node][i] == 1 && !visited[i]) {
				// dfsRecursive(i, visited);
			// }
		// }
	// }

	// void dfsStart(int start) {
		// boolean[] visited = new boolean[V];
		// System.out.print("DFS Recursive: ");
		// dfsRecursive(start, visited);
		// System.out.println();
	// }

	
	   public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("Adjacency Matrix:");
        g.printMatrix();

        System.out.println("\nDFS Traversal:");
        g.dfs(0);
		
		System.out.println("\nBFS Traversal:");
        g.bfs(0);
    }
}