package recursive_0x0B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * * 재귀을 통해서 White 또는 Blue 의 카운트를 한다.
 * *
 */
public class BOJ_2630 {

    private static int WHITE = 0;
    private static int BLUE = 0;
    private static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(WHITE);
        System.out.println(BLUE);
    }

    private static void partition(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                WHITE++;
            } else {
                BLUE++;
            }
            return;
        }

        int newSize = size / 2; // 절반 사이즈

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    private static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
