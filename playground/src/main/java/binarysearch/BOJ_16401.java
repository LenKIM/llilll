package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16401 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] L = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, L[i]); // 최대 길이 구함
        }

        int result = 0;
        int left = 1;
        int right = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cnt = 0;

            for (int i = 0; i < L.length; i++) {
                // 중앙값으로 과자의 길이를 나누어 나오는 갯수 파악
                cnt += L[i] / mid;
            }

            if (cnt >= M) {
                // 위에서 나눈 갯수가 조카 수보다 같거나 만은 경우
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);

    }
}
