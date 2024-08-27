package data_structures.disjoint_set_data_structure;

class DisjointSet{
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n){
        parent = new int[n];
        rank = new int[n];

        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int u){
        if(u != parent[u]){
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    public void union(int u, int v){
        int rootU = find(u);
        int rootV = find(v);

        if(rootU != rootV){
            if(rank[rootU] > rank[rootV]){
                parent[rootV] = rootU;
            }else if(rank[rootU] < rank[rootV]){
                parent[rootU] = rootV;
            }else{
                parent[rootV] = parent[rootU];
                rank[rootU]++;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DisjointSet disjointSet = new DisjointSet(5);
        System.out.println(disjointSet.find(1));
    }
}
