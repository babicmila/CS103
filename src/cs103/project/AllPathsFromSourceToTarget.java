package cs103.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Dat je usmereni aciklični graf (directed acyclic graph - DAG) sa n čvorova
 * označenih od 0 do n - 1. Naći sve moguće putanje od čvora 0 do čvora n - 1 i
 * vratiti ih u bilo kom redosledu.
 */
public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> results = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        int goalNode = graph.length - 1;

        queue.add(Arrays.asList(0));

        while (!queue.isEmpty()) {

            List<Integer> putanja = queue.poll();

            int lastNode = putanja.get(putanja.size() - 1);

            if (lastNode == goalNode) {
                results.add(new ArrayList<>(putanja));

            } else {

                int[] neighbors = graph[lastNode];

                for (int neighbor : neighbors) {

                    List<Integer> list = new ArrayList<>(putanja);
                    list.add(neighbor);
                    queue.add(list);
                }
            }

        }
        return results;
    }

}
