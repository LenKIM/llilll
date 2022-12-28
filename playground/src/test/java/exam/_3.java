package exam;

import java.util.Arrays;

public class _3 {

    public static void main(String[] args) {

        int[] axc = new int[]{1,2,3};
        solution(10000);
    }
    // 틀린 코드 찾기
    // 그래프 기초
    // 구현문제
    public static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print == 1) {
//                System.out.print(N % 10);
            }
            System.out.print(enable_print);
            N = N / 10;
            enable_print = N % 10;
        }
    }
}
