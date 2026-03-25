import java.util.*;
public class SCC_kosaraju{
    // Step 1: DFS to store finish order
    static void dfs1(int node, boolean[] visited,Stack<Integer> stack,ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor])
                dfs1(neighbor, visited, stack, adj);
        }
        stack.push(node); // finish time
    }
    // Step 3: DFS on reversed graph
    static void dfs2(int node, boolean[] visited,ArrayList<ArrayList<Integer>> revAdj) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : revAdj.get(node)) {
            if (!visited[neighbor])
                dfs2(neighbor, visited, revAdj);
        }
    }
    static void kosaraju(int V,ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        // STEP 1
        for (int i = 0; i < V; i++)
            if (!visited[i])
                dfs1(i, visited, stack, adj);
        // STEP 2: Reverse graph
        ArrayList<ArrayList<Integer>> revAdj =new ArrayList<>();
        for (int i = 0; i < V; i++)
            revAdj.add(new ArrayList<>());
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                revAdj.get(neighbor).add(i);
            }
        }
        Arrays.fill(visited, false);
        // STEP 3
        System.out.println("\nStrongly Connected Components:");
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                dfs2(node, visited, revAdj);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);   // directed edge
        }
        kosaraju(V, adj);
        sc.close();
    }
}
