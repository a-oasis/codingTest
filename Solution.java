import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(String[] userIds,String[] bannedIds){
        //배열 copy by reference shallow copy 값 같이 바뀜
        int answer = 0;

        ArrayList<String> candidates=new ArrayList<>();
        
        //후보 추출
        //user_id 와 banned_id 유사하면 후보
        for(int i=0;i<userIds.length;i++){
            for(int j=0;j<bannedIds.length;j++){
                if(userIds[i].equals(bannedIds[j])) candidates.add(userIds[i]);
            }
        }

        for(int i=0;i<candidates.size();i++){
            
        }
        
        return answer;
    }

    // public static void main(String[] args){
    //     solution(null, null);
    // }
    
}
