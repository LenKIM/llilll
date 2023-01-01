package _0x14_two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1806_부분합 {
    static int N;
    static int S;
    static StringTokenizer st;
    static int[] input;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        input = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

//        int st = 0;
        int en = 0;
        int tot = 0;

//        int length = 0;
        int min = Integer.MAX_VALUE;

        tot = input[0];

        for (int sts = 0; sts < N; sts++) {
            while (en < N && tot < S) {
                en++;
                if (en != N) tot += input[en];
            }
            if (en == N) break;
            min = Math.min(min, en - sts + 1);
            tot -= input[sts];
        }


//        while (st >= en && en < input.length) {
//
//            if (st >= N || en >= N) break;
//
//            int sum = sumFromfrontToRear(input, st, en);
//
//            if (sum >= S) {
//                length = st - en + 1;
//
//                if (min > length) {
//                    min = length;
//                }
//                en = en + 1;
//            } else {
//                st = st + 1;
//            }
//        }

        if (min == Integer.MAX_VALUE) min = 0;

        System.out.println(min);
    }

//    private static int sumFromfrontToRear(int[] input, int front, int rear) {
//        int sum = 0;
//        for (int i = rear; i <= front; i++) {
//            sum += input[i];
//        }
//        return sum;
//    }
}
