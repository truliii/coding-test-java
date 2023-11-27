/*
1. 문자 찾기
설명:
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


입력:
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.


출력:
첫 줄에 해당 문자의 개수를 출력한다.

예시 입력1:
Computercoller
c

예시 출력1:
2
 */

package section01_String;

import java.util.Scanner;

public class Question01 {
    public int solution(String str, char t){
        int answer = 0;
        //대소문자 구별하지 않는다. --> str, t 대문자로 변경
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //방법1
        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }

        //방법2
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Question01 T = new Question01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0); //★★★

        System.out.print(T.solution(str, t));
    }
}
