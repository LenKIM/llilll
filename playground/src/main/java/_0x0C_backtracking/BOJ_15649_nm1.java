package _0x0C_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649_nm1 {
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
    private static final boolean[] isused = new boolean[10];

    private static void func(int k) {
        if (k == M) {
//            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isused[i]) {
                arr[k] = i;
                isused[i] = true;
                func(k + 1);
                isused[i] = false;
            }
        }
    }
}
