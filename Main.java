import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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
            if(check[i]) continue;

            check[i]=true;
            checkArr[tgt]=i+1;
            permu(tgt+1);
            check[i]=false;
        }
    }
}
