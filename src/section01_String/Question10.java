/*
10. 가장 짧은 문자거리
설명:
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력:
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력:
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

예시 입력 1:
teachermode e

예시 출력 1:
1 0 1 2 1 0 1 2 2 1 0
 */
package section01_String;

import java.util.*;

public class Question10 {
    public int[] solution(String str, char t){
        int[] answer = new int[str.length()];
        //왼쪽에 있는 e로부터의 거리와 오른쪽에 있는 e로부터의 거리를 비교하여 작은 수를 거리로 한다.
        int p = 1000; //왼쪽에 e가 없는 경우는 임의의 큰 수를 대입
        //왼쪽에 있는 e로부터의 거리
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t){
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        //오른쪽에 있는 e로부터의 거리
        p = 1000;
        for(int i=str.length() - 1; i>=0; i--){
            if(str.charAt(i) == t){
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); //기존answer에 있는 값과 p중 작은 값을 answer에 저장
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Question10 T = new Question10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for(int x : T.solution(str, t)){
            System.out.print(x + " ");
        }
    }
}
