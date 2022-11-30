package _0x10_DP;

import java.util.Scanner;

public class BOJ_9095_1_2_3더하기 {
    static int[] d = new int[20];

    public static void main(String[] args) {
        // 1. 테이블 정의하기
        // 2. 점화식 찾기
        // D[4] =

        // D[3] +
        // D[2] +
        // D[1]
        // D[i] = D[i-1] + D[i-2] + D[i-3];

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());

        System.out.println(d[i]);


    }
}
