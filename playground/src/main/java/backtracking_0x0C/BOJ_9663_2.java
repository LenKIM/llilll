package backtracking_0x0C;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_9663_2 {
    static boolean[][] a;
    static int n;
    static int ans = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        a = new boolean[16][16];
        for (boolean[] booleans : a) {
            Arrays.fill(booleans, false);
        }
        calc(0);
        System.out.println(ans);
    }

    public static boolean check(int row, int col) {
        // 일직선
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            if (a[i][col]) return false;
        }

        //왼쪽 위 대각선
        int x = row - 1;
        int y = col - 1;
        while (x >= 0 && y >= 0) {
            if (a[x][y] == true) {
                return false;
            }
            x -= 1;
            y -= 1;
        }
        // 오른쪽 위 대각선
        x = row - 1;
        y = col + 1;
        while (x >= 0 && y < n) {
            if (a[x][y] == true) {
                return false;
            }
            x -= 1;
            y += 1;
        }
        return true;
    }

    static void calc(int row) {
        if (row == n) {
            ans += 1;
        }
        for (int col = 0; col < n; col++) {
            a[row][col] = true;
            if (check(row, col)) {
                calc(row + 1);
            }
            a[row][col] = false;
        }
    }
}
