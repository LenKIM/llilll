package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

    public static void main(String[] args) throws IOException {

        boolean[][] visit = new boolean[501][501];

        int[][] graph = new int[501][501];
        int [] dx = {0, 0, -1, 1};
        int [] dy = {1, -1, 0, 0};

        Queue<Node> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int maxSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0 || visit[i][j]) continue;
                count++;
                visit[i][j] = true;
                queue.add(new Node(i, j));
                int area = 0;
                while (!queue.isEmpty()) {
                    area++;
                    Node cur = queue.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int x = cur.getX() + dx[dir];
                        int y = cur.getY() + dy[dir];
                        if (x < 0 || x >= n || y < 0 || y >= m) continue;
                        if (graph[x][y] != 1 || visit[x][y]) continue;
                        visit[x][y] = true;
                        queue.add(new Node(x, y ));
                    }
                }
                maxSize = Math.max(maxSize, area);

            }
        }
        System.out.println(count);
        System.out.println(maxSize);
    }

    private static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
