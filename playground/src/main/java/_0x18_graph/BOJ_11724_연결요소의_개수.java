package _0x18_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11724_연결요소의_개수 {

    private static boolean[] vis;
    private static ArrayList[] adj;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        vis = new boolean[N + 1];
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        int num = 0;
        for (int i = 1; i <= N; i++) {
            if (vis[i]) continue;
            num++;
            Deque<Integer> q = new ArrayDeque<>();
            q.add(i);
            vis[i] = true;
            while (!q.isEmpty()) {
                int cur = q.pollFirst();
                List<Integer> list = adj[cur];
                for (Integer nxt : list) {
                    if (vis[nxt]) continue;
                    q.push(nxt);
                    vis[nxt] = true;
                }
            }
        }
        System.out.println(num);
    }
}
