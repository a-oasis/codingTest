import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class Comparator{
        static public boolean equals(String id,String compareId){
            if(id.length()!=compareId.length()) return false;

            for(int i=0;i<compareId.length();i++){
                if(id.charAt(i)=='*') continue;
                if(id.charAt(i)!=compareId.charAt(i)) return false;
            }
            return true;
        }
    }

    public static int solution(String[] userIds,String[] bannedIds){
        //배열 copy by reference shallow copy 값 같이 바뀜
        int answer = 0;

        List<List<Integer>> candidateList=new ArrayList<>(userIds.length);
        
        //후보 추출
        //user_id 와 banned_id 유사하면 후보
        for(int i=0;i<userIds.length;i++){
            List<Integer> candidates=new ArrayList<>();
            for(int j=0;j<bannedIds.length;j++){
                if(Comparator.equals(userIds[i],bannedIds[j])){
                    candidates.add(j);
                }
            }
            candidateList.add(candidates);
        }

        for(int i=0;i<userIds.length;i++){
            if(userIds[i].equals(candidateList))
        }
        
        return answer;
    }

    // public static void main(String[] args){
    //     solution(null, null);
    // }
    
}
