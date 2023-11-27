/*
2. 대소문자 변환
설명:
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력:
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력:
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

예시 입력1:
StuDY

예시 출력1:
sTUdy
 */

package section01_String;

import java.util.Scanner;

public class Question02 {
    public String solution(String str){
        String answer = "";

        //방법1
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        //방법2: 아스키코드 사용
        //대문자(65~90), 소문자(97~122) --> 대소문자 차이 32
        for(char c : str.toCharArray()){
            if(c >= 97 && c <= 122) answer += (char)(c-32);
            else answer += (char)(c+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Question02 T = new Question02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
