package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1.테이블 정의하기*
 * D[i][0] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 빨강*
 * D[i][1] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 초롱*
 * D[i][2] = i번째 집까지 칠할 때 비용의 최솟값, 단 i번째 집은 파랑*
 * <p>
 * 2. 점화식 찾기*
 * D[k][0] = min(D[k-1][1], D[k-1][2]) + R[k]*
 */
public class BOJ_1149_RGB거리 {

    private static final int[][] d = new int[1005][3];
    private static final int[] r = new int[1005];
    private static final int[] g = new int[1005];
    private static final int[] b = new int[1005];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            r[i] = Integer.parseInt(st.nextToken());
            g[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        d[1][0] = r[1];
        d[1][1] = g[1];
        d[1][2] = b[1];

        for (int i = 2; i <= n; i++) {
            d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + r[i];
            d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + g[i];
            d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + b[i];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int target = d[n][i];
            if (min > target) {
                min = target;
            }
        }
        System.out.println(min);
    }
}
