package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. 테이블 정의하기*
 * D[i][j] = 현재까지 j개의 계단을 연속해서 밟고 i번째 계단까지 올라섰을 때
 * 점수 합의 최댓값, !단 i번째 계단은 반드시 밟아야 함!* *
 * *
 * 2. 점화식 찾기*
 * D[k][1] = ? 현재까지 1개의 계단을 연속해서 밟았다는 의미는 곧 k-1번째 계단을 밟지 않았다는 의미.
 * * 그러면 계단을 한 번에 한 계단씩 또는 두 계단씩 오를 수 있으니, k-2번째 계단을 밟을 수 있다.*
 * D[k][1] = max(D[k-2][1], D[k-2][2]) + S[k]*
 * D[k][2] = D[k-1][1] + S[k]*
 * S[k] 는 k번째 계단에 쓰여진 점수를 의미*
 * 3. 초기값 정하기
 * D[1][1] = S[1], D[1][2] = 0,
 * D[2][1] = S[2], D[2][2] = S[1] + S[2]*
 * *
 */
public class BOJ_2579_계단오르기 {

    private static final int[] s = new int[305];
    private static int n;
    private static final int[][] d = new int[305][3];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(s[1]);
            return;
        }

        d[1][1] = s[1];
        d[1][2] = 0;
        d[2][1] = s[2];
        d[2][2] = s[1] + s[2];

        for (int i = 3; i <= n; i++) {
            d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + s[i];
            d[i][2] = d[i - 1][1] + s[i];
        }

        System.out.println(Math.max(d[n][1], d[n][2]));
    }
}
