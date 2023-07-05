package Programmers_Lv1;


import java.util.ArrayList;
import java.util.Collections;

public class 최소직사각형 {
    public static void main(String[] args) {
        int a[][] = {{60,50}, {30,70}, {60,30},{80,40}};
        int b[][] = {{10,7}, {12,3}, {8,15},{14,7},{5,15}};
        int c[][] = {{14,4}, {19,6}, {6,16},{18,7},{7,11}};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }
    public static int solution(int[][] sizes) {
        ArrayList<Integer> moreBig = new ArrayList<Integer>();
        ArrayList<Integer> moreSmall = new ArrayList<Integer>();

        for(int i=0; i< sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                moreBig.add(sizes[i][0]);
                moreSmall.add(sizes[i][1]);
            }else{
                moreBig.add(sizes[i][1]);
                moreSmall.add(sizes[i][0]);
            }
        }
        int max = Collections.max(moreBig);
        int min = Collections.max(moreSmall);

        return max*min;
    }
}