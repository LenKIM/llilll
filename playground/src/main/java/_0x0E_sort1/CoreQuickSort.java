package _0x0E_sort1;

import java.util.Arrays;

public class CoreQuickSort {
    static int[] arr = {15, 25, 22, 357, 16, 23, -53, 12, 46, 3};
    static int N = 10;

    public static void main(String[] args) {
        quickSort(0, N);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int st, int en) {
        if (en <= st+1) return;
        int pivot = arr[st];
        int l = st+1; // 포인트 L
        int r = en-1; // 포인트 R

        while (true) {
            while (l <= r && arr[l] <= pivot) l++;
            while (l <= r && arr[r] >= pivot) r--;
            if (l > r) break;
            swap(l, r);
        }
        swap(st, r);
        quickSort(st, r);
        quickSort(r+1, en);
    }

    private static void swap(int l, int r) {
        int a = arr[l];
        arr[l] = arr[r];
        arr[r] = a;
    }
}
