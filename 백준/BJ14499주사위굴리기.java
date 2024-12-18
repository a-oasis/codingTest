package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ14499주사위굴리기 {
    static int[][] xys={
        {0,0},
        {1,0},
        {-1,0},
        {0,-1},
        {0,1}
    };
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int[][] board=new int[M][N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                board[i][j]=Integer.parseInt(st.nextToken());
            }        
        }

        List<Integer> directs=new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int direct=Integer.parseInt(st.nextToken());
            directs.add(direct);
        }    
        
    }
}
