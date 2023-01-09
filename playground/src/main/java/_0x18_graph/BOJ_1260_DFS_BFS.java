package _0x18_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260_DFS_BFS {

    private static int N, M, ST;
    private static boolean[] vis;
    private static ArrayList[] adj;

    // 비재귀 DFS
    static void dfs1() {
        Stack<Integer> s = new Stack<>();
        s.push(ST);
        while (!s.isEmpty()) {
            int cur = s.pop();
            if (vis[cur]) continue;
            vis[cur] = true;
            System.out.println(cur);

            for (int i = 0; i < adj[cur].size(); i++) {
                int nxt = (int) adj[cur].get(adj[cur].size() - 1 - i);
                if (vis[nxt]) continue;
                s.push(nxt);
            }
        }
    }

    // 재귀 DFS
    void dfs2(int cur) {
        vis[cur] = true;
        System.out.println(cur);
        List<Integer> arrayList = adj[cur];
        for (Integer nxt : arrayList) {
            if (vis[nxt]) continue;
            dfs2(nxt);
        }
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(ST);
        vis[ST] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.println(cur);
            for (Object o : adj[cur]) {
                int o1 = (int) o;
                if (vis[o1]) continue;
                q.add(o1);
                vis[o1] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ST = Integer.parseInt(st.nextToken());

        adj = new ArrayList[M + 1];
        for (int i = 1; i <= M; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        vis = new boolean[M + 1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        // 번호가 작은 것부터 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            ArrayList arrayList = adj[i];
            Collections.sort(arrayList);
        }
        dfs1();
        System.out.println();
        Arrays.fill(vis, false);
        bfs();
    }
}
