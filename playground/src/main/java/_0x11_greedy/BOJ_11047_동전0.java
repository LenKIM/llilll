package _0x11_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * D[i] = 가치의 합을 i로 만들 때 필요한 동전 개수의 최솟값
 * D[i] = min(D[i-A1],D[i-A2], .., D[i-An]) + 1
 * > 시간 초과 발생
 * <p>
 * 보조 정리 1
 * 동전을 최소로 소모하면서 물건값을 지불하려면 10/100원 동전을 4개 이하, 50원 동전은 1개 이하로 사용해야 한다.
 * <p>
 * 증명
 * 10/100원 동전을 5개 이상 사용 > 50/500원 동전으로 대체
 * 50원 동전을 2개 이상 사용 > 100원 동전으로 대체
 * <p>
 * 명제
 * 동전을 최소로 소모하면서 물건값을 지불하려면 500원 동전을 최대한 많이 써야 한다.
 * <p>
 * 증명
 * 10, 50, 100원 동전으로는 물건값을
 * 최대 10x4 + 50x1 + 100x4 = 490원만 감당 가능,
 * 500원을 다 사용하지 않을 경우 10, 50, 100원 동전으로 500원 이상 감당해야 함.
 * <p>
 * 배수 관계가 성립하기 때문에 가능한건데, 만약 그렇지 않다면?
 */
public class BOJ_11047_동전0 {
    private static int N, K;
    private static int[] a;

    public static void main(String[] args) throws IOException {
        int ans = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            ans += K / a[i];
            K %= a[i];
        }
        System.out.println(ans);
    }
}
