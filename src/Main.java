// Repository link : https://github.com/Amaya-bsu26/Graph.git
public class Main {


    public static void main(String[] args) {

        //create a class called Graph

        Graph g = new Graph(5);

        g.add_edges(0,1);
        g.add_edges(0,3);
        g.add_edges(1,4);
        g.add_edges(0,2);
        g.add_edges(2,3);

        // display the adjacency matrix
        g.display_matrix();

        // check whether two vertices are connected
        g.connectiveness(0,1);
        g.connectiveness(1,3);

        // displays the adjacent nodes of a vertex
        g.adjacent_nodes(0);
        g.adjacent_nodes(1);

    }
}