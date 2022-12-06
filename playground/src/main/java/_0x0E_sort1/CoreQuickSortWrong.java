package _0x0E_sort1;

import java.util.Arrays;

public class CoreQuickSortWrong {

    public static void main(String[] args) {
        int[] arr = {6, -8, 1, 12, 8, 3, 7, -7};
        int[] tmp = new int[8];

        int idx = 0;
        int pivot = arr[0];
        for (int i = 1; i < 8; i++) {
            if (arr[i] <= pivot)
                tmp[idx++] = arr[i];

        }
        tmp[idx++] = pivot;
        for (int i = 1; i < 8; i++) {
            if (arr[i] > pivot) tmp[idx++] = arr[i];
        }

        System.out.println(Arrays.toString(tmp));
    }
}
