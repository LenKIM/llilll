package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] L = new int[M];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < M; i++) {
            L[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, L[i]); // 최대 길이 구함
        }

        int left = 0;
        int right = max;

        while (right > left) {
            int mid = (right + left) / 2;
            long sum = 0;
            for (int j : L) {
                int i1 = j - mid;
                if (i1 < 0) continue;
                sum += i1;
            }

            if (sum < N) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        System.out.println(left-1);
    }
}
