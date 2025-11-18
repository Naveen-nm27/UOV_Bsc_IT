import java.util.*;

public class GraphMatrix {
    int V;                // Number of vertices
    int[][] graph;        // Adjacency matrix

    // Constructor
    GraphMatrix(int vertices) {
        V = vertices;
        graph = new int[V][V];
    }

    // (i) Add edge between u and v
    void addEdge(int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1; // for undirected graph
    }

    // (ii) Display adjacency matrix
    void printMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    // (iii) Depth First Search (Iterative)
    void dfs(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        st.push(start);

        System.out.print("DFS Traversal: ");
        while (!st.isEmpty()) {
            int node = st.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
            }

            // Push neighbors (in reverse order to maintain correct sequence)
            for (int i = V - 1; i >= 0; i--) {
                if (graph[node][i] == 1 && !visited[i]) {
                    st.push(i);
                }
            }
        }
        System.out.println();
    }

    // (iv) Breadth First Search (BFS)
    void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS Traversal: ");
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
        System.out.println();
    }

    // Main method to take user input and test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        GraphMatrix g = new GraphMatrix(vertices);

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }

        g.printMatrix();

        System.out.print("\nEnter starting vertex for DFS and BFS: ");
        int start = sc.nextInt();

        g.dfs(start);
        g.bfs(start);
    }
}
