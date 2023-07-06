package Programmers_Lv1;



public class 시저암호 {
    public static void main(String[] args) {
        String a = "AB";
        String b = "AaZz";
        String c = "a B z";

        System.out.println(solution(b,25));
    }
    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)+n>=97 && s.charAt(i)+n<=122 || s.charAt(i)+n>=65 && s.charAt(i)+n<=90 ){
                answer+=(char)(s.charAt(i)+n);
            }else if(s.charAt(i)==' '){
                answer += s.charAt(i);
            }else{
                answer+=(char)(s.charAt(i)-26+n);
            }
        }
        return answer;
    }
}