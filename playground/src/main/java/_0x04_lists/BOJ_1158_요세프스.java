package _0x04_lists;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제*
 * 11:55*
 */
public class BOJ_1158_요세프스 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] pre = new int[5001];
        int[] nxt = new int[5001];
        int len = 0;
        for (int i = 1; i <= N; ++i) {
            pre[i] = (i == 1) ? N : i - 1;
            nxt[i] = (i == N) ? 1 : i + 1;
            ++len;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<");
        int i = 1;
        for (int cur = 1; len != 0; cur = nxt[cur]) {
            // K번째 일때 제거
            if (i == K) {

                int curNxtIdx = nxt[cur];
                pre[curNxtIdx] = pre[cur];
//                현재 cur 의 nxt 가 현재 cur 의 이전 cur 가 된다.
                int curPreIdx = pre[cur];
                nxt[curPreIdx] = nxt[cur];
//                이전 cur 의 idx 가 cur 의 nxt 의 idx가 된다.
                if (len == 1) {
                    builder.append(cur);
                } else {
                    builder.append(cur).append(", ");
                }
                i = 1;
                --len;
            } else ++i;
        }
        builder.append(">");

        bw.write(builder.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
