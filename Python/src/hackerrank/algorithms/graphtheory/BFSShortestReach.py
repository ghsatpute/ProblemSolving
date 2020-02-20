__author__ = 'Ganesh'


# Enter your code here. Read input from STDIN. Print output to STDOUT
class Graph:
    """Represents graph using adjancency list implementation
    """
    def __init__(self, num_nodes):
        self.num_nodes = num_nodes
        self.adj_list = [list() for i in range(num_nodes)]

    def add_edge(self, source, dest):
        assert(isinstance(source, int))
        assert(isinstance(dest, int))
        source -= 1
        dest -= 1
        if self.num_nodes <= source:
            raise Exception("Index {} cannot be greater than size of graph ".format(source))
        if self.num_nodes <= dest:
            raise Exception("Index {} cannot be greater than size of graph ".format(dest))
        if not self.has_edge(source, dest):
            self.adj_list[source].append(dest)
        if not self.has_edge(dest, source):
            self.adj_list[dest].append(source)

    def has_edge(self, source, dest):
        assert(isinstance(source, int))
        assert(isinstance(dest, int))
        source -= 1
        dest -= 1
        if self.num_nodes <= source:
            raise Exception("Index {} cannot be greater than size of graph ".format(source))
        if self.num_nodes <= dest:
            raise Exception("Index {} cannot be greater than size of graph ".format(dest))
        return dest in self.adj_list[source]

    def get_neighbours(self, source):
        source -= 1
        assert(isinstance(source, int))
        return self.adj_list[source]

class DFS:
    def __init__(self, graph, source):
        assert(isinstance(graph, Graph))
        assert(isinstance(source, int))
        source -= 1
        if source >= graph.num_nodes:
            raise Exception("Index {} cannot be greater than size of graph ".format(source))
        # Is node visited
        self.visited = [False for i in range(graph.num_nodes)]
        # Stores path lengths
        self.path_lens = [-1 for i in range(graph.num_nodes)]
        # Stores parent in the path
        self.parent = [-1 for i in range(graph.num_nodes)]
        self.parent[source] = source
        self.path_lens[source] = 0
        self._dfs(graph, source)

    def _dfs(self, graph, source, path_len=0):
        assert(isinstance(graph, Graph))
        assert(isinstance(source, int))
        self.visited[source] = True
        self.path_lens[source] = path_len
        path_len += 1
        for node in graph.get_neighbours(source + 1):
            if not self.visited[node]:
                self.parent[node] = source
                self._dfs(graph, node, path_len)

f = open("C:/Users/Ganesh/Desktop/test_input")

num_test_cases = int(f.readline())

for i in range(num_test_cases):
    n, m = map(int, f.readline().split(' '))
    g = Graph(n)
    # Read all edges
    for j in range(m):
        src, dest = map(int, f.readline().split(' '))
        g.add_edge(src, dest)
    s = int(f.readline())
    d = DFS(g, s)
    #print d.path_lens
    #print d.path_lens[0:s-1]
    o = d.path_lens[0:s-1]
    o.extend(d.path_lens[s:n])
    for k in o:
        if k != -1:
            print k*6,
        else:
            print -1,
    print
    #print " ".join(map(str, d.path_lens[0:s-1])), " ".join(map(str, d.path_lens[s:n]))

f.close()
