package recursive_0x0B;

import java.util.Scanner;

/**
 * * 쿼드 트리
 */
public class BOJ_230 {
    private static int[][] img;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        img = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = in.next();

            for (int j = 0; j < N; j++) {
                img[i][j] = str.charAt(j) - '0';
            }
        }

        quadTree(0, 0, N);
        System.out.println(sb);
    }

    private static void quadTree(int x, int y, int size) {

        if (isPossible(x, y, size)) {

            sb.append(img[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append("(");

        quadTree(x, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x + newSize, y + newSize, newSize);
        sb.append(")");
    }


    private static boolean isPossible(int x, int y, int size) {
        int val = img[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (val != img[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
