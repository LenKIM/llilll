package _0x18_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_5567_결혼식 {

    private static int N, M;
    private static boolean[] vis;
    private static ArrayList[] adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList();
        }
        vis = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs();
        System.out.println(ans);
    }

    static int ans = 0;

    private static void dfs() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        while (!s.isEmpty()) {
            int cur = s.pop();
            vis[cur] = true;
            for (Object nxt : adj[cur]) {
                int nxt1 = (int) nxt;
                if (vis[nxt1]) continue;
                vis[nxt1] = true;
                ans++;
                if (cur == 1) s.push(nxt1);
            }
        }
    }
}
