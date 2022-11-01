package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기*
 */
public class BOJ_1978 {

    static boolean isPrime(int N) {
        if (N == 1) return false;
        for (int i = 2; i*i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int sum = 0;
        for (String value : s) {
            int i1 = Integer.parseInt(value);
            if (isPrime(i1)) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);

    }
}
