package _0x0E_sort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * * 절댓값이 1,000,000 이다.
 */
public class BOJ_2750_수_정렬하기2 {

    private static int N;
    private static int[] input;
    private static int[] tmp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        input = new int[N];
        int x  = N;
        tmp = new int[N];
        int i = 0;
        while (N-- > 0) {
            input[i] = Integer.parseInt(br.readLine());
            i++;
        }

        mergeSort(0, x);

        for (int k : input) {
            System.out.println(k);
        }
    }

    private static void mergeSort(int st, int en) {
        if (en == st + 1) return;
        int mid = (st + en) / 2;
        mergeSort(st, mid);
        mergeSort(mid, en);
        merge(st, en);
    }

    private static void merge(int st, int en) {
        int mid = (st + en) / 2;
        int leftIndex = st;
        int rightIndex = mid;

        for (int i = st; i < en; i++) {
            if (rightIndex == en) tmp[i] = input[leftIndex++];
            else if (leftIndex == mid) tmp[i] = input[rightIndex++];
            else if (input[leftIndex] <= input[rightIndex]) tmp[i] = input[leftIndex++];
            else tmp[i] = input[rightIndex++];
        }

        if (en - st >= 0) System.arraycopy(tmp, st, input, st, en - st);
    }
}
