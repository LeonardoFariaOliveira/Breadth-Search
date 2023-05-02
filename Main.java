public class Main{
    public static void main(String[] args) {

        Graph g = new Graph(22);

        //Init - 0
        g.addEdge(0, "Oradea", 1);

        //Oradea - 1
        g.addEdge(1, "Zerind", 2);
        g.addEdge(1, "Sibiu", 3);

        //Zerind - 2
        g.addEdge(2, "Arad", 4);
        g.addEdge(2, "Oradea", 1);

        //Sibiu - 3
        g.addEdge(3, "Rimnicu Vilcea", 6);
        g.addEdge(3, "Fagaras", 7);
        g.addEdge(3, "Arad", 4);
        g.addEdge(3, "Oradea", 1);

        //Arad - 4
        g.addEdge(4, "Timisoara", 5);
        g.addEdge(4, "Zerind", 2);
        g.addEdge(4, "Sibiu", 3);

        //Timisoara - 5
        g.addEdge(5, "Arad", 4);
        g.addEdge(5, "Lugoj", 8);

        //Rimnicu Vilcea - 6
        g.addEdge(6, "Craiova", 9);
        g.addEdge(6, "Sibiu", 3);
        g.addEdge(6, "Pitesti", 10);

        //Fagaras - 7
        g.addEdge(7, "Sibiu", 3);
        g.addEdge(7, "Bucharest", 11);

        //Lugoj - 8
        g.addEdge(8, "Timisoara", 5);
        g.addEdge(8, "Mehadia", 12);

        //Craiova - 9
        g.addEdge(9, "Pitesti", 10);
        g.addEdge(9, "Rimnicu Vilcea", 6);
        g.addEdge(9, "Dobreta", 15);

        //Pitesti - 10
        g.addEdge(10, "Rimnicu Vilcea", 6);
        g.addEdge(10, "Craiova", 9);
        g.addEdge(10, "Bucharest", 11);

        //Bucharest - 11
        g.addEdge(11, "Fagaras", 7);
        g.addEdge(11, "Pitesti", 10);
        g.addEdge(11, "Giurgiu", 13);
        g.addEdge(11, "Urziceni", 14);

        //Mehadia - 12
        g.addEdge(12, "Lugoj", 8);
        g.addEdge(12, "Dobreta", 15);

        //Giurgiu - 13
        g.addEdge(13, "Bucharest", 11);

        //Urziceni - 14
        g.addEdge(14, "Bucharest", 11);
        g.addEdge(14, "Hirsova", 16);
        g.addEdge(14, "Vaslui", 17);

        //Dobreta - 15
        g.addEdge(15, "Mehadia", 12);
        g.addEdge(15, "Craiova", 9);

        //Hirsova - 16
        g.addEdge(16, "Urziceni", 14);
        g.addEdge(16, "Eforie", 18);

        //Vaslui - 17
        g.addEdge(17, "Urziceni", 14);
        g.addEdge(17, "Iasi", 19);

        //Eforie - 18
        g.addEdge(18, "Hirsova", 16);

        //Iasi - 19
        g.addEdge(19, "Vaslui", 17);
        g.addEdge(19, "Neamt", 20);

        //Neamt - 20
        g.addEdge(20, "Iasi", 19);

        g.BFS("Arad", "Bucharest");
             
    }

}