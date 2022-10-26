package binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_1822 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        String[] s1 = br.readLine().split(" ");
        int[] ints = new int[s1.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(s1[i]);
        }

        Arrays.sort(ints);

        String[] s2 = br.readLine().split(" ");
        int[] ints2 = new int[s2.length];

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = Integer.parseInt(s2[i]);
        }

        Arrays.sort(ints2);

        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            int i1 = Arrays.binarySearch(ints2, anInt);
            if (i1 < 0) {
                ans.add(anInt);
            }
        }

        if (ans.isEmpty()) System.out.println(0);
        else {
            System.out.println(ans.size());
            String collect = ans.stream().map(a -> "" + a).collect(Collectors.joining(" "));
            System.out.print(collect);
        }
    }
}
