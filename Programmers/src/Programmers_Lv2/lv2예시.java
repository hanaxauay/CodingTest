package Programmers_Lv2;

import java.util.ArrayList;

public class lv2예시 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println("lv2:"+solution(arr));
    }
    // E2, s2, w1
    public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> answerList=new ArrayList<>();

        int tmp=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != tmp) {
                answerList.add(arr[i]);
                tmp=arr[i];
            }
        }

        answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}