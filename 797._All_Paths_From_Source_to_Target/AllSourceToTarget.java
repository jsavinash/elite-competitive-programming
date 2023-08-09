import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class AllSourceToTarget {
  List<List<Integer>> allSourceToTarget(int[][] graph) {
    List<List<Integer>> paths = new LinkedList<List<Integer>>();
    List<Integer> route = new ArrayList<Integer>();
    route.add(0);
    dfs(graph, 0, graph.length - 1, route, paths);
    return paths;
  }

  void dfs(int[][] graph, int source, int destination, List<Integer> route, List<List<Integer>> paths) {
    if (source == destination) {
      paths.add(new ArrayList<Integer>(route));
      return;
    }
    for (int current : graph[source]) {
      route.add(current);
      dfs(graph, current, destination, route, paths);
      route.remove(route.size() - 1);
    }
  }

  public static void main(String[] args) {
    int[][] graph = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };
    AllSourceToTarget astt = new AllSourceToTarget();
    List<List<Integer>> paths = astt.allSourceToTarget(graph);
    System.out.println(paths.toString());
  }
}