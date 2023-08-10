import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinReorderAllowToNavigateFromAnyNodeToZeroNode {
  int reOrder = 0;

  int minReOrder(int[][] graph, int n) {
    Set<Integer> visited = new HashSet<Integer>();
    Map<Integer, List<Integer>> originalAdjacentList = new HashMap<Integer, List<Integer>>();
    Map<Integer, List<Integer>> oppositePathAdjacentList = new HashMap<Integer, List<Integer>>();
    originalAdjacentList = createAdjacentList(graph, n, false);
    oppositePathAdjacentList = createAdjacentList(graph, n, true);
    
    dfs(0, visited, originalAdjacentList, oppositePathAdjacentList);
    return reOrder;
  }

  Map<Integer, List<Integer>> createAdjacentList(int[][] graph, int n, boolean invertPath) {
    Map<Integer, List<Integer>> adjacentList = new HashMap<Integer, List<Integer>>();
    for (int graphNode = 0; graphNode < n; graphNode++) {
      adjacentList.put(graphNode, new ArrayList<Integer>());
    }
    for (int[] edge : graph) {
      if (invertPath) {
        adjacentList.get(edge[1]).add(edge[0]);
      } else {
        adjacentList.get(edge[0]).add(edge[1]);
      }
    }
    return adjacentList;
  }

  void dfs(int source, Set<Integer> visited, Map<Integer, List<Integer>> originalAdjacentList,
      Map<Integer, List<Integer>> oppositePathAdjacentList) {
    visited.add(source);
    for (Integer currentNode : originalAdjacentList.get(source)) {
      if (!visited.contains(currentNode)) {
        reOrder += 1;
        dfs(currentNode, visited, originalAdjacentList, oppositePathAdjacentList);
      }
    }
    for (Integer currentNode : oppositePathAdjacentList.get(source)) {
      if (!visited.contains(currentNode)) {
        dfs(currentNode, visited, originalAdjacentList, oppositePathAdjacentList);
      }
    }
  }

  public static void main(String[] args) {
    MinReorderAllowToNavigateFromAnyNodeToZeroNode instance = new MinReorderAllowToNavigateFromAnyNodeToZeroNode();
    int[][] graph = { { 1, 0 }, { 2, 0 } };
    System.out.println(instance.minReOrder(graph, 3));
  }
}
