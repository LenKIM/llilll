package recursive;

import java.io.*;

/**
 * 거듭제곱*
 * 12^58 = 4 라면 12^116 = 16 이다*
 */
public class BOJ_1629 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] s1 = s.split(" ");
        long A = Long.parseLong(s1[0]);
        long B = Long.parseLong(s1[1]);
        long C = Long.parseLong(s1[2]);
        long sum = 0;

        sum = pow(A, B, C);

        System.out.println(sum);
    }

    private static long pow(long a, long b, long m) {
        if (b == 1) return a % m;

        long val = pow(a, b / 2, m);
        val = val * val % m;

        if (b % 2 == 0) return val;
        return val * a % m;
    }

    private static long power(long x, long y, long div) {

        long result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = result * x;
                result = result % div;
            }
            x = x * (x % div);
            x = x % div;
            y = y / 2;
        }
        return result;
    }
}
