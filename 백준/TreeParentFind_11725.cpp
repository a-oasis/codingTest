#include <iostream>
#include <vector>
#define MAX 100001

using namespace std;

//메모리 동적할당
int N;
vector<vector<int>> adjs;
int* parents;
bool* visited;

void dfs(int from){
    visited[from]=true;
    for(int to : adjs[from]){
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

    adjs.reserve(N+1);
    parents=new int[N+1]();
    visited=new bool[N+1]();

    
    for(int i=1;i<N;i++){
        int a,b;cin>>a>>b;
        adjs[a].push_back(b);
        adjs[b].push_back(a);
    }
    
    dfs(1);
    
    for(int i=2;i<=N;i++){
        cout<<parents[i]<<"\n";
    }
    
    return 0;
}


