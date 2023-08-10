def allSourceToTarget(graph):
  paths = []
  route = [0]
  def dfs(graph, source, destination, route, paths):
    if source == destination:
      paths.append(route.copy())
      return
    for element in graph[source]:
      route.append(element)
      dfs(graph, element, destination, route, paths)
      route.remove(element)
  dfs(graph, 0, len(graph) - 1, route, paths)
  return paths

print(allSourceToTarget([[4, 3, 1], [3, 2, 4], [3], [4], []]))
 


