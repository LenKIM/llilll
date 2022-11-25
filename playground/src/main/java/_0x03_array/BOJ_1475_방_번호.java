package _0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475_방_번호 {

    private static final int[] used = new int[10];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int setCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int xx = c - '0';
            used[xx]++;
        }

        int _6_9_sum = used[6] + used[9];
        if (_6_9_sum % 2 == 0) {
            used[6] = _6_9_sum / 2;
            used[9] = _6_9_sum / 2;
        } else {
            used[6] = _6_9_sum / 2 + 1;
            used[9] = _6_9_sum / 2 + 1;
        }

        for (int i : used) {
            setCount = Math.max(setCount, i);
        }
        System.out.println(setCount);
    }
}
