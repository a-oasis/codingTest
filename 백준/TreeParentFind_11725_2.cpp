#include <iostream>
#include <vector>

using namespace std;
#define MAX 100001

//메모리 정적 할당
int N;
int parents[MAX];
bool visited[MAX];
vector<int> adjs[MAX];

void dfs(int from) {
    visited[from] = true;
    for (int to : adjs[from]) {
        if (!visited[to]) {
            parents[to] = from;
            dfs(to);
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;

    for (int i = 1; i < N; i++) {
        int a, b;
        cin >> a >> b;
        adjs[a].push_back(b);
        adjs[b].push_back(a);
    }

    dfs(1);

    for (int i = 2; i <= N; i++) {
        cout << parents[i] << "\n";
    }

    return 0;
}
