package _0x0C_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15654_nm5 {
    private static int N;
    private static int M;

    private static final int[] arr = new int[10];
    private static final int[] num = new int[10];
    private static final boolean[] isUsed = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        StringTokenizer numbers = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
                num[i] = Integer.parseInt(numbers.nextToken());
        }
        Arrays.sort(num, 0, N);
        func(0);

    }

    private static void func(int k) {
        if (k == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(num[arr[i]]).append(" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                func(k+1);
                isUsed[i] = false;
            }
        }
    }

}
