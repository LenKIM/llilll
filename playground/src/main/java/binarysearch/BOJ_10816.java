package binarysearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10816 {
    static final List<Integer> nlist = new ArrayList<>();

    private static int lowerBound(int num) {
        int min = 0;
        int max = nlist.size();

        // min과 max가 같아질 때 까지 반복
        while (min < max) {
            int half = (min + max) / 2;

            if (num <= nlist.get(half)) {
                max = half;
            } else {
                min = half + 1;
            }
        }

        return min;
    }

    private static int uppderBound(int num) {
        int min = 0;
        int max = nlist.size();

        // min과 max가 같아질 때 까지 반복
        while (min < max) {
            int half = (min + max) / 2;

            if (num < nlist.get(half)) {
                max = half;
            } else {
                min = half + 1;
            }
        }

        return min;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nlist.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nlist);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            sb.append(uppderBound(num) - lowerBound(num) + " ");
        }

        System.out.println(sb);
    }
}
