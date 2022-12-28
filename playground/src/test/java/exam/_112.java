package exam;

import org.junit.jupiter.api.Test;

public class _112 {

    @Test
    void name() {
//        int solution = solution(1, "");
        int solution = solution(22, "1A 3C 2B 20G 5A");
        System.out.println(solution);
    }

    public int solution(int N, String S) {
        boolean[][] seats = new boolean[N+1][11];
        if (S.isEmpty() == false){
            marked(S, seats);
        }
        int result = 0;
        for (int i = 1; i <= N; i++) {
            boolean[] seat = seats[i];

            // 가능 하면 False , 불가능하면 True
            boolean a = isPossible(seat, 1, 4);
            boolean b = isPossible(seat, 3, 6);
            boolean c = isPossible(seat, 5, 8);

            if (!a) {
                result = result + 1;
            }

            if (!b && a == true) {
                result = result + 1;
            }

            if (!c) {

                if (a == false) {
                    result = result + 1;
                } else if (a == true && b == true) {
                    result = result + 1;
                }
            }
        }

        return result;
    }

    private void marked(String S, boolean[][] seats) {
        String[] s = S.split(" ");
        for (String s1 : s) {
            StringBuilder sb = new StringBuilder();
            char col = 0;
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    col = c;
                }
            }

            int row = Integer.parseInt(sb.toString());

            int colIdx = 0;
            if (col == 'A') {
                colIdx = 0;
            } else if (col == 'B') {
                colIdx = 1;
            } else if (col == 'C') {
                colIdx = 2;
            } else if (col == 'D') {
                colIdx = 3;
            } else if (col == 'E') {
                colIdx = 4;
            } else if (col == 'F') {
                colIdx = 5;
            } else if (col == 'G') {
                colIdx = 6;
            } else if (col == 'H') {
                colIdx = 7;
            } else if (col == 'J') {
                colIdx = 8;
            } else if (col == 'K') {
                colIdx = 9;
            }

            seats[row][colIdx] = true;
        }
    }

    private boolean isPossible(boolean[] seat, int start, int end) {
        boolean isOk = false;
        for (int i = start; i <= end; i++) {
            if (seat[i]) {
                isOk = true;
                break;
            }
        }
        return isOk;
    }
}
