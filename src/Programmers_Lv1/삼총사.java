package Programmers_Lv1;

import java.util.Arrays;

public class 삼총사 {
    public static void main(String[] args) {
        int a[] = {-2,3,0,2,-5};
        int b[] = {-3,-2,-1,0,1,2,3};
        int c[] = {-1,1,-1,1};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }
    public static int solution(int[] number) {
        int answer = 0;
        int total=0;

        for(int i=0; i<number.length; i++){
            for(int j=0; j<=i; j++){
                for(int k=0; k<=j; k++){
                    if(i==j || j==k || i==k) continue;
                    if( number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }

        return answer;
    }

}
