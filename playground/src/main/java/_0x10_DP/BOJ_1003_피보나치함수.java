package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 1. 테이블 정하기
 * fibo[i][k] = 숫자 i가 k(0 or 1) 를 호출한 횟수*
 * 2. 점화식 찾기*
 * fifo[i][k] = fifo[i-1][k] + fifo[i-2][k]*
 * 3. 초기값 정하기*
 * fifo[0][0] = 1, fibo[1][1] = 1*
 */
public class BOJ_1003_피보나치함수 {
    private static int N;
    private static int T;
    private static int[][] fibo;


    public static void main(String[] args) throws IOException {
        fibo = new int[42][2];
        fibo[0][0] = 1;
        fibo[1][1] = 1;
        for (int i = 2; i <= 40; i++) {
            fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
            fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            System.out.println(fibo[N][0] + " " + fibo[N][1]);
        }

    }
}
