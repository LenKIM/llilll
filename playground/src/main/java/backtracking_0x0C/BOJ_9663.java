package backtracking_0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N-Queen*
 */
public class BOJ_9663 {

    private static int N;
    private static int cnt = 0;
    private static boolean isUsed1[] = new boolean[40]; // | 방향
    private static boolean isUsed2[] = new boolean[40]; // \ 방향
    private static boolean isUsed3[] = new boolean[40]; // / 방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        // 특정 좌표에 퀀을 어떻게 놓을지 판단하지?

        func(0);
        System.out.println(cnt);
    }

    private static void func(int cur) {
        if (cur == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isUsed1[i]
                    || isUsed2[i + cur]
                    || isUsed3[cur - i + N - 1]
            ) {
                continue; // column 이나 대각선 중에 문제가 있다면
            }

            isUsed1[i] = true;
            isUsed2[i + cur] = true;
            isUsed3[cur - i + N - 1] = true;
            func(cur + 1);
            isUsed1[i] = false;
            isUsed2[i + cur] = false;
            isUsed3[cur - i + N - 1] = false;
        }
    }
}
