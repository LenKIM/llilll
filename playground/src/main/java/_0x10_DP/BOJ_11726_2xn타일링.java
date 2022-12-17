package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726_2xn타일링 {
    private static final int [] d = new int[10005];
    private static final int mod = 10007;

    public static void main(String[] args) throws IOException {
        d[1] = 1;
        d[2] = 2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i-1]+ d[i-2]) % mod;
        }

        System.out.println(d[n]);
    }
}
