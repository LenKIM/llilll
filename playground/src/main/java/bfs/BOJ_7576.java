package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {

    private static final int RIPE = 1;
    private static final int UNRIPE = 0;
    private static final int BLANK = -1;
    private static final int[] dRow = {0, -1, 0, 1};
    private static final int[] dCol = {-1, 0, 1, 0};

    private static int N, M;
    private static int[][] map = new int[1001][1001];
    private static boolean[][] discovered = new boolean[1001][1001];

    public static void main(String[] args) throws IOException {
        Queue<Point> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        boolean isAllRipe = true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {

                int tomato = Integer.parseInt(st.nextToken());
                map[i][j] = tomato;

                if (tomato == RIPE) {
                    queue.add(new Point(i, j));
                    discovered[i][j] = true;
                } else if (tomato == UNRIPE) {
                    isAllRipe = false;
                }
            }
        }


        if (isAllRipe) {
            System.out.println(0);
            return;
        }

        int step = -1;
        while (!queue.isEmpty()) {
            step++;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point u = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nextRow = u.row + dRow[j];
                    int nextCol = u.col + dCol[j];

                    if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= M) continue;
                    if (discovered[nextRow][nextCol]) continue;
                    if (map[nextRow][nextCol] == BLANK) continue;

                    queue.add(new Point(nextRow, nextCol));
                    map[nextRow][nextCol] = RIPE;
                    discovered[nextRow][nextCol] = true;
                }
            }
        }
        System.out.println(checkTomato() ? step : -1);
    }

    private static boolean checkTomato() {

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (map[i][k] == UNRIPE) {
                    return false;
                }
            }
        }
        return true;
    }

    private static class Point {
        int row, col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
