package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2667 {
    private static int N;
    private static final int[] dRow = {0, -1, 0, 1};
    private static final int[] dCol = {-1, 0, 1, 0};
    private static int[][] map = new int[26][26];
    private static boolean[][] visited = new boolean[26][26];
    private static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String contents = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = contents.charAt(j) - '0';
            }
        }

        int name = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] != 0) {
                    name++;
                    int cnt = dfs(i, j, name, 0);
                    a.add(cnt);
                }
            }
        }
        Collections.sort(a);
        System.out.println(name);
        for (int x : a) {
            System.out.println(x);
        }
    }

    private static int dfs(int row, int col, int name, int count) {
        count++;
        visited[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dRow[i];
            int nextCol = col + dCol[i];

            if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N) continue;
            if (map[nextRow][nextCol] == 0) continue;
            if (visited[nextRow][nextCol]) continue;
            count = dfs(nextRow, nextCol, name, count);
        }
        return count;
    }
}
