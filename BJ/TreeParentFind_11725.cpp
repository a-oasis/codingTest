#include <iostream>
#include <vector>
using namespace std;

int N;
vector<vector<int>> adjs;
int* parents;
bool* visited;

void dfs(int from){
    visited[from]=true;
    for(int to:adjs[from]){
        if(visited[to]==false) {
            parents[to]=from;
            dfs(to);
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin>>N;
    
    parents=new int[N+1];//0 dummy
    visited=new bool[N+1];
    adjs.resize(N+1);

    for (int i = 1; i <= N; i++) {
        parents[i] = 0;
        visited[i] = false;
    }
    
    
    for(int i=1;i<=N;i++){
        int a,b;cin>>a>>b;
        adjs[a].push_back(b);
        adjs[b].push_back(a);
    }
    
    dfs(1);
    
    for(int i=2;i<=N;i++){
        cout<<parents[i]<<endl;
    }
    
    return 0;
}


