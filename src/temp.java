import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {
        ArrayList<int[]> edges = new ArrayList<int[]>();
        edges.add(new int[]{1, 2, 10});
        edges.add(new int[]{1, 3, 5});
        edges.add(new int[]{2, 3, 3});

        Graph graph = new SingleGraph("Graph");

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            graph.addEdge(from + "-" + to, from, to).setAttribute("weight", weight);
        }

        graph.display();
    }
}
