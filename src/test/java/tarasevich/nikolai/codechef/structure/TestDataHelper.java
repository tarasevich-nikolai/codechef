package tarasevich.nikolai.codechef.structure;

import tarasevich.nikolai.codechef.structure.bfs_dfs.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nikolai.tarasevich
 */
public class TestDataHelper {

    public static Node exampleTree() {
        Node node4 = Node.builder().id(4).adjacent(new LinkedList<>()).build();
        Node node5 = Node.builder().id(5).adjacent(new LinkedList<>()).build();
        Node node6 = Node.builder().id(6).adjacent(new LinkedList<>()).build();

        Node node2 = Node.builder().id(2).adjacent(getAdjacent(node4, node5)).build();
        Node node3 = Node.builder().id(3).adjacent(getAdjacent(node6)).build();


        Node node1 = new Node(1, getAdjacent(node2, node3));

        return node1;
    }

    public static LinkedList<Node> getAdjacent(Node... nodes) {
        return new LinkedList<>(Arrays.asList(nodes));
    }

    public static Node getNode(int id, Node source) {
        return Node.builder().id(id).build();
    }
}
