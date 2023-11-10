

class Solution {
public:
    std::vector<int> restoreArray(std::vector<std::vector<int>>& adjacentPairs) {
              std::unordered_map<int, std::vector<int>> adj;
        std::unordered_set<int> visited;
        std::vector<int> result;
        int start = 0;

        // Build adjacency list
        for (const auto& pair : adjacentPairs) {
            adj[pair[0]].push_back(pair[1]);
            adj[pair[1]].push_back(pair[0]);
        }

        // Find the start node
        for (const auto& entry : adj) {
            if (entry.second.size() == 1) {
                start = entry.first;
                break;
            }
        }

        // DFS to reconstruct the array
        dfs(adj, visited, result, start);

        return result;
    }

private:
    void dfs(const std::unordered_map<int, std::vector<int>>& adj, std::unordered_set<int>& visited, std::vector<int>& result, int key) {
        if (visited.count(key) > 0) {
            return;
        }

        visited.insert(key);
        result.push_back(key);

        for (int k : adj.at(key)) {
            dfs(adj, visited, result, k);
      }  }
    };
