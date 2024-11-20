package 백준;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10974모든순열 {
    static int N;
    static boolean[] check;
    static int[] checkArr;
    static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());

        checkArr=new int[N];
        check=new boolean[N];

        permu(0);
        System.out.println(sb.toString());
	}
    
    public static void permu(int tgt){
        if(tgt==N){
            for(int i=0;i<N;i++){
                sb.append(checkArr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;  
        }
        for(int i=0;i<N;i++){
            if(check[i]) continue;//선택되지 않고 남은 것 중에서

            check[i]=true;//선택하여
            checkArr[tgt]=i+1;//저장
            permu(tgt+1);//다음 위치
            check[i]=false;//tgt 이하 재귀 다 돌면 선택 해제
        }
    }
}

