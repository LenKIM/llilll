package binarysearch;

import java.io.*;
import java.util.Arrays;

public class BOJ_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] is = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            is[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(is);



        int M = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String value : m) {
            int i1 = Integer.parseInt(value);
            if (Arrays.binarySearch(is, i1) < 0) {
                sb.append(0 + "\n");
            } else {
                sb.append(1 + "\n");
            }
        }

        System.out.print(sb);
    }
}
