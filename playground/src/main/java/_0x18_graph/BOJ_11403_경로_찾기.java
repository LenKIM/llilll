package _0x18_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_11403_경로_찾기 {
    static final int MAX = 987654321;
    private static int N;
    private static boolean[] vis = new boolean[102];
    private static int[][] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N][N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 0) continue;
                input[i][j] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(dfs(i, j) + " ");

            }
            System.out.println();
        }
    }

    private static Integer dfs(int st, int tar) {
        Arrays.fill(vis, false);

        Stack<Integer> s = new Stack<>();
        s.push(st);
        while (!s.isEmpty()) {
            int cur = s.peek();
            s.pop();

            if (vis[cur]) continue;
            if (cur != st) vis[cur] = true;

            for (int nxt = 0; nxt < N; nxt++) {
                if (vis[nxt]) continue;
                if (input[cur][nxt] == 1) {
                    if (nxt == tar) return 1;
                    s.push(nxt);
                }
            }
        }
        return 0;
    }
//
//        for (int k = 0; k < n; k++) { // via
//            for (int i = 0; i < n; i++) { // start
//                for (int j = 0; j < n; j++) { // end
//                    if (input[i][j] > input[i][k] + input[k][j]) {
//                        input[i][j] = 1;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                input[i][j] = input[i][j] == MAX ? 0 : input[i][j];
//                System.out.print(j == n - 1 ? input[i][j] : input[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

}
