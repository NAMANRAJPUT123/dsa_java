import java.util.*;
public class ArticulationPoint {
    static int timer = 0;
    static void dfs(int u, int parent,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int[] disc,int[] low,boolean[] isAP) {
        visited[u] = true;
        disc[u] = low[u] = timer++;
        int children = 0;
        for (int v : adj.get(u)) {
            if (v == parent)
                continue;
            if (!visited[v]) {
                children++;
                dfs(v, u, adj,visited, disc, low, isAP);
                low[u] = Math.min(low[u], low[v]);
                // Non-root case
                if (parent != -1 &&low[v] >= disc[u]) isAP[u] = true;
            }
            else {
                low[u] =Math.min(low[u], disc[v]);
            }
        }
        // Root case
        if (parent == -1 && children > 1)
            isAP[u] = true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        boolean[] isAP = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        for (int i = 0; i < V; i++)
            if (!visited[i])
                dfs(i, -1, adj,visited, disc, low, isAP);

        System.out.println("Articulation Points:");
        for (int i = 0; i < V; i++)
            if (isAP[i])
                System.out.print(i + " ");

        sc.close();
    }
}