package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * parametric search = 조건을 만족하는 최소/최댓값을 구하는 문제(최적화문제)를
 * 결정 문제로 변환해 이분탐색을 수행하는 방법* *
 * (최적화 문제) N개를 만들 수 있는 랜선의 최대 길이
 * (결정 문제) 랜선의 길이가 X일 때 랜선이 N개 이상인가 아닌가?* *
 */

public class P_ParametricSearch_BOJ_1654 {

    static int arr[];
    static int K;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        K = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long st = 1;
        long en = 0x7fffffff;
        while (st < en) {
            long mid = (st + en + 1) / 2;
            if (solve(mid)) st = mid;
            else en = mid - 1;
        }

        System.out.println(st);


    }

    public static boolean solve(long x) {
        long cur = 0;
        for (int i = 0; i < K; i++) {
            cur += (arr[i] / x);
        }
        return cur >= N;
    }
}
