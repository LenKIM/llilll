package _0x0E_sort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * * 10,000,000 개의 갯수
 * *
 * 수는 10,000보다 작거나 같은 자연수*
 * 카운팅 정렬을 사용한다.*
 */
public class BOJ_10989_수_정렬하기3 {

    public static void main(String[] args) throws IOException {
        int [] cnt= new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
