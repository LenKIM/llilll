package binarysearch;

import java.io.*;
import java.util.Arrays;

public class BOJ_10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] ints = new int[N];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(ints);
        int M = Integer.parseInt(br.readLine());

        String[] ms = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ms.length; i++) {
            int i1 = Integer.parseInt(ms[i]);

            int idx = customBinarySearch(ints, i1);

            if (idx >= 0) {
                sb.append("1" + " ");
            } else {
                sb.append("0" + " ");
            }
        }

        System.out.println(sb.toString().trim());
    }

    private static int customBinarySearch(int[] ints, int i1) {

        int low = 0;
        int high = ints.length-1;
        int key = i1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == ints[mid]) {
                return mid;
            } else if (key < ints[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
