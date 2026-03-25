import java.util.*;
public class BridgesInGraph {
    static int timer = 0;
    static void dfs(int node, int parent,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int[] disc,int[] low) {
        visited[node] = true;
        disc[node] = low[node] = timer++;
        for (int neighbor : adj.get(node)) {
            if (neighbor == parent)
                continue;
            if (!visited[neighbor]) {
                dfs(neighbor, node, adj, visited, disc, low);
                low[node] = Math.min(low[node], low[neighbor]);
                // Bridge condition
                if (low[neighbor] > disc[node]) {
                    System.out.println("Bridge: " +node + " - " +neighbor);
                }
            } else {
                low[node] = Math.min(low[node], disc[neighbor]);
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
        System.out.println("Enter undirected edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);   // undirected
        }
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        for (int i = 0; i < V; i++)
            if (!visited[i])
                dfs(i, -1, adj, visited, disc, low);
        sc.close();
    }
}