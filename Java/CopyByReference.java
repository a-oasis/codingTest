package Java;

public class CopyByReference {
    public static int solution(String[] user_id,String[] banned_id){
        //배열 copy by reference shallow copy 값 같이 바뀜
        int answer = 0;
        
        for (int i = 0; i < user_id.length; i++) {//수정 가능
            user_id[i]="d";
        }
        for ( String string : user_id) {//값 추출만 가능 접근 수정 불가
            System.out.println(string);
        }
        return answer;
    }

    // public static void main(String[] args){
    //     solution(null, null);
    // }
    
}
