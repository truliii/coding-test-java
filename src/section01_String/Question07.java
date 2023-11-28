/*
7. 회문 문자열
설명:
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.

입력:
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

출력:
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

예시 입력 1:
gooG

예시 출력 1:
YES
 */
package section01_String;

import java.util.*;

public class Question07 {
    public String solution(String str){
        String answer = "NO";

        //방법1: StringBuilder이용하여 뒤집기
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp)) answer = "YES";

        //방법2: 맨 앞과 뒤 글자 직접 비교
        str = str.toUpperCase();
        int len = str.length();
        //방법1: 앞과 뒤의 글자를 짝지어서 직접 비교
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) == str.charAt(len-1-i)) answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args){
        Question07 T = new Question07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
