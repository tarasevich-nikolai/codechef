package tarasevich.nikolai.codechef.structure.bfs_dfs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author nikolai.tarasevich
 */
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node {

    private int id;
    private LinkedList<Node> adjacent = new LinkedList<>();

}
