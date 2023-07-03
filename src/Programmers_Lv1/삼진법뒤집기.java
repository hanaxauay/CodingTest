package Programmers_Lv1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        int a = 45;

        System.out.println(solution(a));
    }
    // E2, s2, w1
    public static int solution(int a) {
        String ternary = Integer.toString(a,3); // 3진법으로 변환
        String reverse  = ""; // 뒤집은 수를 담기
        int answer=0;

        for(int i=ternary.length()-1; i>=0; i--){
            reverse += ternary.charAt(i);
        }
        System.out.println(reverse);

        answer = Integer.parseInt(reverse,3);

        return answer;
    }
}