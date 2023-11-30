/*
6. 뒤집은 소수
설명:
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력:
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력:
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

예시 입력 1:
9
32 55 62 20 250 370 200 30 100

예시 출력 1:
23 2 73 2 3
 */

package section02_Array;

import java.util.*;

public class Question06 {
    //소수인지 확인하는 함수
    public boolean isPrime(int num){
        //1은 소수가 아니다 --> false
        if(num == 1) return false;
        //2부터 자기자신 전까지 약수가 있는 경우 소수가 아니다 --> false
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        //나머지의 경우는 소수다 --> true
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        //arr 값 뒤집기
        for(int i=0; i<n; i++){
            int temp = arr[i];
            int result = 0;
            while(temp > 0){
                int t = temp%10;
                result = result*10 + t;
                temp = temp/10;
            }
            if(isPrime(result)) answer.add(result);
        }

        return answer;
    }

    public static void main(String[] args){
        Question06 T = new Question06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
