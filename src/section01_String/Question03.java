/*
3. 문장 속 단어
설명:
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

입력:
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

출력:
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
단어를 답으로 합니다.

예시 입력1:
it is time to study

예시 출력1:
study
 */
package section01_String;

import java.util.*;

public class Question03 {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;

        //방법1: split()사용
        String[] strArr = str.split(" ");
        for(String s : strArr){
            int len = s.length();
            if(len > max){
                max = len;
                answer = s;
            }
        }

        //방법2: indexOf(), substring()사용
        int position;
        while((position = str.indexOf(" ")) != -1){ //공백 문자가 없을 때까지 반복문 진행
            String temp = str.substring(0, position);
            int len = temp.length();
            if(len > max) {
                max = len;
                answer = temp;
            }
            str = str.substring(position+1);
        }
        if(str.length() > max) answer = str; //substring 후 남은 마지막 단어의 길이가 max보다 긴 경우

        return answer;
    }

    public static void main(String[] args) {
        Question03 T = new Question03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
