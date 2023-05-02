
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V; // No. of vertices
    public LinkedList<No>[] adj; // Adjacency Lists

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<No>();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, String w, int ni) {
        adj[v].add(new No(ni, w));
    }

    // Function to find an edge from the graph
    int findEdge(String s) {
        // System.out.println(s);
        for(int i = 0; i <= adj.length; i++){
            if(adj[i].element().cityName.equals(s)){
                return adj[i].element().pos;
            }
        }
        return 0;
    }

        // Function to add an edge into the graph
        No findNode(String s) {
            for(int i = 0; i <= adj.length; i++){
                if(adj[i].element().cityName.equals(s)){
                    return adj[i].element();
                }
            }
            return null;
        }

    // prints BFS traversal from a given source s
    void BFS(String s, String e) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean[] visited = new boolean[V];
        No[] parent = new No[V];
        No aux_parent;
        boolean find = false;
        Stack<No> pilha = new Stack<No>();
        Stack<No> path = new Stack<No>();


        // Create a queue for BFS
        Queue<No> queue = new LinkedList<No>();

        int p = findEdge(s);
        System.out.println(p);
        No no = findNode(s);
        // System.out.println("Posição inicio"+p+"");
        // Mark the current node as visited and enqueue it
        visited[p] = true;
        queue.add(no);
        parent[p] = no;
        
        System.out.print("Buscas: [");
        while (!queue.isEmpty() && !find) {
            // Dequeue a vertex from queue and print it    
            no = queue.poll();
            pilha.add(no);
            System.out.print(no.cityName + "-");
            p = findEdge(no.cityName);
            aux_parent = no;
            No h;

            if (no.cityName == e) {

                path.add(pilha.lastElement());
                while(!pilha.isEmpty()){
                    h = parent[path.lastElement().pos];
                    if(pilha.lastElement().cityName == h.cityName){
                        path.add(h);
                    }
                    pilha.pop();
                    
                }

                find = true;

            } else {
                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<No> i = adj[p].listIterator();
                while (i.hasNext()) {
                    No n = i.next();
                    
                    if (visited[n.pos] == false) {

                        parent[n.pos] = aux_parent;
                        visited[n.pos] = true;
                        queue.add(n);

                    }
                }
            }
        }
        System.out.println("]");
        System.out.println(" ");
        System.out.print("Caminho: [");
        while(!path.isEmpty()){
            System.out.print(path.pop().cityName+ "-");
        }
        System.out.print("]");
    }
}
