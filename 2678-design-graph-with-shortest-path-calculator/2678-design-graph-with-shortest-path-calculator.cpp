class Graph {
private:
    int numNodes;
    vector<vector<pair<int, int>>> adjacencyList;

public:
    Graph(int n, vector<vector<int>>& edges) : numNodes(n), adjacencyList(n) {
        for (const vector<int>& edge : edges) {
            addEdge(edge);
        }
    }

    void addEdge(vector<int> edge) {
        int node1 = edge[0];
        int node2 = edge[1];
        int weight = edge[2];
        adjacencyList[node1].emplace_back(node2, weight);
        // adjacencyList[node2].emplace_back(node1, weight); // Assuming the graph is directed
    }

    int shortestPath(int node1, int node2) {
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        vector<int> distances(numNodes, numeric_limits<int>::max());
        distances[node1] = 0;
        pq.push({0, node1});

        while (!pq.empty()) {
            int currentDistance = pq.top().first;
            int currentNode = pq.top().second;
            pq.pop();

            for (const pair<int, int>& neighbor : adjacencyList[currentNode]) {
                int neighborNode = neighbor.first;
                int newDistance = currentDistance + neighbor.second;
                if (newDistance < distances[neighborNode]) {
                    distances[neighborNode] = newDistance;
                    pq.push({newDistance, neighborNode});
                }
            }
        }

        return distances[node2] == numeric_limits<int>::max() ? -1 : distances[node2];
    }
};
