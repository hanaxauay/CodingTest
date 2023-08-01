package baekjoon;
import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        int sum=0;

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        long num = sc.nextLong();

        long[] arr = new long[cnt]; // cnt의 크기 만큼 배열 선언

        for(int i=cnt-1; i>=0; i--){ // 연산해서 배열에 값을 넣어줌.
            arr[i] = num%10;
            num /= 10;
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}