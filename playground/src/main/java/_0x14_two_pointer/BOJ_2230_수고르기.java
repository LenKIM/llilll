package _0x14_two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 직관적인 이중 for 문에서 어떻게 이중포인터를 쓰는가?
 * 1. i가 증가함에 따라 a[j] - a[i]가 m 이상이 되는 최초의 지점 j 또한 증가한다.
 * 2. 각 i에 대해 a[j] - a[i]가 m 이상이 되는 최초의 지점 j를 찾은 이후에는 a[j+1], a[j+2],
 * ... 을 확인할 필요가 없다.
 */
public class BOJ_2230_수고르기 {

    public static void main(String[] args) throws IOException {


//        int n = 10;
//        int m = 6;
//        int ans = 0;
//        int[] a = new int[10];
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (a[j] - a[i] >= m) {
//                    ans = Math.min(ans, a[j] - a[i]);
//                }
//            }
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);

        int en = 0;
        int min = Integer.MAX_VALUE;
        for (int st = 0; st < n; st++) {
            while (en < n && a[en] - a[st] < m) en++;
            if (en == n) break;
            min = Math.min(min, a[en] - a[st]);
        }
        System.out.println(min);
    }
}
