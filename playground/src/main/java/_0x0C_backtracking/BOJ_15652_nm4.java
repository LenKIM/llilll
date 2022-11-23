package _0x0C_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652_nm4 {
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        func(0);

    }

    private static final int[] arr = new int[10];

    private static void func(int k) {
        if (k == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }
        int st = 1;
        if (k != 0) st = arr[k-1];
        for (int i = st; i <= N; i++) {
                arr[k] = i;
                func(k + 1);
        }
    }

}
