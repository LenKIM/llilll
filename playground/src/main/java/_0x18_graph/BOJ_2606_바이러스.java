package _0x18_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2606_바이러스 {
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
        vis = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        Stack<Integer> s = new Stack<>();
        s.push(1);
        int num = 0;
        while (!s.isEmpty()) {
            int cur = s.pop();
            if (vis[cur]) continue;
            vis[cur] = true;
            num++;

            for (int i = 0; i < adj[cur].size(); i++) {
                int nxt = (int) adj[cur].get(adj[cur].size() - 1 - i);
                if (vis[nxt]) continue;
                s.push(nxt);
            }
        }

        if (num > 0) {
            num = num - 1;
        }
        System.out.println(num);
    }
}
