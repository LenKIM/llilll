package _0x0E_sort1;

import java.util.Arrays;

public class CoreMergeSort {

    static int n = 10;
    static int[] arr = new int[]{15, 25, 22, 357, 16, 23, -53, 12, 46, 3};
    static int[] tmp = new int[arr.length];

    public static void main(String[] args) {
        mergeSort(0, n);
        System.out.println(Arrays.toString(arr));

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
            if (rightIndex == en) tmp[i] = arr[leftIndex++];
            else if (leftIndex == mid) tmp[i] = arr[rightIndex++];
            else if (arr[leftIndex] <= arr[rightIndex]) tmp[i] = arr[leftIndex++];
            else tmp[i] = arr[rightIndex++];
        }

        if (en - st >= 0) System.arraycopy(tmp, st, arr, st, en - st);
    }
}
