package binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_2293 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        ArrayList<Integer> two = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                two.add(a[i] + a[j]);
            }
        }

        int[] twos = two.stream().sorted().mapToInt(b -> b).toArray();

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int key = a[i] - a[j];
                int i1 = Arrays.binarySearch(twos, key);
                if (i1 >= 0) {
                    System.out.print(a[i]);
                    return;
                }
            }
        }
    }
}
