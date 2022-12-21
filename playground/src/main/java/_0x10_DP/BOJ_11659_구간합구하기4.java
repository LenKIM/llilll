package _0x10_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * prefix 성 테크닉을 배울 수 있다.
 * 제한
 * 1 ≤ N ≤ 100,000
 * 1 ≤ M ≤ 100,000
 * 1 ≤ i ≤ j ≤ N*

 * 100억이니까 안된다.*
 * 뭔가 필요하다.*
 * D[i] = A[1] + A[2] + ... + A[i]*
 * D[i] = D[i-1] + A[i]**
 *
 * A[i] + A[i+1] + ... + A[j]
 * = (A[1] + A[2] + ... A[j]) - (A[1] + A[2] + ... + A[i-1])
 * = D[j] - D[i-1]
 * * *
 * 질의를 O(1) 로 끝낼 수 있다.*
 */
public class BOJ_11659_구간합구하기4 {
    private static int n,m;
    private static int [] a;
    private static int [] d;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n+1];
        d = new int[n+1];

        d[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            d[i] = d[i-1] + a[i];
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(d[j] - d[i-1]);
        }

        br.close();
    }
}
