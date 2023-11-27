/*
5. 특정 문자 뒤집기
설명:
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력:
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력:
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

예시 입력1:
a#b!GE*T@S

예시 입력2:
S#T!EG*b@a
 */

package section01_String;

import java.util.*;

public class Question05 {
    public String solution(String str) {
        String answer = "";

        char[] charArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt < rt){
            if (!Character.isAlphabetic(charArr[lt])){
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])){
                rt--;
            } else {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);

        return answer;
    }

    public static void main(String[] args) {
        Question05 T = new Question05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
