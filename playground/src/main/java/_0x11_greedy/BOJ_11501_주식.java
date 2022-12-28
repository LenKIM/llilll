package _0x11_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11501_주식 {
    private static StringTokenizer stringTokenizer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] days;
        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            stringTokenizer = new StringTokenizer(br.readLine());
            days = new long[n];
            for (int i = 0; i < days.length; i++) {
                days[i] = Long.parseLong(stringTokenizer.nextToken());
            }

            long maxVal = 0;
            long ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (days[i] > maxVal) {
                    maxVal = days[i];
                } else {
                    ans += maxVal - days[i];
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
