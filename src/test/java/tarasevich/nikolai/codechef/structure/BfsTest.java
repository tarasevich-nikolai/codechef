package tarasevich.nikolai.codechef.structure;

import org.junit.Test;
import tarasevich.nikolai.codechef.structure.bfs_dfs.Bfs;
import tarasevich.nikolai.codechef.structure.bfs_dfs.Dfs;
import tarasevich.nikolai.codechef.structure.bfs_dfs.Node;

import java.util.LinkedList;

/**
 * @author nikolai.tarasevich
 */
public class BfsTest {

    @Test
    public void test() {
        Node node4 = Node.builder().id(4).adjacent(new LinkedList<>()).build();
        Node node5 = Node.builder().id(5).adjacent(new LinkedList<>()).build();
        Node node6 = Node.builder().id(6).adjacent(new LinkedList<>()).build();

        Node node2 = Node.builder().id(2).adjacent(TestDataHelper.getAdjacent(node4, node5)).build();
        Node node3 = Node.builder().id(3).adjacent(TestDataHelper.getAdjacent(node6)).build();


        Node node1 = new Node(1, TestDataHelper.getAdjacent(node2, node3));

        boolean result = Bfs.hasPath(node1, node6);
        System.out.println(result);
    }
}
