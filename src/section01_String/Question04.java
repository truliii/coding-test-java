/*
4. 단어 뒤집기
설명:
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력:
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력:
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

예시 입력1:
3
good
Time
Big

예시 출력1:
doog
emiT
giB
 */

package section01_String;

import java.util.*;

public class Question04 {
    public ArrayList<String> solution(int num, String[] strArr){
        ArrayList<String> answer = new ArrayList<>();

        //방법1: StringBuilder
        for(String s : strArr){
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        //★★★방법2: 직접 뒤집기
        for(String s : strArr){
            char[] charArr = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while(lt < rt){
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
            String tempStr = String.valueOf(charArr);
            answer.add(tempStr);
        }

        return answer;
    }

    public static void main(String[] args) {
        Question04 T = new Question04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        for(int i=0; i<num; i++){
            strArr[i] = sc.next();
        }
        for(String s : T.solution(num, strArr)){
            System.out.println(s);
        }
    }
}
