package tarasevich.nikolai.codechef.structure.bfs_dfs;

import java.util.HashSet;

/**
 * @author nikolai.tarasevich
 */
public class Dfs {

    public static boolean hasPath(Node source, Node destination) {
        System.out.println("Start searching");
        return hasPath(source, destination, new HashSet<>());
    }

    public static boolean hasPath(Node source, Node destination, HashSet<Node> visited) {
        if (visited.contains(source)) {
            return false;
        }
        visited.add(source);

        System.out.print(source.getId() + " ");
        if (source.getId() == destination.getId()) {
            return true;
        }

        for (Node node : source.getAdjacent()) {
            if (hasPath(node, destination, visited)) {
                return true;
            }
        }
        return false;
    }
}
