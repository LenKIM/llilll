package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_4179 {


    private final static char WALL = '#';
    private final static char FIRE = 'F';
    private final static char BLANK = '.';
    private final static int[] dRow = {0, 0, -1, 1};
    private final static int[] dCol = {1, -1, 0, 0};

    private static char[][] map;
    private static boolean[][] isVisited;
    private static boolean[][] isFireVisited;
    private static int R, C;
    private static final String CANT = "IMPOSSIBLE";
    private static Point current;
    private static Point fire;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        isVisited = new boolean[R][C];
        isFireVisited = new boolean[R][C];

        Queue<Point> fq = new LinkedList<>();
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);

                if (map[i][j] == 'J') {
                    current = new Point(i, j);
                    isVisited[i][j] = true;
                    q.add(current);
                }

                if (map[i][j] == 'F') {
                    fire = new Point(i, j);
                    isFireVisited[i][j] = true;
                    fq.add(fire);
                }
            }
        }
        int step = -1;

        while (!q.isEmpty()) {
            step++;

            if (!fq.isEmpty()) {
                int size = fq.size();
                for (int i = 0; i < size; i++) {
                    Point firePoint = fq.poll();

                    for (int j = 0; j < 4; j++) {
                        int nextCol = firePoint.col + dCol[j];
                        int nextRow = firePoint.row + dRow[j];

                        if (nextRow < 0 || nextCol < 0 || nextRow >= R || nextCol >= C) continue;
                        if (isFireVisited[nextRow][nextCol]) continue;
                        if (map[nextRow][nextCol] == WALL) continue;

                        map[nextRow][nextCol] = FIRE;
                        isFireVisited[nextRow][nextCol] = true;
                        fq.add(new Point(nextRow, nextCol));
                    }
                }
            }

            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point cur = q.poll();

                if (cur.row == 0 || cur.col == 0 || cur.row == R - 1 || cur.col == C - 1) {
                    System.out.println(step + 1);
                    return;
                }
                for (int j = 0; j < 4; j++) {
                    int nextCol = cur.col + dCol[j];
                    int nextRow = cur.row + dRow[j];

                    if (nextRow < 0 || nextCol < 0 || nextRow >= R || nextCol >= C) continue;
                    if (isVisited[nextRow][nextCol]) continue;
                    if (map[nextRow][nextCol] == WALL) continue;
                    if (map[nextRow][nextCol] == FIRE) continue;

                    isVisited[nextRow][nextCol] = true;
                    q.add(new Point(nextRow, nextCol));
                }
            }
        }
        System.out.println(CANT);
    }

    private static class Point {
        int row, col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
