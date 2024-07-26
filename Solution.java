public class Solution {
    public static int solution(String[] user_id,String[] banned_id){
        //배열 copy by reference shallow copy 값 같이 바뀜
        int answer = 0;
        
        for (int i = 0; i < user_id.length; i++) {
            user_id[i]="d";
        }
        for ( String string : user_id) {
            System.out.println(string);
        }
        return answer;
    }

    // public static void main(String[] args){
    //     solution(null, null);
    // }
    
}
