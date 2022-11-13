package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 최단 경로을 찾는데, 1번에 한해서 벽을 부술 수 있다.
 * * *
 * 3중 배열을 사용하는데, 왜?
 * 벽을 부수고 탐색하는 경우와
 * 벽을 부수지 않고 탐색하는 경우을 나눠야 한다
 * visited[n][m][0] 은 벽은 한번도 안부순 애들
 * visited[n][m][1] 은 벽을 한번 부수고 탐색하는 경우
 * <p>
 * 벽이 아니라면? 부신 벽이 여태까지 없었다면 > visited[?][?][0] 방문 처리 + queue 에 넣음* *
 * 벽이 아니라면? 벽을 한번 부신 적이 있으면 > visited[?][?][1] 방문 처리 + queue 에 넣음* *
 * *
 * 벽이라면? 한번도 벽을 부신 적이 없으면 부수고 > visited[?][?][1] 방문 처리 + queue 에 넣음* *
 * * *
 */

public class BOJ_2206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j);
            }
        }

        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(0, 0, 1, false));

        int[] mi = {0, 0, -1, 1};
        int[] mj = {-1, 1, 0, 0};

        boolean[][][] visited = new boolean[n][m][2];

        while (!q.isEmpty()) {
            Loc cur = q.poll();

            if (cur.i == n - 1 && cur.j == m - 1) {
                System.out.println(cur.cnt);
                return;
            }

            for (int d = 0; d < 4; d++) {
                int ni = cur.i + mi[d];
                int nj = cur.j + mj[d];

                if (ni < 0 || ni >= n || nj < 0 || nj >= m) continue;

                int nextCount = cur.cnt + 1;

                if (map[ni][nj] == '0') { // 벽이 아니면
                    if (notDestroyed(cur) && !visited[ni][nj][0]) { // 부순 벽이 여태까지 없었다면
                        q.add(new Loc(ni, nj, nextCount, false));
                        visited[ni][nj][0] = true;
                    } else if (cur.destroyed && !visited[ni][nj][1]) { // 벽을 이미 한번 부셨더라면
                        q.add(new Loc(ni, nj, nextCount, true));
                        visited[ni][nj][1] = true;
                    }
                } else if (map[ni][nj] == '1') { // 벽이라면?

                    if (notDestroyed(cur)) { // 한번도 벽을 부순적이 없다면 부순다.
                        q.add(new Loc(ni, nj, nextCount, true));
                        visited[ni][nj][1] = true;

                    }
                }
            }

        }
        System.out.println("-1");
    }

    private static boolean notDestroyed(Loc cur) {
        return !cur.destroyed;
    }

    static class Loc {
        int i;
        int j;
        int cnt;
        boolean destroyed;

        public Loc(int i, int j, int cnt, boolean destroyed) {
            this.i = i;
            this.j = j;
            this.cnt = cnt;
            this.destroyed = destroyed;
        }
    }
}
