package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * * 경로 추적 문제.
 * 값 테이블(D)
 * 경로 복원용 테이블(pre)* *
 */
public class BOJ_12852_1로만들기2 {

    private static int[] d;
    private static int[] pre;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int xx = Integer.parseInt(br.readLine());
        d = new int[xx + 1];
        pre = new int[xx + 1];

        d[1] = 0;
        for (int i = 2; i <= xx; i++) {
            d[i] = d[i - 1] + 1;
            pre[i] = i - 1;

            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {

                d[i] = d[i / 2] + 1;
                pre[i] = i / 2;
            }
            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
                d[i] = d[i / 3] + 1;
                pre[i] = i / 3;
            }
        }

        System.out.println(d[xx]);
        int cur = xx;
        while (true) {
            System.out.println(cur);
            if (cur == 1) break;
            cur = pre[cur];
        }

    }
}
