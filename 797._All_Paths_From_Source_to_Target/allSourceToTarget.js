const allSourceToTarget = (graph) => {
  const paths = [];
  const route = [];
  const dfs = (graph, source, destination, route, paths) => {
    if (source === destination) {
      paths.push([...route]);
      return;
    }
    for (const element of graph[source]) {
      route.push(element);
      dfs(graph, element, destination, route, paths);
      route.pop();
    }
  };
  dfs(graph, 0, graph.length - 1, route, paths);
  return paths;
};

console.log(allSourceToTarget([[4, 3, 1], [3, 2, 4], [3], [4], []]));
