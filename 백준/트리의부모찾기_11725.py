N=int(input())

adjs=[[] for _ in range(N)]
for i in range(N):
    a,b=map(int,input().split)
    adjs[a].append(b)
    adjs[b].append(a)

parents=[N]

def dfs(adjs,n):
    for node in adjs:
        if node 





