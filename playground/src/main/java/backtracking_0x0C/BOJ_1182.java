package backtracking_0x0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * * 부분 수열의 합
 */
public class BOJ_1182 {

    private static int S;
    private static int N;
    private static int [] arr = new int[30];
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        func(0, 0);
        if (S == 0) cnt--;
        System.out.println(cnt);
    }

    private static void func(int cur, int tot) {
        if (cur == N) {
            if (tot == S) cnt++;
            return;
        }
        func(cur+1, tot);
        func(cur+1, tot+arr[cur]);
    }

//    private static void comb(int n, int r) {
//
//        if (r == 0) {
//            // 더하기 해봄
//            int sum = 0;
//            for (int i = 0; i < temp.length; i++) {
//                sum += temp[i];
//            }
//            if (sum == S) {
//                count++;
//            } else {
//                return;
//            }
//
//        } else if (n < r) {
//
//            return;
//
//        } else {
//            temp[r - 1] = inputs[n - 1];
//            comb(n - 1, r - 1);
//            comb(n - 1, r);
//        }
//
//
//    }
}
