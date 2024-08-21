package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649N과M_1 {
    static boolean[] selected;
	static int[] result;
	static int N,M;
	static StringBuilder sb;
    public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		sb=new StringBuilder();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		selected=new boolean[N];
		result=new int[M];
		
		permu(0);
		System.out.print(sb);
	}
    public static void permu(int idx) {
    	if(idx==M) {
    		for(int i=0;i<M-1;i++) {
    			sb.append(result[i]); sb.append(" ");
    			//공백을 초기화 시에만 저장 해두고 
    		}
    		sb.append(result[M-1]); sb.append("\n");
    		return;
    	}
    	for(int i=0;i<N;i++) {
    		if(selected[i]) continue;
    		
    		selected[i]=true;
    		result[idx]=i+1;
    		permu(idx+1);
    		selected[i]=false;
    	}
    }
}

