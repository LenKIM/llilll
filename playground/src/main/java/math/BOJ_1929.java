package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    static boolean[] state = new boolean[1000001];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[2000005];
        int i, j;
        isPrime[1] = true;
        for (i = 2; i * i <= end; i++) {
            if (!isPrime[i]) {
                for (j = i * i; j <= end; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        for (int k = start; k <= end; k++) {
            if (!isPrime[k]) {
                System.out.println(k);
            }
        }
    }
}
