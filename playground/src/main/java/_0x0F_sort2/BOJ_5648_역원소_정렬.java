package _0x0F_sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5648_역원소_정렬 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[1000000];

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(sc.nextLong());
            sb.reverse();
            arr[i] = Long.parseLong(sb.toString());
        }

        Arrays.sort(arr, 0 , N);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
