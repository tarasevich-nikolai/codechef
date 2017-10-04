package tarasevich.nikolai.codechef.structure.bfs_dfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author nikolai.tarasevich
 */
public class Bfs {

    public static boolean hasPath(Node source, Node destination) {
        System.out.println("Start searching");
        LinkedList<Node> nextToVisit = new LinkedList<>();
        nextToVisit.add(source);
        Set<Node> visited = new HashSet<>();

        while(!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            System.out.print(node.getId() + " ");
            if (nextToVisit.contains(node)) {
                continue;
            }

            if (node.getId() == destination.getId()) {
                return true;
            }

            visited.add(node);
            nextToVisit.addAll(node.getAdjacent());
        }
        return false;
    }
}
