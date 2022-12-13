package _0x0F_sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11652_카드 {
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        long [] a = new long[10005];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);
        int cnt = 0;
        long mxVal = -(1L << 62) -1;
        int mxCnt = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 || a[i-1] == a[i]) cnt++;
            else  {
                if (cnt > mxCnt) {
                    mxCnt = cnt;
                    mxVal = a[i-1];
                }
                cnt = 1;
            }
        }
        if (cnt > mxCnt) mxVal = a[N-1];
        System.out.println(mxVal);
    }
}
