package Programmers_Lv1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int a[] = {1,3,2,5,4};
        int b[] = {2,2,3,3};

        System.out.println(solution(a,9));
        System.out.println(solution(a,10));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int total=0;

        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            if(total+d[i]<=budget){
                total +=d[i];
                answer++;
            }
        }

        return answer;
    }

}
