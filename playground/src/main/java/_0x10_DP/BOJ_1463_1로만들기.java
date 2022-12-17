package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463_1로만들기 {

    private static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int xx = Integer.parseInt(br.readLine());
        d = new int[xx + 1];

        d[1] = 0;
        for (int i = 2; i <= xx; i++) {
            d[i] = d[i - 1] + 1;
            if (i % 2 == 0) d[i] = Math.min(d[i], d[i / 2] + 1);
            if (i % 3 == 0) d[i] = Math.min(d[i], d[i / 3] + 1);
        }

        System.out.println(d[xx]);
    }
}
