package _0x0F_sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15688_수정렬하기5 {

    public static void main(String[] args) throws IOException {
        int [] cnt= new int[2_000_001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine()) + 1_000_000]++;
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 2_000_000; i++) {
            while (cnt[i] > 0) {
                sb.append(i - 1_000_000).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
