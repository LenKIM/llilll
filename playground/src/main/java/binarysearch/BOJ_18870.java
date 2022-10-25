package binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_18870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int [] input = new int[N];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(s[i]);
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
                arrayList.add(input[i]);
        }

        int[] ints = arrayList.stream()
                .distinct()
                .sorted()
                .mapToInt(a -> a)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {

            int idx = Arrays.binarySearch(ints, input[i]);
            if (i == input.length-1) {
                sb.append(idx);
            } else sb.append(idx + " ");
        }

        System.out.println(sb);
    }
}
